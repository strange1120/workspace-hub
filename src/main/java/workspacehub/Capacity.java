package workspacehub;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Capacity {
	@Id
	@GeneratedValue
	private Long capacityId;

	private String capacityTitle;
	
	

	@OneToMany(mappedBy = "capacity")
	private Set<WorkspaceHub> workspaceHubs;
	
	protected Capacity() {}
	
	public Capacity( String capacityTitle ) {
		this.capacityTitle = capacityTitle;
	}

	public Long getCapacityId() {
		return capacityId;
	}

	public String getCapacityTitle() {
		return capacityTitle;
	}

	public Set<WorkspaceHub> getWorkspaceHubs() {
		return workspaceHubs;
	}
	@Override
	public String toString() {
		return String.format("capacity[title='%s']", capacityTitle);
	}
}


