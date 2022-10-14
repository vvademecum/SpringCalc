package com.example.Calculator.controller;

import com.example.Calculator.model.calcModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class calcController {

    @GetMapping("/")
    public String calcFormGet(Model model) {
        model.addAttribute("calculator", new calcModel());
        return "calculator";
    }

    @GetMapping("/calculatorG")
    public String resultGet(@ModelAttribute("calculator") calcModel _calcModel, Model model) {
        double a = _calcModel.getFirstNum();
        double b = _calcModel.getSecondNum();
        double result;

        switch (_calcModel.getOperation()) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                throw new IllegalStateException("ooups!");
        }
        _calcModel.setResult(String.valueOf(result));
        return "calculator";
    }

    @PostMapping("/calculatorP")
    public String resultPost(@ModelAttribute calcModel _calcModel, Model model) {
        double a = _calcModel.getFirstNum();
        double b = _calcModel.getSecondNum();
        double result;

        switch (_calcModel.getOperation()) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                throw new IllegalStateException("ooups!");
        }

        _calcModel.setResult(String.valueOf(result));
        model.addAttribute("calculator", _calcModel);
        return "calculator";
    }
}
