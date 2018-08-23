package com.xinrendai.credit.manage.service;

import com.xinrendai.credit.manage.bean.NplmBorrowerInfo;
import com.xinrendai.credit.manage.bean.NplmLoanContract;

import java.util.List;
import java.util.Map;

public interface ManageService{
    List<NplmLoanContract>  getContractList();
}
