package com.pro.agents.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class AgentBalance {

    private String id;
    private LocalDate from;
    private LocalDate to;
    private Agency agency;
    private List<Person> persons;
    private  long totalSum;
    private long comission;
}
