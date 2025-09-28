package com.pm.patientservice.service;

import java.util.ArrayList;
import java.util.List;

import com.pm.patientservice.dto.PatientResponseDTO;
import com.pm.patientservice.mapper.PatientMapper;
import com.pm.patientservice.model.Patient;
import com.pm.patientservice.repository.PatientRepository;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    private PatientRepository patientRepository;


    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<PatientResponseDTO> getPatient(){
        List<Patient> patients = patientRepository.findAll();

        return patients.stream().map(PatientMapper::toDTO).toList();
    }
}
