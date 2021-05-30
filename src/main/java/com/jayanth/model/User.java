package com.jayanth.model;

import com.jayanth.crypto.cryptoAES;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

/**
 * @author jayanth suvarna
 * Date :: 20/may/2021
 *
 */

@Entity
@Table(name = "users")
@EntityListeners(AuditingEntityListener.class)
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "first_name", nullable = false)
	private String firstName;
	
	@Column(name = "last_name", nullable = false)
	private String lastName;
	
	@Column(name = "email_address", nullable = false)
	private String emailAddress;
	


	public long getId() {
		return id;
	}

	public String getFirstName() {
		return cryptoAES.decrypt(firstName);

	}

	public String getLastName() {
		return cryptoAES.decrypt(lastName);
	}

	public String getEmailAddress() {
		return cryptoAES.decrypt(emailAddress);
	}



	public void setId(long id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = cryptoAES.encrypt(firstName);
	}

	public void setLastName(String lastName) {
		this.lastName = cryptoAES.encrypt(lastName);;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = cryptoAES.encrypt(emailAddress);;
	}


	
	
	
	
	

}
