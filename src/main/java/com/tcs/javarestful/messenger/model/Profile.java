package com.tcs.javarestful.messenger.model;

import java.util.Date;

public class Profile {

		private long id;
		private String profileName;
		private String firstname;
		private String lastname;
		private Date createdAt;

		public Profile() {
		}
		public Profile(int id,String profileName,String firstname, String lastname) {
			this.firstname=firstname;
			this.id=id;
			this.lastname=lastname;
			this.profileName=profileName;
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getProfileName() {
			return profileName;
		}
		public void setProfileName(String profileName) {
			this.profileName = profileName;
		}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public Date getCreatedAt() {
			return createdAt;
		}
		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}
		
		
}
