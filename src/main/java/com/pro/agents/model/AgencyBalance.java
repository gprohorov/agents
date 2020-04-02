package com.pro.agents.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

//  отчет по балансу по агенству за указавнный период

public class AgencyBalance {

    private String id;
    private LocalDate from;
    private LocalDate to;
    private Agency agency;
    private List<Person> persons;
    private  long totalSum;
    private long comission;
}
