package pro.sky.calculatortest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pro.sky.calculatortest.service.CalculatorService;

@RequestMapping("/calculator")
public class CalculatorController {

    CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("")
    public String showHello() {
        return "Welcome to Calculator!";
    }

    @GetMapping("/plus")
    public int plusTwoNum(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.plusTwoNum(num1, num2);
    }

    @GetMapping("/minus")
    public int minusTwoNum(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.minusTwoNum(num1, num2);
    }

    @GetMapping("/multiply")
    public int multiplyTwoNum(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.multiplyTwoNum(num1, num2);
    }

    @GetMapping("/divide")
    public int divideTwoNum(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.divideTwoNum(num1, num2);
    }

}
