package pl.maciejwalkowiak.spring.boot.heroku;

import org.joda.time.DateTime;

public class Message {
    private String content;
    private DateTime createdAt;

    public Message(String content) {
        this.content = content;
        this.createdAt = DateTime.now();
    }

    public String getContent() {
        return content;
    }

    public DateTime getCreatedAt() {
        return createdAt;
    }
}
