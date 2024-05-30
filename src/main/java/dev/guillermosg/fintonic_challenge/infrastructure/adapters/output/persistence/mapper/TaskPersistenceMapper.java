package dev.guillermosg.fintonic_challenge.infrastructure.adapters.output.persistence.mapper;

import dev.guillermosg.fintonic_challenge.domain.model.Task;
import dev.guillermosg.fintonic_challenge.infrastructure.adapters.output.persistence.entity.TaskEntity;
import org.mapstruct.Mapper;

/**
 * The Task persistence mapper.
 */

@Mapper
public interface TaskPersistenceMapper {

    /**
     * To entity model task entity.
     *
     * @param entity the task
     * @return the task entity
     */
    Task toDomainModel(TaskEntity entity);

    /**
     * To domain model task.
     *
     * @param task the task
     * @return the task entity
     */
    TaskEntity toDomainModel(Task task);


}
