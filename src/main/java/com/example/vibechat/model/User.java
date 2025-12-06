package com.example.vibechat.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long id;
    private String fName;
    private String lName;
    private String uName;
    private String password;

}