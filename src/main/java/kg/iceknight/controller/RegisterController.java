package kg.iceknight.controller;

import kg.iceknight.dto.UserDto;
import kg.iceknight.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

@Controller
@RequestMapping(value = "/register")
public class RegisterController {

    private final UserService userService;

    @Autowired
    public RegisterController(UserService userService1) {
        this.userService = userService1;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getRegister(WebRequest request, Model model) {
        return "register";
    }

    @RequestMapping(method = RequestMethod.POST)
    public void postRegister(WebRequest request, Model model) {
        UserDto userDto = new UserDto();
        userDto.setEmail(request.getParameter("email"));
        userDto.setPassword(request.getParameter("password"));
        userService.register(userDto);
    }



}
