
package taskmanager.service;

import taskmanager.entity.Task;
import taskmanager.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public List<Task> getTasksByStatus(String status) {
        return taskRepository.findByStatus(status);
    }

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Page<Task> getAllTasks(int page, int size) {
        return taskRepository.findAll(PageRequest.of(page, size));
    }

    public Page<Task> getAllTasks(int page, int size, Sort sort) {
        return taskRepository.findAll(PageRequest.of(page, size, sort));
    }

    public Optional<Task> getTaskById(Long id) {
        return taskRepository.findById(id);
    }

    public Task updateTask(Long id, Task updatedTask) {
        return taskRepository.findById(id)
                .map(task -> {
                    task.setTitle(updatedTask.getTitle());
                    task.setDescription(updatedTask.getDescription());
                    task.setStatus(updatedTask.getStatus());
                    task.setDueDate(updatedTask.getDueDate());
                    return taskRepository.save(task);
                })
                .orElse(null);
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}