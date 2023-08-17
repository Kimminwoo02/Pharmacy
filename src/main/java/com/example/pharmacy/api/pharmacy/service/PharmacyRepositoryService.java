package com.example.pharmacy.api.pharmacy.service;

import com.example.pharmacy.api.pharmacy.entity.Pharmacy;
import com.example.pharmacy.api.pharmacy.repository.PharmacyRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
@RequiredArgsConstructor
public class PharmacyRepositoryService {
    private final PharmacyRepository pharmacyRepository;

    @Transactional
    public void updateAddress(Long id,  String address){
        Pharmacy entity = pharmacyRepository.findById(id).orElse(null);
    }

}
