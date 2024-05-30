package dev.guillermosg.fintonic_challenge.infrastructure.adapters.output.persistence;

import dev.guillermosg.fintonic_challenge.application.ports.output.TaskOutputPort;
import dev.guillermosg.fintonic_challenge.domain.model.Task;
import dev.guillermosg.fintonic_challenge.infrastructure.adapters.output.persistence.mapper.TaskPersistenceMapper;
import dev.guillermosg.fintonic_challenge.infrastructure.adapters.output.persistence.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * The Task persistence adapter.
 */

@Component
@RequiredArgsConstructor
public class TaskPersistenceAdapter implements TaskOutputPort {

    private final TaskRepository taskRepository;
    private final TaskPersistenceMapper taskPersistenceMapper;


    /**
     * @param task the task
     * @return the task
     */
    @Override
    public Task _createTask(Task task) {
        var taskModel = taskPersistenceMapper.toDomainModel(taskRepository.save(taskPersistenceMapper.toDomainModel(task)));
        return taskModel;
    }

    /**
     * @return the list
     */
    @Override
    public List<Task> _allsTasks() {
        var taskList = taskRepository.findAll();
        return taskList.stream().map(taskPersistenceMapper::toDomainModel).collect(Collectors.toList());
    }
}
