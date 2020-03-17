package com.pro.agents.model;

import java.time.LocalDateTime;
// путека на отдых в мигово
public class Voucher {
    private String id;
    private LocalDateTime from;
    private LocalDateTime to;
    private Person person;
    private boolean procedures;  // запланированы ли процедуры
    private boolean hotel;        //  будет ли отель или в частном секторе
    private boolean food;       // какая харчовка
    private VoucherStatus status;
    private String desc;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;



}
