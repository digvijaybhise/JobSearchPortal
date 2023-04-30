package com.geekster.JobSearchPortal.repository;

import com.geekster.JobSearchPortal.model.Job;
import com.geekster.JobSearchPortal.model.JobType;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IJobRepository extends CrudRepository<Job, Long> {

    //Find list of jobs by jobType & salary greater than
    public List<Job> findByJobTypeAndSalaryGreaterThan(JobType jobType, Double salary);

    //find jobs by Location
    public List<Job> findByLocation(String location);

    //Find list of jobs by jobType & salary greater than
    public List<Job> findByJobTypeAndLocation(JobType jobType, String location);

    //find jobs by Employer Name
    public List<Job> findByEmployerName(String employerName);


    //Find list of jobs by jobType or salary greater than
    public List<Job> findByJobTypeOrSalaryGreaterThan(JobType jobType, Double salary);


    //Custom Query : Salary greater than
    @Query(value = "Select * From Job Where SALARY  > :salary", nativeQuery = true)
    public List<Job> getJobAboveSalary(Double salary);

    @Modifying
    @Query(value = "Update Job set LOCATION = :location where ID = :id", nativeQuery = true)
    public void updateLocationById(String location, Long id);

    @Modifying
    @Query(value = "Update Job set SALARY = :salary where ID = :id", nativeQuery = true)
    public void updateSalaryById(Double salary, Long id);

    @Modifying
    @Query(value = "Delete from Job where COMPANY_NAME = :companyName", nativeQuery = true)
    public void deleteByCompanyName(String companyName);
}
