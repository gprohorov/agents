package com.pro.agents.model;

import java.time.LocalDate;

// каждый день по агенству просчитывается начисления
//  сколько за этот день туристов от этого агенства отдыхало
//  и сколько денег за этот день начислено агенству за все услуги, оказанные туристам

public class WorkDay {

    private int id;
    private LocalDate date;  //дата
    private Agency agency;   //  агенство
    private int people;     // сколько народа от этого агенства в этот день было постое
    private int hotelAccrued;   //  этим людям начислено за постой
    private int procedureAccrued;   //  этим людям начислено за процедуры
    private int foodAccrued;      // этим людям начислено за харчевание
    private int gotten;           //  получено с этих людей денег

}
