package workspacehub;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class WorkSpacePopulator implements CommandLineRunner {

	@Resource
	private WorkSpaceHubRepository workspaceHubRepo;
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
		Hours hours7 = new Hours("M-Th, 9AM- 9PM,F-S, 9AM-6PM, Su 1-5PM");
		hoursRepo.save(hours7);
		Hours hours8 = new Hours("M-W, 5AM-10PM, Th-F 5AM -11PM, S-Su 5:30-10PM");
		hoursRepo.save(hours8);
		Hours hours9 = new Hours("M-S, 6AM-9PM, Su, 7AM-9PM");
		hoursRepo.save(hours9);
		Hours hours10 = new Hours("M-F, 7AM-7PM, S-Su, 8AM-7PM");
		hoursRepo.save(hours10);

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

		workspaceHubRepo.save(
				new WorkspaceHub("Serendipity Labs", "djskdkjsak", coworkingSpace, hours1, garage, expensive, cap));
		workspaceHubRepo.save(
				new WorkspaceHub("Saltmines South", "djskdkjsak", coworkingSpace, hours2, freeStreet, moderate, cap));
		workspaceHubRepo.save(
				new WorkspaceHub("Saltmines North", "djskdkjsak", coworkingSpace, hours2, freeStreet, moderate, cap));
		workspaceHubRepo
				.save(new WorkspaceHub("The Perch", "djskdkjsak", coworkingSpace, hours3, onSite, moderate, cap));
		workspaceHubRepo.save(
				new WorkspaceHub("The Hub on Kenney", "djskdkjsak", coworkingSpace, hours4, onSite, moderate, cap));
		workspaceHubRepo.save(
				new WorkspaceHub("Cup O Joe Coffee House", "djskdkjsak", coffeeShop, hours5, onSite, coffee, cap));
		workspaceHubRepo.save(
				new WorkspaceHub("Starbucks Clintonville", "djskdkjsak", coffeeShop, hours8, onSite, coffee, cap));
		workspaceHubRepo.save(
				new WorkspaceHub("Crimson Cup Clintonville", "djskdkjsak", coffeeShop, hours9, onSite, coffee, cap));
		workspaceHubRepo.save(new WorkspaceHub("Giant Eagle Market District", "djskdkjsak", coffeeShop, hours10, onSite,
				coffee, cap));
		workspaceHubRepo
				.save(new WorkspaceHub("Mission Coffee", "djskdkjsak", coffeeShop, hours2, freeStreet, coffee, cap));
		workspaceHubRepo.save(new WorkspaceHub("The Point-Otterbein University", "djskdkjsak", library, hours7, onSite,
				moderateHigh, cap));
		workspaceHubRepo.save(new WorkspaceHub("Whetstone Library", "djskdkjsak", library, hours6, onSite, free, cap));
		workspaceHubRepo.save(
				new WorkspaceHub("Columbus Metropolitan Library", "djskdkjsak", library, hours7, garage, free, cap));
		workspaceHubRepo.save(new WorkspaceHub("Northside Branch-Columbus Library", "djskdkjsak", library, hours7,
				freeStreet, free, cap));
		workspaceHubRepo
				.save(new WorkspaceHub("Worthington Library", "djskdkjsak", library, hours7, onSite, free, cap));

	}

}
