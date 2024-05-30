package dev.guillermosg.fintonic_challenge.infrastructure.adapters.input.rest;

import dev.guillermosg.fintonic_challenge.application.ports.input.TaskUseCase;
import dev.guillermosg.fintonic_challenge.infrastructure.adapters.input.rest.data.TaskDto;
import dev.guillermosg.fintonic_challenge.infrastructure.adapters.input.rest.data.TaskInputDto;
import dev.guillermosg.fintonic_challenge.infrastructure.adapters.input.rest.data.TaskResponseDto;
import dev.guillermosg.fintonic_challenge.infrastructure.adapters.input.rest.mapper.TaskRestMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

/**
 * The Tasks rest adapter.
 */

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api/v1/")
public class TasksRestAdapter implements TasksApi {

    private final TaskUseCase taskUseCase;
    private final TaskRestMapper taskRestMapper;


    /**
     * @return TaskResponseDto
     */
    @Override
    public ResponseEntity<TaskResponseDto> _allsTasks() {
        var tasks = taskUseCase.allsTasks();
        var taskDtos = tasks.stream().map(taskRestMapper::toTask).collect(Collectors.toList());
        return ResponseEntity.ok(new TaskResponseDto().tasks(taskDtos));
    }

    /**
     * @param taskInputDto Datos de la nueva tarea (required)
     * @return TaskDto
     */
    @Override
    public ResponseEntity<TaskDto> _createTask(TaskInputDto taskInputDto) {
        var task = taskRestMapper.toTaskInputDto(taskInputDto);
        var createdTask = taskUseCase.createTask(task);
        return ResponseEntity.ok(taskRestMapper.toTask(createdTask));
    }
}
