package kg.iceknight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;

@Controller
public class HomeController {

    @Autowired
    ApplicationContext context;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        String[] names = context.getBeanDefinitionNames();
        Arrays.stream(names).forEach(System.out::println);
        return "index";
    }
}
