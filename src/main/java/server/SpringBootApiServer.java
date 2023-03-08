package server;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


@SpringBootApplication
@RestController
public class SpringBootApiServer {

    public static void main(String[] args) {
/*        try {
            String command = "C:\\Windows\\System32\\cmd.exe /c start C:\\progs\\mysql_start.bat";
            Process proc = Runtime.getRuntime().exec(command);
            BufferedReader br = new BufferedReader(new InputStreamReader(proc.getInputStream()));
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        SpringApplication.run(SpringBootApiServer.class, args);
    }

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }

}
