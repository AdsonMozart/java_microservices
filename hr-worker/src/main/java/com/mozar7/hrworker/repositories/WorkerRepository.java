package com.mozar7.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mozar7.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
