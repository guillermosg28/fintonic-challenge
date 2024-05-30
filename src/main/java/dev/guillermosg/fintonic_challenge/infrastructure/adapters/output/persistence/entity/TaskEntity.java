package dev.guillermosg.fintonic_challenge.infrastructure.adapters.output.persistence.entity;

import org.springframework.data.annotation.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * The Task entity.
 */

import java.time.LocalDate;
import java.util.Set;

@Document(collection = "tasks")
@NoArgsConstructor
@Getter
@Setter
public class TaskEntity {

    @Id
    private String id;

    private String title;

    private String description;

    private LocalDate dueDate;

    private Set<String> tags;

    private String status;
}
