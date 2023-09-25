package in.ashokit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import in.ashokit.entity.EligibilityDetails;
import in.ashokit.repo.EligibilityDetailsRepo;

@Component
public class AppRunner implements ApplicationRunner {

	@Autowired
	private EligibilityDetailsRepo repo;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		EligibilityDetails e1 = new EligibilityDetails();

		e1.setEligibility_Id(1);
		e1.setName("bobby marwha");
		e1.setMobile(123456789);
		e1.setGender('M');
		e1.setSsn(686868681);
		e1.setPlanName("SNAP");
		e1.setPlanStatus("approved");
		repo.save(e1);
		
		
		EligibilityDetails e2 = new EligibilityDetails();

		e2.setEligibility_Id(2);
		e2.setName("DIGANT D");
		e2.setMobile(987654321);
		e2.setGender('M');
		e2.setSsn(686868682);
		e2.setPlanName("SCAP");
		e2.setPlanStatus("NA");
		repo.save(e2);

	}

}
