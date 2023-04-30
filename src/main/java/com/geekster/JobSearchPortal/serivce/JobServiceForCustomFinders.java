package com.geekster.JobSearchPortal.serivce;

import com.geekster.JobSearchPortal.model.Job;
import com.geekster.JobSearchPortal.model.JobType;
import com.geekster.JobSearchPortal.repository.IJobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceForCustomFinders {

    @Autowired
    IJobRepository jobRepository;
    public List<Job> getJobTypeAndSalaryGreaterThan(JobType jobType, Double salary) {
        return jobRepository.findByJobTypeAndSalaryGreaterThan(jobType, salary);
    }

    public List<Job> findByLocation(String location){
        return jobRepository.findByLocation(location);
    }

    public List<Job> findByJobTypeAndLocation(JobType jobType, String location){
        return jobRepository.findByJobTypeAndLocation(jobType, location);
    }

    public List<Job> findByEmployerName(String employerName){
        return jobRepository.findByEmployerName(employerName);
    }

    public List<Job> findByJobTypeOrSalaryGreaterThan(JobType jobType, Double salary){
        return jobRepository.findByJobTypeOrSalaryGreaterThan(jobType, salary);
    }
}
