package com.intrn.STPL.services.Imp;

import com.intrn.STPL.entity.PatientEntity;
import com.intrn.STPL.repo.PatientRepo;
import com.intrn.STPL.services.PatientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PatientServicesImp implements PatientServices {

    @Autowired
    private PatientRepo patientRepo;

    @Override
    public List<PatientEntity> getAll() {
        return this.patientRepo.findAll();
    }

    @Override
    public PatientEntity getById(int id) {
        Optional<PatientEntity> patient = this.patientRepo.findById(id);
        if (patient.isPresent()){
            return patient.get();
        }else {
            return null;
        }
    }

    @Override
    public String post(PatientEntity patientEntity) {
        PatientEntity data = patientEntity;
        data.setCreatedAt(new Date());
        this.patientRepo.save(data);
        return "1 Row Added!!";
    }

    @Override
    public String update(PatientEntity patientEntity, int id) {
        Optional<PatientEntity> patient = this.patientRepo.findById(id);
        if (patient.isPresent()){
            PatientEntity existPatient = patient.get();
            existPatient.setName(patientEntity.getName());
            existPatient.setContact(patientEntity.getContact());
            existPatient.setCity(patientEntity.getCity());
            existPatient.setAddress(patientEntity.getAddress());
            existPatient.setPincode(existPatient.getPincode());
            existPatient.setStatus(patientEntity.isStatus());
            this.patientRepo.save(existPatient);
            return "1 Row Updated!!";
        }
        return "Invalid Id";
    }

    @Override
    public String deleteById(int id) {
        this.patientRepo.deleteById(id);
        return "1 Row Deleted";
    }
}
