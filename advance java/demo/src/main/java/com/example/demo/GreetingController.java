package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
// making a class a controlleer

@Controller
public class GreetingController {

   // getmapping is to provide the url path when that patch is called the metho below will execute
    @GetMapping("/greeting")
    public String greeting  (

                // the url can accept som query paramaters : provide a placeholder for the variable
                // for which the value will be supplied in the url . you can mention if the
                // parameter is mandetory . if cliet is not giving the query parameter
                //you can provide a default value as for.ex world . String name is just a plecaholder name
                @RequestParam(name = "name", required = false, defaultValue = "world") String name,
                // model argument   the code will be executed when someone invokes greeting
                Model model){
            // this is the busssness logic whatatever the query string parameter from request param
            // we are capturing that and adding that value. with the variable name in the add attributes of the model

            model.addAttribute("name", name);
            // returning the view so the filename will hbe intercepted by the view resolver to check  for an html that matches that name

            return "greeting";
        }

    }



