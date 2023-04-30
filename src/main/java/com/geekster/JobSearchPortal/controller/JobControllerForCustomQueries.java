package com.geekster.JobSearchPortal.controller;

import com.geekster.JobSearchPortal.model.Job;
import com.geekster.JobSearchPortal.serivce.JobServiceForCustomQueries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customQueries")
public class JobControllerForCustomQueries {

    @Autowired
    JobServiceForCustomQueries jobServiceForCustomQueries;

    @GetMapping("/salaryAbove/{salary}")
    public List<Job> getAllJobAboveSalary(@PathVariable Double salary){
        return jobServiceForCustomQueries.getAllJobAboveSalary(salary);
    }

    @PutMapping("/location/{location}/id/{id}")
    public void updateLocationById(@PathVariable String location, @PathVariable Long id){
        jobServiceForCustomQueries.updateLocationById(location, id);
    }

    @PutMapping("/salary/{salary}/id/{id}")
    public void updateSalaryById(Double salary, Long id){
        jobServiceForCustomQueries.updateSalaryById(salary, id);
    }

    @DeleteMapping("/companyName/{companyName}")
    public void deleteByCompanyName(String companyName){
        jobServiceForCustomQueries.deleteByCompanyName(companyName);
    }
}
