package com.codegym.controller;

import com.codegym.persistence.DictionnaryPersistenceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
   DictionnaryPersistenceImpl dictionnaryPersistence = new DictionnaryPersistenceImpl();
   @GetMapping("/form")
    public String form(Model model) {
       return "/form";
   }

   @GetMapping("/dictionary")
   public String dictionary(@RequestParam("english") String english, Model model) {
      String vietnamess = dictionnaryPersistence.translate(english);
      model.addAttribute("vietnamess", vietnamess);
      return "/dictionary";
   }


}
