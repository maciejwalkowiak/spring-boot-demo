package pl.maciejwalkowiak.spring.boot.heroku;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.maciejwalkowiak.spring.boot.heroku.service.MessageService;

@Controller
public class HelloWorldController {
    @Autowired
    private MessageService messageService;

    @RequestMapping("/")
    @ResponseBody
    public Message hello() throws InterruptedException {
        return messageService.message();
    }
}
