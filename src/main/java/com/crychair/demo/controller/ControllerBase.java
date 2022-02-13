package com.crychair.demo.controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

public class ControllerBase<T> {

    public T storedObject;

    @GetMapping(value = "/get")
    public String view(@ModelAttribute T entity, BindingResult bindingResult, Model model) {
        //Making a fake object if storedObject is null
        if(storedObject == null) {
            storedObject = storedObjectInit();
        }
        model.addAttribute("entry", storedObject);
        return "get";
    }

    @PostMapping(value = "/save")
    public String save(@ModelAttribute T entity, BindingResult bindingResult, Model model) {

        //HERE: If you run in debug mode with a breakpoint below. You will see T come over as Extended<java.lang.Object>
        storedObject = entity;
        model.addAttribute("entry", storedObject);
        return "get";
    }

    //Override this
    public T storedObjectInit() {
        return null;
    }



}
