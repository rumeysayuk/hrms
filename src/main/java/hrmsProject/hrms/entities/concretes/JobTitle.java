package hrmsProject.hrms.entities.concretes;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "jobTitles")
@AllArgsConstructor
@NoArgsConstructor
public class JobTitle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  int id;

    @Column(name = "job_title")
    private String jobTitle;
}
