package dev.guillermosg.fintonic_challenge.infrastructure.adapters.input.rest;

import dev.guillermosg.fintonic_challenge.domain.model.TaskRequest;
import dev.guillermosg.fintonic_challenge.infrastructure.adapters.input.rest.data.TaskDto;
import dev.guillermosg.fintonic_challenge.infrastructure.adapters.input.rest.data.TaskResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDate;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TaskRestAdapterIntegrationTest {

    @Autowired
    private TestRestTemplate restTemplate;

    /**
     * Test alls task.
     */
    @Test
    public void testAllsTask() {
        ResponseEntity<TaskResponseDto> response = restTemplate.getForEntity("/api/v1/tasks", TaskResponseDto.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }

    /**
     * Test create task.
     */
    @Test
    public void testCreateTask() {
        TaskRequest taskRequest = new TaskRequest("title", "description", LocalDate.now().plusDays(1), new HashSet<>());
        ResponseEntity<TaskDto> response = restTemplate.postForEntity("/api/v1/tasks", taskRequest, TaskDto.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }

}
