package com.cognizant.spring_learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class SpringLearnApplication {
    public void displayDate() throws Exception {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("date-format.xml");

        SimpleDateFormat format =
                context.getBean("dateFormat",
                        SimpleDateFormat.class);

        Date date = format.parse("31/12/2018");

        System.out.println(date);
    }

	public static void main(String[] args) {
        try {
            SpringApplication.run(
                    SpringLearnApplication.class,
                    args);

            SpringLearnApplication app =
                    new SpringLearnApplication();

            app.displayDate();
        }
        catch(Exception e){
            e.printStackTrace();
        }
	}

}
