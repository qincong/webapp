package org.qincong.controller;

import mall.pojo.TbItem;
import mall.service.ItemServiceImpl;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import taotao.pojo.TbItem;
//import taotao.service.ItemServiceImpl;

@Controller
public class hello {
    @Autowired
    ItemServiceImpl itemService;

    @RequestMapping(value = "/hi")
    public String hi() {
        TbItem tbItem = itemService.getItemById(907012);
        Logger logger=Logger.getLogger(hello.class);
        logger.info("this is control");
        logger.info(tbItem.getTitle());
        return "hi";
    }

    @RequestMapping(value = "index")
    public String index() {
        return "index";
    }
}
