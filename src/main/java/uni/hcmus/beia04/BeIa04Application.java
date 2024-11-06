package uni.hcmus.beia04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class BeIa04Application {

    public static void main(String[] args) {
        SpringApplication.run(BeIa04Application.class, args);
    }

}
