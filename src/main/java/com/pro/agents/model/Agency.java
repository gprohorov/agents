package com.pro.agents.model;

import java.time.LocalDateTime;

public class Agency {

    private int id;
    private String name;
    private Agent agent;
    private String address;
    private String telephone;
    private String contactPerson;
    private AgencyStatus status;   // High, low    статус агенство, от которого будет что-то зависить, возможно процент
    private double percent;       //  процент который берет агенство за каждого туриста
    private String desc;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

}
