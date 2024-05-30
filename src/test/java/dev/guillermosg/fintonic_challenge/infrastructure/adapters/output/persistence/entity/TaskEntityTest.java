package dev.guillermosg.fintonic_challenge.infrastructure.adapters.output.persistence.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class TaskEntityTest {

    /**
     * Test the constructor
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        TaskEntity actualTaskEntity = new TaskEntity();
        actualTaskEntity.setId("42");
        actualTaskEntity.setTitle("Titulo");
        actualTaskEntity.setDescription("Descripcion");
        LocalDate dueDate = LocalDate.of(2024, 05, 30);
        actualTaskEntity.setDueDate(dueDate);
        actualTaskEntity.setStatus("PENDIENTE");
        HashSet<String> tags = new HashSet<>();
        actualTaskEntity.setTags(tags);

        String actualId = actualTaskEntity.getId();
        String actualDescription = actualTaskEntity.getDescription();
        LocalDate actualDueDate = actualTaskEntity.getDueDate();
        String actualStatus = actualTaskEntity.getStatus();
        Set<String> actualTags = actualTaskEntity.getTags();

        // Assert that nothing has changed
        assertEquals("42", actualId);
        assertEquals("Titulo", actualTaskEntity.getTitle());
        assertEquals("Descripcion", actualDescription);
        assertEquals("PENDIENTE", actualStatus);
        assertSame(tags, actualTags);
        assertSame(dueDate, actualDueDate);
    }
}
