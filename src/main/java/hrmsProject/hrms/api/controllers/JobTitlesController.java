package hrmsProject.hrms.api.controllers;

import hrmsProject.hrms.business.abstracts.JobTitleService;
import hrmsProject.hrms.core.utilities.results.DataResult;
import hrmsProject.hrms.core.utilities.results.Result;
import hrmsProject.hrms.entities.concretes.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobtitles")
public class JobTitlesController {

    private JobTitleService jobTitleService;

    @Autowired
    public JobTitlesController(JobTitleService jobTitleService) {
        this.jobTitleService = jobTitleService;
    }


    @GetMapping("/getall")
    public DataResult<List<JobTitle>> getAll() {
        return this.jobTitleService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody JobTitle jobTitle) {
        return this.jobTitleService.add(jobTitle);
    }
}
