package dev.guillermosg.fintonic_challenge.infrastructure.adapters.output.persistence.repository;

import dev.guillermosg.fintonic_challenge.infrastructure.adapters.output.persistence.entity.TaskEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * The Task repository.
 */

@Repository
public interface TaskRepository extends MongoRepository<TaskEntity, String> {
}
