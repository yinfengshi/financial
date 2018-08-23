package com.xinrendai.credit.manage.controller;

import com.xinrendai.credit.manage.bean.NplmBorrowerInfo;
import com.xinrendai.credit.manage.bean.NplmLoanContract;
import com.xinrendai.credit.manage.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class ManageController {

    @Autowired
    private ManageService manageService;

    @RequestMapping(value = "/smp")
    public String smp(){
        return "smp";
    }

    @RequestMapping(value = "/contractList")
    public String contractList(Model model){
        List<NplmLoanContract>  contractList = manageService.getContractList();
        model.addAttribute("contractList",contractList);
        return "合同列表/合同列表";
    }
}
