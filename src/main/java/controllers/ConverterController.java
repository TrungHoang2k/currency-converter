package controllers;


import curency.converter.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConverterController {
    @Autowired
    private ConverterController customerService;

    @GetMapping("/converter")
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("view/converter.jsp");
        return modelAndView;
    }

    @GetMapping("/result")
    public ModelAndView showResult(@ModelAttribute("converter") Converter converter) {
        System.out.println(converter.getRate());
        System.out.println(converter.getUsd());
        ModelAndView modelAndView = new ModelAndView("view/result.jsp");
        converter.setResult(converter.getRate() * converter.getUsd());
        System.out.println(converter.getResult());
        modelAndView.addObject("converter", converter);
        return modelAndView;
    }
}