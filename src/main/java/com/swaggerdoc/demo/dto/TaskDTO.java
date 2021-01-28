package com.swaggerdoc.demo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@ApiModel(value = "Task", description = "A user task")
public class TaskDTO {
    @ApiModelProperty(value = "The unique identifier of the given task", readOnly = true)
    private Long id;
    @ApiModelProperty(value = "Description of the task", required = true)
    private String description;
    @ApiModelProperty(value = "Indication if the task was completed or not")
    private boolean completed;

    public TaskDTO() {
    }

    public TaskDTO(Long id, String description, boolean completed) {
        this.id = id;
        this.description = description;
        this.completed = completed;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
