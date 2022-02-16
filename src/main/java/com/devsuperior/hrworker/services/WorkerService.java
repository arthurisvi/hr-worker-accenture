package com.devsuperior.hrworker.services;

import java.util.List;
import java.util.Optional;

import com.devsuperior.hrworker.entities.Worker;
import com.devsuperior.hrworker.repositories.WorkerRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class WorkerService {

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
}
