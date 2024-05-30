package dev.guillermosg.fintonic_challenge.domain.service;

import dev.guillermosg.fintonic_challenge.application.ports.input.TaskUseCase;
import dev.guillermosg.fintonic_challenge.application.ports.output.TaskOutputPort;
import dev.guillermosg.fintonic_challenge.domain.model.Task;
import dev.guillermosg.fintonic_challenge.domain.model.TaskRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The Task service.
 */

@Service
@AllArgsConstructor
@Slf4j
public class TaskService implements TaskUseCase {

    private final TaskOutputPort taskOutputPort;
    /**
     * @return the list
     */
    @Override
    public List<Task> allsTasks() {
        return taskOutputPort._allsTasks();
    }

    /**
     * @param task the task
     * @return the task
     */
    @Override
    public Task createTask(TaskRequest task) {

        Task taskModel = new Task();
        taskModel.setTitle(task.getTitle());
        taskModel.setDescription(task.getDescription());
        taskModel.setDueDate(task.getDueDate());
        taskModel.setTags(task.getTags());
        taskModel.setStatus("PENDING");

        return taskOutputPort._createTask(taskModel);

    }
}
