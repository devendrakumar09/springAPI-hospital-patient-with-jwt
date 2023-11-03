package com.intrn.STPL.services;

import com.intrn.STPL.entity.PatientEntity;

import java.util.List;

public interface PatientServices {
    public List<PatientEntity> getAll();
    public PatientEntity getById(int id);
    public String post(PatientEntity patientEntity);
    public String update(PatientEntity patientEntity,int id);
    public String deleteById(int id);
}
