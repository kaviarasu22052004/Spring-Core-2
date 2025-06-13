package Project.Employeer;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean {

    int empid;
    String name;
    float salary;
    Map<String, String> address;
    Project project; 

    public Employee() {
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Map<String, String> getAddress() {
        return address;
    }

    public void setAddress(Map<String, String> address) {
        this.address = address;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Employee(int empid, String name, float salary, Map<String, String> address, Project project) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.address = address;
        this.project = project;
    }

    @Override
    public String toString() {
        return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", address=" + address
                + ", project=" + project + "]";
    }

	@Override
	public void destroy() throws Exception {
		
		System.out.println("Ending.....");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("Starting....");
		
	}
	
	 @PostConstruct
	    public void init() {
	        System.out.println("input");
	    }

	    @PreDestroy
	    public void cleanup() {
	        System.out.println("output");
	    }
	
}
