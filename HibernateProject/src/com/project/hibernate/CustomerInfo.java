package com.project.hibernate;

import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity 
@Table(name = "CUSTOMER_INFORMATION") 
public class CustomerInfo {
	
	
	@Column
	private String customerName;
	
//	@Temporal(TemporalType.DATE)
//	private Date birthDate;
//	
//
//	public Date getBirthDate() {
//		return birthDate;
//	}
//	public void setBirthDate(Date birthDate) {
//		this.birthDate = birthDate;
//	}
	@Id 
	@GeneratedValue
//	@GenericGenerator(name = "newGenerator" , strategy = "foreign" , parameters = {@Parameter(value = "cdetail", name = "property")})
	@Column(name = "cust_id")
	private int customerId;
	
	
	@JoinColumn(name = "CUSTOMER_DETAILS")
	@OneToOne(cascade = CascadeType.ALL)
	private Customer_Details cdetail;
	
	
	public Customer_Details getCdetail() {
		return cdetail;
	}
	public void setCdetail(Customer_Details cdetail) {
		this.cdetail = cdetail;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
}
