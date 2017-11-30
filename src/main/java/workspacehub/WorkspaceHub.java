package workspacehub;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class WorkspaceHub {

@Id
@GeneratedValue
private Long id;

private String name;
@Lob
private String description;

@ManyToOne
private SpaceType spaceType;

@ManyToMany
private Set<Feature> features;

//@OneToOne
//private Address address;
private String address;

private String email;

private String phoneNumber;
private String website;

@ManyToOne
private Hours hours;
@ManyToOne
private Parking parking;
@ManyToOne
private Cost cost;
@ManyToOne
private Capacity capacity;


protected WorkspaceHub() {}

public WorkspaceHub(String name, String email,String website, String address, String phoneNumber, String description, SpaceType spaceType, Hours hours,  Parking parking, Cost cost, Capacity capacity, Feature... features) {
	this.name = name;
	this.description = description;
	this.spaceType= spaceType;
	this.hours = hours;
	this.email = email;
	this.phoneNumber = phoneNumber;
	this.website = website;
this.address = address;
	this.parking = parking;
	this.cost= cost;
	this.capacity = capacity;
	this.features = new HashSet<Feature>(Arrays.asList(features));
}

public Long getId() {
	return id;
}

public String getName() {
	return name;
}

public String getDescription() {
	return description;
}

public SpaceType getSpaceType() {
	return spaceType;
}

public Set<Feature> getFeatures() {
	return features;
}

public Hours getHours() {
	return hours;
}

public Parking getParking() {
	return parking;
}

public Cost getCost() {
	return cost;
}

public Capacity getCapacity() {
	return capacity;
}

public String getAddress() {
	return address;
}

public String getEmail() {
	return email;
}

public String getPhoneNumber() {
	return phoneNumber;
}

public String getWebsite() {
	return website;
}

public boolean isSpaceOpen(Hours hour) {
	LocalTime now = LocalTime.now();
	LocalDate date = LocalDate.now();
	String currentDay = date.getDayOfWeek()+"";
	if(hour.getHoursTitle().contains(currentDay)) {
		return true;
		}
	return false;
}
@Override
public String toString() {
	return String.format("WorkspaceHub[name='%s', description='%s', spaceType='%s',features='%s', hours='%s', parking='%s', cost='%s',capacity='%s',email='%s',address='%s'phoneNumber='%s',website='%s']", name,
			description, spaceType, features, hours, parking, cost, capacity,email,address,phoneNumber,website);
}
}
