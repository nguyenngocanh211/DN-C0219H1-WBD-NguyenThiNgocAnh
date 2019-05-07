package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ExchangeController {
    @GetMapping("/exchangeMoney")
    public String exchangeMoney(@RequestParam("usd") double usd, @RequestParam("rate") double rate, Model modle) {
        double vnd = usd * rate;
        modle.addAttribute("usd", usd);
        modle.addAttribute("rate", rate);
        modle.addAttribute("vnd", vnd);
        return "exchangeMoney";
    }

    @GetMapping("/")
    public String Exchange() {
        return "index";
    }
}
