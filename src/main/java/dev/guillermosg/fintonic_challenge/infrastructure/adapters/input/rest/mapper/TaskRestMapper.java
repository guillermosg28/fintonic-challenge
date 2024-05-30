package dev.guillermosg.fintonic_challenge.infrastructure.adapters.input.rest.mapper;

import dev.guillermosg.fintonic_challenge.domain.model.Task;
import dev.guillermosg.fintonic_challenge.domain.model.TaskRequest;
import dev.guillermosg.fintonic_challenge.infrastructure.adapters.input.rest.data.TaskDto;
import dev.guillermosg.fintonic_challenge.infrastructure.adapters.input.rest.data.TaskInputDto;
import org.mapstruct.Mapper;

/**
 * The Task rest mapper.
 */

@Mapper
public interface TaskRestMapper {


    /**
     * To task task.
     *
     * @param task the task
     * @return the task
     */
    TaskDto toTask(Task task);

    /**
     * To task input dto task.
     *
     * @param taskInputDto the task dto
     * @return the task
     */
    TaskRequest toTaskInputDto(TaskInputDto taskInputDto);

}
