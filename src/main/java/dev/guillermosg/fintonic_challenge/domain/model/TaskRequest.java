package dev.guillermosg.fintonic_challenge.domain.model;

import lombok.*;

import java.time.LocalDate;
import java.util.Set;

/**
 * The Task entity.
 */

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaskRequest {

    private String title;
    private String description;
    private LocalDate dueDate;
    private Set<String> tags;
}
