package com.pro.agents.repository.voucher;

import com.pro.agents.model.*;
import com.pro.agents.repository.IGenericRepository;
import com.pro.agents.repository.agency.AgencyRepositoryFakeImpl;
import com.pro.agents.repository.person.PersonRepositoryFakeImpl;
import com.pro.agents.service.person.impls.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class VoucherRepositoryFakeImpl implements IGenericRepository<Voucher> {

    private List<Voucher> list;


    @Autowired
    AgencyRepositoryFakeImpl agencyRepository;

    @Autowired
    PersonServiceImpl personService;


    @PostConstruct
    void init(){

        System.out.println(agencyRepository.getAll().size());
        System.out.println(personService.getAll().size());

        Person person1 = personService.get("1");
        Agency agency1 = agencyRepository.get(1);

        list = new ArrayList<>(

                Arrays.asList(

                        new Voucher("1",
                                //        agencyRepository.getAll().get(0),
                                agencyRepository.get(1),
                                LocalDate.now().plusDays(7),
                                LocalDate.now().plusDays(17),
                                //             personService.getAll().get(0),
                                person1,
                                true,
                                true,
                                Food.BREAKFEST,
                                VoucherStatus.WAITING)
 ,
                    new Voucher("2",
                            agencyRepository.getAll().get(1),
                            LocalDate.now().plusDays(5),
                            LocalDate.now().plusDays(17),
                            personService.get("3"),
                            true,
                            true,
                            Food.BREAKFEST,
                            VoucherStatus.ACTIVE),

                  new Voucher("3",
                            agencyRepository.getAll().get(2),
                            LocalDate.now().plusDays(3),
                            LocalDate.now().plusDays(10),
                            personService.get("2"),
                            false,
                            true,
                            Food.SUPPER,
                            VoucherStatus.WAITING)
                        /*     */

                )
        );


    }




    @Override
    public Voucher create(Voucher voucher) {
        return null;
    }

    @Override
    public Voucher update(Voucher voucher) {
        return null;
    }

    @Override
    public Voucher get(String id) {
        System.out.println("CALLED get");

        System.out.println(id);

        Voucher voucher = this.getAll().stream().filter(item->item.getId().equals(id))
                .findFirst().orElse(null);
        System.out.println(voucher);
        return voucher;
    }

    @Override
    public Voucher delete(String id) {
        return null;
    }

    @Override
    public List<Voucher> getAll() {
        return list;
    }
}
