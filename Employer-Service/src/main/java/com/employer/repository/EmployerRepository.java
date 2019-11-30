package com.employer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employer.entity.Employer;

@Repository
public interface EmployerRepository extends JpaRepository<Employer, String> {

}
