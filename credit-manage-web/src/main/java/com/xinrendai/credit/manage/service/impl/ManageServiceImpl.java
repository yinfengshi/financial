package com.xinrendai.credit.manage.service.impl;

import com.xinrendai.credit.manage.bean.NplmLoanContract;
import com.xinrendai.credit.manage.mapper.NplmBorrowerInfoMapper;
import com.xinrendai.credit.manage.mapper.NplmLoanContractMapper;
import com.xinrendai.credit.manage.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManageServiceImpl implements ManageService {
    @Autowired
    private NplmBorrowerInfoMapper nplmBorrowerInfoMapper;
    @Autowired
    private NplmLoanContractMapper nplmLoanContractMapper;
    @Override
    public  List<NplmLoanContract> getContractList() {
        List<NplmLoanContract> LoanContractList = nplmLoanContractMapper.selectLoanContractList();
        return LoanContractList;
    }
}
