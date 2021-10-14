package com.example.Dto;

import com.example.Dto.CustomerDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRespository extends JpaRepository<CustomerDetails, Integer> {

}
