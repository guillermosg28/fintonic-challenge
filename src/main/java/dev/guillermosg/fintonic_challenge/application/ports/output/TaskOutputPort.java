package dev.guillermosg.fintonic_challenge.application.ports.output;

import dev.guillermosg.fintonic_challenge.domain.model.Task;

import java.util.List;

/**
 * The Task output port.
 */

public interface TaskOutputPort {

    /**
     * Create task task.
     *
     * @param task the task
     * @return the task
     */
    Task _createTask(Task task);

    /**
     * Alls tasks list.
     *
     * @return the list
     */
    List<Task> _allsTasks();
}
