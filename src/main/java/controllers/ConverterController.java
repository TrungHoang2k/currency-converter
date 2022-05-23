package controllers;

import curency.converter.model.Converter;
import curency.converter.service.CurencyConverter;
import curency.converter.service.impl.CurencyConverterImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConverterController {

    @GetMapping("/converter")
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("view/converter.jsp");
        return modelAndView;
    }

    @PostMapping("/result")
    public ModelAndView showResult(@ModelAttribute("converter") Converter converter) {
        ModelAndView modelAndView = new ModelAndView("view/result.jsp");
        CurencyConverter curencyConverter = new CurencyConverterImpl();
        modelAndView.addObject("result", curencyConverter.convert(converter.getUsd(), converter.getRate()));
        return modelAndView;
    }
}