package com.mg.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/*
[
    {
        "id": 1,
        "name": "Learn Spring Boot",
        "author": "AAA"
    }
]
*/

@RestController
public class CourseController {

    // /courses - map this url
    // Course: id, name, author

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "Learn Spring Boot", "AAA"),
                new Course(2, "Learn Spring MVC", "BBB"),
                new Course(3, "Learn Spring Security", "CCC"),
                new Course(4, "Learn Spring Data JPA", "DDD")
        );
    }
}
