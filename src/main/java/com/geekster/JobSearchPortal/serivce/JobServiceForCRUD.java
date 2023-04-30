package com.geekster.JobSearchPortal.serivce;

import com.geekster.JobSearchPortal.model.Job;
import com.geekster.JobSearchPortal.repository.IJobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceForCRUD {
    @Autowired
    IJobRepository jobRepository;

    public Iterable<Job> getList() {
        return jobRepository.findAll();
    }

    public String addList(List<Job> listOfJobs) {
        Iterable<Job> list = jobRepository.saveAll(listOfJobs);
        if(list != null) return "Added list of stocks ....!!!!";
        return "Could not added...!!!";
    }

    public String updateJobById(Long id, Job job){
        jobRepository.save(job);
        return "Job with id " + id + "updated successfully";
    }

    public String remove(Long id) {
        jobRepository.deleteById(id);
        return "Job with id " + id + "deleted successfully";
    }

}
