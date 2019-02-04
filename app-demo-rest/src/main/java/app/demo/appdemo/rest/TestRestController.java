package app.demo.appdemo.rest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("")
public class TestRestController
{

    @GetMapping({"/test", "/"})
    public Object test()
    {
        Map res = new HashMap();
        res.put("test", "rest running...");
        res.put("data", "data");
        return res;
    }

    @GetMapping("/string")
    public Object getString()
    {
        return "string";
    }

}
