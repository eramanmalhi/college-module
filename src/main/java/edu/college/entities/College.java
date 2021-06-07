package edu.college.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class College {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer collegeId;
	private String collegeName;
	private String collegeEmail;
	private String collegeAddress;
	@CreatedDate
    private LocalDateTime createdDate;
	@LastModifiedDate
    private LocalDateTime updatedDate;
	public Integer getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(Integer collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getCollegeEmail() {
		return collegeEmail;
	}
	public void setCollegeEmail(String collegeEmail) {
		this.collegeEmail = collegeEmail;
	}
	public String getCollegeAddress() {
		return collegeAddress;
	}
	public void setCollegeAddress(String collegeAddress) {
		this.collegeAddress = collegeAddress;
	}
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

}
