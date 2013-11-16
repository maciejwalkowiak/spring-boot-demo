package pl.maciejwalkowiak.spring.boot.heroku.service;

import org.springframework.stereotype.Component;
import pl.maciejwalkowiak.spring.boot.heroku.Message;

@Component
public class MessageService {
    public Message message() {
        return new Message("hello world");
    }
}
