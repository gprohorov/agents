package com.pro.agents.model;

import java.time.LocalDateTime;

public class Matchmaking {

    private  String id;
    private LocalDateTime time;  //  дата оформления ваучера
    private Agency agency;       //  какое агество
    private Voucher voucher;    //  сам ваучер
    private String desc;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

}
