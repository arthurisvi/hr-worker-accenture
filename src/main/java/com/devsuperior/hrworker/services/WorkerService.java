package com.devsuperior.hrworker.services;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import com.devsuperior.hrworker.entities.Worker;
import com.devsuperior.hrworker.repositories.WorkerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkerService implements WorkerServiceInterface{

    @Autowired
    private WorkerRepository workerRepository; 
    
    public List<Worker> findAll(){

        List<Worker> workersList = workerRepository.findAll();

        return workersList;
    }

    public Worker findWorkerById(Long id){
        Optional <Worker> worker = workerRepository.findById(id);

        return worker.get();
    }

    public void createWorker(Worker worker){
        workerRepository.save(worker);
    }

    public Worker updateWorker(Long id, Worker updateWorker){
       Worker worker = findWorkerById(id);

       worker.setName(updateWorker.getName());
       worker.setDailyIncome(updateWorker.getDailyIncome());

       createWorker(worker);

       return worker;
    }

    public Worker updateWorkerDailyIncome(Long id, BigDecimal newDailyIncome) {
        Worker worker = findWorkerById(id);
        
        worker.setDailyIncome(newDailyIncome);
        createWorker(worker);

        return worker;
    }

    public void deleteWorker(Long id){
        Worker worker = findWorkerById(id);

        workerRepository.delete(worker);
    }
}
