package jj.HelloHuman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloHumanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloHumanApplication.class, args);
	}
	
	
	@RestController
	@RequestMapping("/")
	public class CodingController {
	    @RequestMapping("")
	    public String hello(){
	      return "Hello Human!";
	    }
		 @RequestMapping("/{name}/")
		   public String dojos(@PathVariable("name") String input){
	    
	    	return "<html>\n" + "<header><title>Welcome</title></header>\n" +
	    	          "<body>\n" + "<h1>" + "Hello " + input + "! </h1>" + "\n" +"\n"+"\n"+ "<p>Welcome to SpringBoot!</p>" +"</body>\n" + "</html>";
	    }
	}
}