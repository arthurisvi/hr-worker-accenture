package com.devsuperior.hrworker.services;

import java.util.List;

import com.devsuperior.hrworker.entities.Worker;

public interface WorkerServiceInterface {
    
    public List<Worker> findAll();
    public Worker findWorkerById(Long id);
    public void createWorker(Worker worker);

}
