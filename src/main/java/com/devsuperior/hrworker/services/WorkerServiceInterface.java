package com.devsuperior.hrworker.services;

import java.math.BigDecimal;
import java.util.List;

import com.devsuperior.hrworker.entities.Worker;

public interface WorkerServiceInterface {
    
    public List<Worker> findAll();
    public Worker findWorkerById(Long id);
    public void createWorker(Worker worker);
    public Worker updateWorker(Long id, Worker updateWorker);
    public Worker updateWorkerDailyIncome(Long id, BigDecimal newDailyIncome);
    public void deleteWorker(Long id);
}
