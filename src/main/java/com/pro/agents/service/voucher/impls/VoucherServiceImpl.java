package com.pro.agents.service.voucher.impls;

import com.pro.agents.model.Voucher;
import com.pro.agents.repository.voucher.VoucherRepositoryFakeImpl;
import com.pro.agents.service.voucher.interfaces.IVoucherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoucherServiceImpl implements IVoucherService {

    @Autowired
    VoucherRepositoryFakeImpl repository;



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
        return repository.get(id);
    }

    @Override
    public Voucher delete(String id) {
        return null;
    }

    @Override
    public List<Voucher> getAll() {
        return repository.getAll();
    }
}
