package Project.Employeer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {
    public static void main(String[] args) {
         ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        
        // ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfi.class);
        
        
        Employee emp = (Employee) context.getBean("e1");
        System.out.println(emp);
        
        ((AbstractApplicationContext) context).registerShutdownHook();
        
    }
}








