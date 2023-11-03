package com.intrn.STPL.controllers;

import com.intrn.STPL.entity.PatientEntity;
import com.intrn.STPL.services.PatientServices;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/patient")
@SecurityRequirement(name = "javainuseapi")
public class PatientController {
    @Autowired
    private PatientServices patientServices;

    @GetMapping()
    public List<PatientEntity> getAll(){
        return this.patientServices.getAll();
    }

    @GetMapping("/{id}")
    public PatientEntity getById(@PathVariable int id){
        return this.patientServices.getById(id);
    }

    @PostMapping
    public String post(@RequestBody PatientEntity patientEntity){
        return this.patientServices.post(patientEntity);
    }

    @PutMapping("/{id}")
    public String update(@RequestBody PatientEntity patientEntity,@PathVariable int id){
        return this.patientServices.update(patientEntity,id);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable int id){
        return this.patientServices.deleteById(id);
    }

}
