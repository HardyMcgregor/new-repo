package com.website.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;

public class Model {
	@Entity
	public class Intern {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String internId;
	    private String internName;
	    private String internBirthday;
	    private String internMajor;
	    private String address;
		public Intern(String internId, String internName, String internBirthday, String internMajor, String address) {
			super();
			this.internId = internId;
			this.internName = internName;
			this.internBirthday = internBirthday;
			this.internMajor = internMajor;
			this.address = address;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getInternId() {
			return internId;
		}
		public void setInternId(String internId) {
			this.internId = internId;
		}
		public String getInternName() {
			return internName;
		}
		public void setInternName(String internName) {
			this.internName = internName;
		}
		public String getInternBirthday() {
			return internBirthday;
		}
		public void setInternBirthday(String internBirthday) {
			this.internBirthday = internBirthday;
		}
		public String getInternMajor() {
			return internMajor;
		}
		public void setInternMajor(String internMajor) {
			this.internMajor = internMajor;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
	}
	@Entity
	public class Mentor {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String mentorId;
	    private String mentorName;
	    private String mentorMajor;
	    private String mentorBirthday;
		public Mentor(String mentorId, String mentorName, String mentorMajor, String mentorBirthday) {
			super();
			this.mentorId = mentorId;
			this.mentorName = mentorName;
			this.mentorMajor = mentorMajor;
			this.mentorBirthday = mentorBirthday;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getMentorId() {
			return mentorId;
		}
		public void setMentorId(String mentorId) {
			this.mentorId = mentorId;
		}
		public String getMentorName() {
			return mentorName;
		}
		public void setMentorName(String mentorName) {
			this.mentorName = mentorName;
		}
		public String getMentorMajor() {
			return mentorMajor;
		}
		public void setMentorMajor(String mentorMajor) {
			this.mentorMajor = mentorMajor;
		}
		public String getMentorBirthday() {
			return mentorBirthday;
		}
		public void setMentorBirthday(String mentorBirthday) {
			this.mentorBirthday = mentorBirthday;
		}
	}

	public interface InternRepository extends JpaRepository<Intern, Long> {
	}

	public interface MentorRepository extends JpaRepository<Mentor, Long> {
	}

}