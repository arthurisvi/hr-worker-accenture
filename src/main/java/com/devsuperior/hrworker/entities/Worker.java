package com.devsuperior.hrworker.entities;

import java.math.BigDecimal;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Worker {
    
    private Long id;
    private String name;
    private BigDecimal dailyIncome;
}
