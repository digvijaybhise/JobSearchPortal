package com.geekster.JobSearchPortal.controller;

import com.geekster.JobSearchPortal.model.Job;
import com.geekster.JobSearchPortal.model.JobType;
import com.geekster.JobSearchPortal.serivce.JobServiceForCustomFinders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;
import java.util.List;

@RestController
@RequestMapping("/customFinders")
public class JobControllerForCustomFinder {

    @Autowired
    JobServiceForCustomFinders jobServiceForCustomFinders;

    @GetMapping("/get/jobType/{jobType}/and/salary/{salary}")
    public List<Job> getByJobTypeAndSalaryGreaterThan(@PathVariable JobType jobType, @PathVariable Double salary){
        return jobServiceForCustomFinders.getJobTypeAndSalaryGreaterThan(jobType, salary);
    }

    @GetMapping("/get/location/{location}")
    public List<Job> findByLocation(@PathVariable String location){
        return jobServiceForCustomFinders.findByLocation(location);
    }

    @GetMapping("/get/jobType/{jobType}/and/location/{location}")
    public List<Job> findByJobTypeAndLocation(@PathVariable JobType jobType, @PathVariable String location){
        return jobServiceForCustomFinders.findByJobTypeAndLocation(jobType, location);
    }

    @GetMapping("/get/employerName/{employerName}")
    public List<Job> findByEmployerName(@PathVariable String employerName){
        return jobServiceForCustomFinders.findByEmployerName(employerName);
    }

    @GetMapping("/get/jobType/{jobType}/or/salary/{salary}")
    public List<Job> findByJobTypeOrSalaryGreaterThan(@PathVariable JobType jobType, @PathVariable Double salary){
        return jobServiceForCustomFinders.findByJobTypeOrSalaryGreaterThan(jobType, salary);
    }
}
