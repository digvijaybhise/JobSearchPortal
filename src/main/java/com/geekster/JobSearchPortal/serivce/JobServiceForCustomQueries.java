package com.geekster.JobSearchPortal.serivce;

import com.geekster.JobSearchPortal.model.Job;
import com.geekster.JobSearchPortal.repository.IJobRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceForCustomQueries {

    @Autowired
    IJobRepository jobRepository;

    public List<Job> getAllJobAboveSalary(Double salary){
        return jobRepository.getJobAboveSalary(salary);
    }

    @Transactional
    public void updateLocationById(String location, Long id){
        jobRepository.updateLocationById(location, id);
    }

    @Transactional
    public void updateSalaryById(Double salary, Long id){
        jobRepository.updateSalaryById(salary, id);
    }


    @Transactional
    public void deleteByCompanyName(String companyName){
        System.out.println("Delete custom query called");
        jobRepository.deleteByCompanyName(companyName);
    }
}
