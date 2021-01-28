package com.swaggerdoc.demo.repository;

import com.swaggerdoc.demo.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
