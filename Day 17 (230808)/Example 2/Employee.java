package property.injection.collections;

import java.util.*;

public class Employee {
	private int empId;
	private String empName;

	private List<String> empMobileNos;
	private Set<String> addresses;
	private Map<String, String> coursesDuration;
	private Properties leavesRecord;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public List<String> getEmpMobileNos() {
		return empMobileNos;
	}

	public void setEmpMobileNos(List<String> empMobileNos) {
		this.empMobileNos = empMobileNos;
	}

	public Set<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}

	public Map<String, String> getCoursesDuration() {
		return coursesDuration;
	}

	public void setCoursesDuration(Map<String, String> coursesDuration) {
		this.coursesDuration = coursesDuration;
	}

	public Properties getLeavesRecord() {
		return leavesRecord;
	}

	public void setLeavesRecord(Properties leavesRecord) {
		this.leavesRecord = leavesRecord;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "\n\nEmp Mobile Nos=" + empMobileNos
				+ "\n\nAddresses=" + addresses + "\n\nCourses Duration=" + coursesDuration  + "\n\nLeaves Record=" + leavesRecord + "]";
	}
}