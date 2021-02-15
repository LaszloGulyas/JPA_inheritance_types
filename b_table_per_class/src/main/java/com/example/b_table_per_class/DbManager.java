package com.example.b_table_per_class;

import com.example.b_table_per_class.domain.Company;
import com.example.b_table_per_class.domain.Individual;
import org.springframework.context.annotation.Bean;

import javax.annotation.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@ManagedBean
@Transactional
public class DbManager {

    @PersistenceContext
    private EntityManager em;

    @Bean
    public void fill() {
        em.persist(new Individual("Budapest", 'I', "Kiss Bela", "Kiss"));
        em.persist(new Individual("Szeged", 'I', "Nagy Natalia", "Nagy"));
        em.persist(new Company("Budapest", 'C', "BKK", "Public Transportation"));
        em.persist(new Company("Pecs", 'C', "BaranyaSped", "Logistics"));
    }
}
