package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class ExchangeController {
    @PostMapping("/exchange")
    public String exchangeMoney(@RequestParam("money") String money, @RequestParam("moneyOutput") String moneyOutput,@RequestParam("valueMoney") double valueMoney, Model model) {
        String exchangeString= money+"to"+moneyOutput;
        Map<String,Double> moneyMap= new HashMap<>();
        moneyMap.put("usdtovnd",23000.0);
        moneyMap.put("vndtousd",1/23000.0);
        double result = moneyMap.get(exchangeString) * valueMoney;
        model.addAttribute("result", result);
        model.addAttribute("rate",moneyMap.get(exchangeString));
        return "exchangeMoney";
    }

    @GetMapping("/exchangeMoney")
    public String Exchange() {
        return "exchangeMoney";
    }
}
