package com.pengdh.entity;

import java.util.Date;

public class EmployeeEntity {
    private Long empId;

    private Long departId;

    private String departName;

    private String empName;

    private String gender;

    private Date birthDate;

    private String title;

    private String grade;

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public Long getDepartId() {
        return departId;
    }

    public void setDepartId(Long departId) {
        this.departId = departId;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName == null ? null : departName.trim();
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }
    
    @Override
	public String toString() {
		return "EmployeeEntity [empId=" + empId + ", departId=" + departId
				+ ", departName=" + departName + ", empName=" + empName
				+ ", gender=" + gender + ", birthDate=" + birthDate
				+ ", title=" + title + ", grade=" + grade + "]";
	}
}