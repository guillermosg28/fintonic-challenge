package dev.guillermosg.fintonic_challenge.application.ports.input;

import dev.guillermosg.fintonic_challenge.domain.model.Task;
import dev.guillermosg.fintonic_challenge.domain.model.TaskRequest;

import java.util.List;

/**
 * The Task use case.
 */

public interface TaskUseCase {

    /**
     * Alls tasks list.
     *
     * @return the list
     */
    List<Task> allsTasks();

    /**
     * Create task task.
     *
     * @param taskRequest the task
     * @return the task
     */
    Task createTask(TaskRequest taskRequest);

}
