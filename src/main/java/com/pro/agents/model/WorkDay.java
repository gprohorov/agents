package com.pro.agents.model;

import java.time.LocalDate;

public class WorkDay {

    private int id;
    private LocalDate date;  //даиа
    private Agency agency;   //  агенство
    private int people;     // сколько народа от этого агенства в этот день было постое
    private int hotelAccrued;   //  этим людям начислено за постой
    private int hotelSumGotten;   //  с этих людей получено за постой
    private int foodAccrued;      // этим людям начислено за харчевание
    private int gotten;           //  получено с этих людей денег

}
