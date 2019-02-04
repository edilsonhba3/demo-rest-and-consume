package app.demo.appdemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Controller
@RequestMapping("")
public class TestRestController
{

    @Autowired
    RestTemplate restTemplate;

    String path = "http://localhost:8080/app-demo-rest/";

    @GetMapping({"/home", "/"})
    public Object test(Model model)
    {
        Map map = restTemplate.getForObject(path, Map.class);
        model.addAttribute("test", "test");
        model.addAttribute("response", map);
        return "home";
    }

    @GetMapping("/consume")
    public Object getString()
    {
        return "consume";
    }
}
