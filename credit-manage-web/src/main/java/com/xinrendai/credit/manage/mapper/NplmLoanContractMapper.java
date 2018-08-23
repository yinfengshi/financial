package com.xinrendai.credit.manage.mapper;

import com.xinrendai.credit.manage.bean.NplmLoanContract;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface NplmLoanContractMapper extends Mapper<NplmLoanContract> {
    List<NplmLoanContract> selectLoanContractList();
}
