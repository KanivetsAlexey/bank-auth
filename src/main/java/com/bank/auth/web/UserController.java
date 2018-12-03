package com.bank.auth.web;

import com.bank.auth.model.User;
import com.bank.auth.service.SecurityService;
import com.bank.auth.service.UserService;
import com.bank.auth.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Controller responsible for navigating to different user pages and actions
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private UserValidator userValidator;

    /**
     * Shows registration user page
     *
     * @param model data model from UI
     * @return "registration.jsp" page name
     */
    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("userForm", new User());

        return "registration";
    }

    /**
     * Accepts filled user form and validates it
     *
     * @param userForm form with filled fields
     * @param bindingResult error registration and validation result holder
     * @param model data model from
     * @return "thankRegistration.jsp" page name where should be redirected
     */
    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult, Model model) {
        userValidator.validate(userForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "registration";
        }

        userService.save(userForm);

        securityService.autoLogin(userForm.getUsername(), userForm.getPasswordConfirm());

        return "redirect:/thankRegistration";
    }

    /**
     * Shows open account offers page
     *
     * @param model data model from UI
     * @return "open_account.jsp" page name
     */
    @RequestMapping(value = "/open_account", method = RequestMethod.GET)
    public String openAccount(Model model) {
        model.addAttribute("userForm", new User());

        return "open_account";
    }

    /**
     * Shows login user page
     *
     * @param model data model from UI
     * @param error holds error status
     * @param logout holds logout status
     * @return "login.jsp" page name
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
        if (error != null) {
            model.addAttribute("error", "Your username and password is invalid.");
        }

        if (logout != null) {
            model.addAttribute("message", "You have been logged out successfully.");
        }

        return "login";
    }

    /**
     * Shows welcome page
     *
     * @param model data model from UI
     * @return "welcome.jsp" page name
     */
    @RequestMapping(value = {"/", "/welcome"}, method = RequestMethod.GET)
    public String welcome(Model model) {
      return "welcome";
    }

    /**
     * Shows after registration thank-you page
     *
     * @param model data model from UI
     * @return "thankRegistration.jsp" page name
     */
    @RequestMapping(value = {"/thankRegistration"}, method = RequestMethod.GET)
    public String thankRegistration(Model model) {
        return "thankRegistration";
    }
}
