package com.tengda.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description:
 *
 * @author: Wang Teng
 * @date: 2019-09-08 17:53
 */
// scp product-0.0.1-SNAPSHOT.jar root@39.107.113.232:/home/Test
@Controller
public class MainController {

    @RequestMapping("/index")
    public String out() {
        return "index.html";
    }

}
