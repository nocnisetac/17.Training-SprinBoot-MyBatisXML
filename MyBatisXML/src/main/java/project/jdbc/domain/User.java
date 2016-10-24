package project.jdbc.domain;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable 
{
    private Long ID;
    private String username;
    private String email;
    
    private List<Account> accounts;
    
	public User() {
		super();
	}
	public User(Long ID) {
		super();
		this.ID = ID;
	}
	public User(Long ID, String username, String email) {
		super();
		this.ID = ID;
		this.username = username;
		this.email = email;
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	
	
	
}