package com.practices;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jotaiwan on 4/06/2017.
 */
@Controller
@RequestMapping("/")
public class WorldController {

    @RequestMapping(method= RequestMethod.GET)
    public String sayHello(ModelMap model) {
        model.addAttribute("greeeting", "hello world");
        return "welcome";
    }
}
