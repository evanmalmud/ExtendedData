package com.crychair.demo.controller;

import com.crychair.demo.model.DnisData;
import com.crychair.demo.model.Extended;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DnisController extends ControllerBase<Extended<DnisData>> {

    @Override
    public Extended<DnisData> storedObjectInit() {
        Extended<DnisData> entry = new Extended<>();
        entry.setName("INITIAL");
        entry.setCustomData(new DnisData("INITIAL", "123456789"));
        return entry;
    }

    /**
     *  Even if Overridden this still comes over as Extended<java.lang.Object>.
     *
     */
    /**@Override
    @PostMapping(value = "/save")
    public String save(@ModelAttribute  Extended<DnisData> entity, BindingResult bindingResult, Model model) {

        //HERE: If you run in debug mode with a breakpoint below. You will see T come over as Extended<java.lang.Object>
        storedObject = entity;
        model.addAttribute("entry", storedObject);
        return "get";
    }**/
}
