package h.a.w;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	private int P_id;
	private String P_name;
	
	@ManyToMany
	private List<Employee> e;


	public int getP_id() {
		return P_id;
	}


	public void setP_id(int p_id) {
		P_id = p_id;
	}


	public String getP_name() {
		return P_name;
	}


	public void setP_name(String p_name) {
		P_name = p_name;
	}


	public List<Employee> getE() {
		return e;
	}


	public void setE(List<Employee> e) {
		this.e = e;
	}
	

}
