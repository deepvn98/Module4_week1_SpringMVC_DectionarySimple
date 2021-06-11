package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
//@RequestMapping("Dectionary")
public class Dectionary {
    @GetMapping("Search")
    public String showFormSearch(){

        return "/search";
    }


    @PostMapping("Search")
    public ModelAndView translate(String english){
        ModelAndView modelAndView =null;
        Map<String,String> map = new HashMap();
        map.put("Hello","Xin chào");
        map.put("How","Thế nào?");
        map.put("Nice","Tốt");
        map.put("Bye","chào tạm biệt");
        map.put("What","Cái Gì?");
        for (Map.Entry<String,String> entry: map.entrySet()){
            if (entry.getKey().equals(english)){
                String vn = entry.getValue();
                modelAndView = new ModelAndView("/search");
                modelAndView.addObject("vn",vn);
                modelAndView.addObject("en",english);
                return modelAndView;
            }
        }
        return modelAndView;
    }
}
