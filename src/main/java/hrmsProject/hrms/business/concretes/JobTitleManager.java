package hrmsProject.hrms.business.concretes;

import hrmsProject.hrms.business.abstracts.JobTitleService;
import hrmsProject.hrms.core.utilities.results.DataResult;
import hrmsProject.hrms.core.utilities.results.Result;
import hrmsProject.hrms.core.utilities.results.SuccessDataResult;
import hrmsProject.hrms.core.utilities.results.SuccessResult;
import hrmsProject.hrms.dataAccess.abstracts.JobTitleDao;
import hrmsProject.hrms.entities.concretes.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobTitleManager implements JobTitleService {
    private JobTitleDao jobTitleDao;

    @Autowired
    public JobTitleManager(JobTitleDao jobTitleDao) {
        super();
        this.jobTitleDao = jobTitleDao;
    }

    @Override
    public DataResult<List<JobTitle>> getAll() {
        return new SuccessDataResult<List<JobTitle>>(this.jobTitleDao.findAll(), "Data listelendi");
    }

    @Override
    public Result add(JobTitle jobTitle) {
        this.jobTitleDao.save(jobTitle);
        return new SuccessResult("İş ismi eklendi");
    }

    @Override
    public Result delete(JobTitle jobTitle) {
        this.jobTitleDao.delete(jobTitle);
        return new SuccessResult("İş ismi silindi");
    }
}
