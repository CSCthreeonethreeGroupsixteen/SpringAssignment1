package com.javaguides.SpringAssignment1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class SpringAssignment {

    @GetMapping("/courses")
    public Map<String, String[]> getCourses() {
        return Map.of(
                "Foundation Courses", new String[]{"Elementary Programming", "Computer Literacy for Science"},


                "Undergraduate Courses", new String[]{"Operating Systems", "Computer Architecture and Organization", "Advanced Programming", "Software Engineering", "Object-Oriented Programming"},


                "Honours Courses", new String[]{"Advanced Java", "Intelligence Systems", "Distributed Web Computing", "Distributed parallel Programming"});
}


    @SpringBootApplication
    public class SpringAssignment1Application {

        public static void main(String[] args) {
            SpringApplication.run(com.javaguides.SpringAssignment1.SpringAssignment1Application.class, args);
        }

    }


}
