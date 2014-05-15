package com.esprit.domain;
import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Classe implements Serializable {

	
	@Id
	private String id;
	private String email;
	
	//@OneToMany(mappedBy="classe",fetch=FetchType.LAZY)
	//private List<Etudiant> listEtud;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	/*public List<Etudiant> getListEtud() {
		return listEtud;
	}
	public void setListEtud(List<Etudiant> listEtud) {
		this.listEtud = listEtud;
	}*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Classe other = (Classe) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Classe [id=" + id + "]";
	}
	public Classe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
