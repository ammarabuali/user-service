package aa.userservice.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableMongoRepositories(basePackages = "aa.userservice.com.repo")
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

}
