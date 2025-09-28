package com.pm.patientservice.service;

import java.util.List;

import com.pm.patientservice.dto.PatientResponseDTO;
import com.pm.patientservice.model.Patient;
import com.pm.patientservice.repository.PatientRepository;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    private PatientRepository patientRepository;


    public void PatientRepository(PatientRepository patientRepository){
        this.patientRepository = patientRepository;
    }

    public List<PatientResponseDTO> getPatient(){
        List<Patient> patients = patientRepository.findAll();
    }
}
