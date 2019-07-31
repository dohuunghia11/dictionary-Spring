package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class dictionarySpring {
    @GetMapping("/search")
    public String show(){
        return "index";
    }
    @PostMapping("/search")
    public String search(@RequestParam String txtSearch, Model model){
        Map<String,String> dic = new HashMap<>();
        dic.put("hello", "Xin chào");
        dic.put("how", "Thế nào");
        dic.put("book", "Quyển vở");
        dic.put("computer", "Máy tính");
        String result =  dic.get(txtSearch);
        if(result == null){
            result = "not found";
        }
        model.addAttribute("word", result);
        return "index";
    }
}
