package him.spring101;
import him.spring102.ByeSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
		   public static void main(String[] args) {
		      ApplicationContext context = 
		             new ClassPathXmlApplicationContext("Beans.xml");

		      HelloSpring obj = (HelloSpring) context.getBean("hellospring");
		      obj.setMessage("Hello Spring");
		      obj.getMessage();
		      
		      
		      ByeSpring obj2 = (ByeSpring) context .getBean("byespring");
		      obj2.getMessage();
		      
		   }
	
}
