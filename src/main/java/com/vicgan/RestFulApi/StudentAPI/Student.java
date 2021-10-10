package com.vicgan.RestFulApi.StudentAPI;

import lombok.*;

@AllArgsConstructor
//@NoArgsConstructor
@Getter
@Setter
@ToString
public class Student {
    private String name;
    private String program;
    private int indexNumber;
}
