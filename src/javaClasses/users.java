package javaClasses;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class users {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "username")
	private String username;

	@Column(name = "password", nullable = false, length = 50)
	private String password;

	@Column(name = "AccessLevel", nullable = false, length = 50)
	private int AccessLevel;

	@Column(name = "name", nullable = false, length = 50)
	private String name;

	@Column(name = "family", nullable = false, length = 50)
	private String family;

	public users() {
		super();
	}

	public users(String username, String password, int accessLevel, String name, String family) {
		super();
		this.username = username;
		this.password = password;
		AccessLevel = accessLevel;
		this.name = name;
		this.family = family;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAccessLevel() {
		return AccessLevel;
	}

	public void setAccessLevel(int accessLevel) {
		AccessLevel = accessLevel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

}
