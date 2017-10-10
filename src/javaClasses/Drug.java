package javaClasses;


import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name="drug")
public class Drug implements Serializable {
	
	@Id
	@GeneratedValue
	@Column(name="code" , nullable = false, length = 50)
	private int code;
	
	@Column(name="name" , nullable = false, length = 50)
	private String name;

	public Drug(int code, String name) {
		super();
		this.code = code;
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	

}
