package workspacehub;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Feature {
	@Id
	@GeneratedValue
	private Long featureId;
	
	private String featureName;
	
	@ManyToMany (mappedBy="features")
	private Set<WorkspaceHub> workspaceHubs;
	
	protected Feature() {}
	
	public Feature(String featureName) {
		this.featureName= featureName;
	}
	

	public Long getFeatureId() {
		return featureId;
	}

	public String getFeatureName() {
		return featureName;
	}

	public Set<WorkspaceHub> getWorkspaceHubs() {
		return workspaceHubs;
	}
	@Override
	public String toString() {
		return String.format("Feature[featureName='%s']", featureName);
}
}
