package com.example.pharmacy.api.pharmacy.repository;

import com.example.pharmacy.api.pharmacy.entity.Pharmacy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PharmacyRepository extends JpaRepository<Pharmacy,Long> {

}

