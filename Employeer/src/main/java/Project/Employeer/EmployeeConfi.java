package Project.Employeer;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class EmployeeConfi {
	
	 @Bean(name = "p1")
	    public Project getProject() {
	        Project p = new Project();
	        p.setpId(101);
	        p.setDuration("6 months");
	        p.setCost(5000000.0);
	        return p;
	    }

	    @Bean(name = "e1")
	    public Employee getEmployee() {
	        Employee emp = new Employee();
	        emp.setEmpid(101);
	        emp.setName("Rahul");
	        emp.setSalary(75000);

	        Map<String, String> addressMap = new HashMap<>();
	        addressMap.put("home", "Coimbatore");
	        addressMap.put("office", "Chennai");

	        emp.setAddress(addressMap);
	        emp.setProject(getProject());

	        return emp;
	        
	    }

}
