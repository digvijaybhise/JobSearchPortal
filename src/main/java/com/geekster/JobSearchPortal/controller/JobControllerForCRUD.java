package com.geekster.JobSearchPortal.controller;

import com.geekster.JobSearchPortal.model.Job;
import com.geekster.JobSearchPortal.serivce.JobServiceForCRUD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/job")
public class JobControllerForCRUD {

    @Autowired
    JobServiceForCRUD jobService;

    @GetMapping("")
    public Iterable<Job> getList(){
        return jobService.getList();
    }

    @PostMapping("")
    public String addList(@RequestBody List<Job> list){
        return jobService.addList(list);
    }

    @PutMapping("/{id}")
    public String update(@PathVariable Long id, @RequestBody Job job){
        return jobService.updateJobById(id, job);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){
        return jobService.remove(id);
    }
}


