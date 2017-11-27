package workspacehub;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Hours {
	@Id
	@GeneratedValue
	private Long hoursId;

	private String hoursTitle;
	
	

	@OneToMany(mappedBy = "hours")
	private Set<WorkspaceHub> workspaceHubs;
	
	protected Hours() {}
	
	public Hours( String hoursTitle ) {
		this.hoursTitle = hoursTitle;
	}

	public Long getHoursId() {
		return hoursId;
	}

	public String getHoursTitle() {
		return hoursTitle;
	}

	public Set<WorkspaceHub> getWorkspaceHubs() {
		return workspaceHubs;
	}
	@Override
	public String toString() {
		return String.format("Hours[title='%s']", hoursTitle);
	}
}
