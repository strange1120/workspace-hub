package workspacehub;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cost {
	@Id
	@GeneratedValue
	private Long costId;

	private String costTitle;
	
	

	@OneToMany(mappedBy = "cost")
	private Set<WorkspaceHub> workspaceHubs;
	
	protected Cost() {}
	
	public Cost( String costTitle ) {
		this.costTitle = costTitle;
	}

	public Long getCostId() {
		return costId;
	}

	public String getCostTitle() {
		return costTitle;
	}

	public Set<WorkspaceHub> getWorkspaceHubs() {
		return workspaceHubs;
	}
	@Override
	public String toString() {
		return String.format("cost[title='%s']", costTitle);
	}
}


