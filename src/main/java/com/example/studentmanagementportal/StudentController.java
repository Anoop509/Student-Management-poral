package com.example.studentmanagementportal;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {

    Map<Integer,Student> studentsDb = new HashMap<>(); // db , key as admno.
    @GetMapping("Get/info")
    public  Student getStudent(int admnno){
        return studentsDb.get(admnno);
    }


}
