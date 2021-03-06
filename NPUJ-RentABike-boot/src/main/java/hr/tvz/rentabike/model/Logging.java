package hr.tvz.rentabike.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;





@Entity
@Table(name = "logging", uniqueConstraints = {
        @UniqueConstraint(columnNames = "id") })
public class Logging implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5235678586005452594L;
	@Id
	@Column(name= "id")
	@GeneratedValue
	int id;
	
	@Column(name = "username")
	String username;
	@Column(name = "action")
	String actions;
	@Column(name = "action_time")
	Timestamp action_time;
	
	public Logging(){}
	
	public Logging(String username, String actions, Timestamp action_time){
		this.username = username;
		this.actions = actions;
		this.action_time = action_time;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getActions() {
		return actions;
	}

	public void setActions(String actions) {
		this.actions = actions;
	}

	public Timestamp getActionTime() {
		return action_time;
	}

	public void setActionTime(Timestamp action_time) {
		this.action_time = action_time;
	}
	
	
}
