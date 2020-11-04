package com.koreait.day01.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MultiParam {
    String id;
    String name;
    String email;
    int age;
}
