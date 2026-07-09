package com.cognizant.spring_learn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;


@SpringBootApplication
public class SpringLearnApplication {
    private static final Logger Logger= (Logger) LoggerFactory.getLogger(SpringLearnApplication.class);
    private static final org.slf4j.Logger log = LoggerFactory.getLogger(SpringLearnApplication.class);

    public void displayDate() throws Exception {

        Logger.info("START");

        ApplicationContext context =
                new ClassPathXmlApplicationContext("date-format.xml");

        SimpleDateFormat format =
                context.getBean("dateFormat",
                        SimpleDateFormat.class);

        Date date = format.parse("31/12/2018");

        Logger.debug("Date = {}");

        Logger.info("END");
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
