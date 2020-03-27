package com.learn.spring.containers;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
public class EmployeeContainer {

    private List<String> lists;
    private Set<String> sets;
    private Map<String, String> maps;

}
