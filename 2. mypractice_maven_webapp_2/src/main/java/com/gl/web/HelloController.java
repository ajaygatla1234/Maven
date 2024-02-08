package com.gl.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller class for handling requests and providing a welcome message.
 */
@Controller
public class HelloController {

    /**
     * Handles requests for the root ("/") and provides a welcome message.
     *
     * @param model The ModelMap used to pass data to the view.
     * @return The name of the Thymeleaf view to render ("welcome").
     */
    @RequestMapping("/")
    public String giveWelcomeMessage(ModelMap model) {
        // Add a message attribute to the model
        model.addAttribute("message", "Spring MVC Thymeleaf hello world");
        // Return the name of the Thymeleaf view to render
        return "welcome";
    }

}
