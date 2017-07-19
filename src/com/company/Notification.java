package com.company;
import java.time.LocalDateTime;

/**
 * Created by Ethan on 7/19/17.
 */
public abstract class Notification {
    private LocalDateTime createdAt;
    private String subject;
    private String body;
    protected String status = "Away";

    public Notification(String subject, String body) {
        this.subject = subject;
        this.body = body;
        createdAt = LocalDateTime.now();
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public abstract void transport();

    public void showStatus() {
        System.out.println(status);
    }

    protected void someText() {
        System.out.println("Here is some text!");
    }
}
