package workspacehub;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class WorkSpacePopulator implements CommandLineRunner {

@Resource 
private WorkSpaceRepository workspaceRepo;
@Resource
private FeatureRepository featureRepo;
@Resource
private SpaceTypeRepository spaceTypeRepo;
@Resource
private HoursRepository hoursRepo;
@Resource
private ParkingRepository parkingRepo;
@Resource
private CapacityRepository capacityRepo;
@Resource
private CostRepository costRepo;

	@Override
	public void run(String... args) throws Exception {
		SpaceType coworkingSpace = new SpaceType("Co-working Space");
		spaceTypeRepo.save(coworkingSpace);
		SpaceType coffeeShop = new SpaceType("Coffee Shop");
		spaceTypeRepo.save(coffeeShop);
		SpaceType library = new SpaceType("Library");
		spaceTypeRepo.save(library);
		
		Hours hours1 = new Hours("M-F, 8AM- 6PM");
		hoursRepo.save(hours1);
		Hours hours2 = new Hours("M-F, 9AM- 6PM");		
		hoursRepo.save(hours2);
		Hours hours3 = new Hours("M-S, 24 hrs");		
		hoursRepo.save(hours3);
		Hours hours4 = new Hours("M-F, 9AM- 5PM");		
		hoursRepo.save(hours4);
		Hours hours5 = new Hours("M-S, 7AM- 9:30PM, Sunday, 7AM-8PM");		
		hoursRepo.save(hours5);
		Hours hours6 = new Hours("M-F, 3PM- 9PM,Sat-Su, 10AM-3PM");		
		hoursRepo.save(hours6);
				
		Parking garage = new Parking("garage");
		parkingRepo.save(garage);
		Parking freeStreet = new Parking("Free street");
		parkingRepo.save(freeStreet);
		Parking onSite = new Parking("On-site ");
		parkingRepo.save(onSite);
		
		Cost free = new Cost("free");
		costRepo.save(free);
		Cost expensive = new Cost("$49/day");
		costRepo.save(expensive);
		Cost moderate = new Cost("$15/day");
		costRepo.save(moderate);
		Cost moderateHigh = new Cost("$25/day");
		costRepo.save(moderateHigh);
		Cost coffee = new Cost("Coffee");
		costRepo.save(coffee);
		
		
		Capacity cap = new Capacity("100");
		capacityRepo.save(cap);
		
		workspaceRepo.save(new WorkspaceHub("Serendipity Labs", "djskdkjsak",coworkingSpace,hours1,garage,expensive,cap));
		workspaceRepo.save(new WorkspaceHub("Saltmines South", "djskdkjsak",coworkingSpace,hours2,freeStreet,moderate,cap));
		
		
		
		
	}

}
