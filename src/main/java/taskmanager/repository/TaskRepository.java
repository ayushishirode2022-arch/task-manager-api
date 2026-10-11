
package taskmanager.repository;

import taskmanager.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import taskmanager.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByStatus(String status);
}
