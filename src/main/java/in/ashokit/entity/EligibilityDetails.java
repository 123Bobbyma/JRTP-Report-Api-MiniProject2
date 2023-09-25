package in.ashokit.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="ELIGIBILITY_DETAILS")
public class EligibilityDetails {
	
	@Id
	private Integer eligibility_Id;
	private String name;
	private long mobile;
	private String email;
	private Character gender;
	private long ssn;
	private String planName;
	private String planStatus;
	private LocalDate planStartDate;
	private LocalDate planEndDate;
	private LocalDate createDate;
	private LocalDate updatedDate;
	private String createdBy;
	private String updatedBy;
	

}
