package com.overpayment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table (name ="opuser")
public class Users {

	@Id
	@GeneratedValue(generator = "userSeqGen")
	@SequenceGenerator(name = "userSeqGen", sequenceName = "USERID_SQ",
    initialValue = 5, allocationSize = 3)
	@Column(name="user_id")
	private Long userId;
	
	@Column(name="email_id")
	private String email;
	
	@Column(name="pwd")
	private String password;
	
	@Column(name="name")
	private String username;

	@Column(name="eff_status")
	private String eff_status;

	@Column(name="admin_user")
	private String admin_user;

	@Column(name="admin_role")
	private String admin_role;
	
	@Column(name="logged_in")
	private String logged_in;

	@Column(name="attempt")
	private Integer attempt;

	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long id) {
		this.userId = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEff_status() {
		return eff_status;
	}
	public void setEff_status(String eff_status) {
		this.eff_status = eff_status;
	}
	public String getAdmin_user() {
		return admin_user;
	}
	public void setAdmin_user(String admin_user) {
		this.admin_user = admin_user;
	}
	public String getAdmin_role() {
		return admin_role;
	}
	public void setAdmin_role(String admin_role) {
		this.admin_role = admin_role;
	}
	public String getLogged_in() {
		return logged_in;
	}
	public void setLogged_in(String logged_in) {
		this.logged_in = logged_in;
	}
	public Integer getAttempt() {
		return attempt;
	}
	public void setAttempt(Integer attempt) {
		this.attempt = attempt;
	}
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", email=" + email + ", password=" + password + ", username=" + username
				+ ", eff_status=" + eff_status + ", admin_user=" + admin_user + ", admin_role=" + admin_role
				+ ", logged_in=" + logged_in + ", attempt=" + attempt + "]";
	}
	
	
	
}
