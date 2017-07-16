package com.springboot.yang.indexcontroller;

import com.springboot.yang.uitls.PageUtils;
import com.springboot.yang.uitls.Query;
import com.springboot.yang.uitls.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.springboot.yang.service.SysGeneratorService;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/table")
public class TableList {
    @Autowired
    private SysGeneratorService sysGeneratorService;

    @RequestMapping("/list")
    @ResponseBody
    public R list(@RequestParam Map<String, Object> params){
        //查询列表数据
        Query query = new Query(params);
        List<Map<String, Object>> list = sysGeneratorService.queryList(query);
        int total = sysGeneratorService.queryTotal(query);
        System.out.println("total = " + total);
        PageUtils pageUtil = new PageUtils(list, total, query.getLimit(), query.getPage());

        return R.ok().put("pages", pageUtil);
    }

}
