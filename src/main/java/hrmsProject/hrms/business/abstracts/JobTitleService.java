package hrmsProject.hrms.business.abstracts;

import hrmsProject.hrms.core.utilities.results.DataResult;
import hrmsProject.hrms.core.utilities.results.Result;
import hrmsProject.hrms.entities.concretes.JobTitle;

import java.util.List;

public interface JobTitleService {
   DataResult<List<JobTitle>>  getAll();

   Result add(JobTitle jobTitle);
   Result delete(JobTitle jobTitle);
}
