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
    private Food food;       // какая харчовка  :  ЗАВТРАК,  ЗАВТРАК И УЖИН,   ВСЁ ВКЛЮЧЕНО
    private VoucherStatus status;   // предварительный заказ, принят, отклонен,  активен. погашен
    private String desc;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;



}
