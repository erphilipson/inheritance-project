package com.company;

public class Main {


    public static void main(String[] args) {
        EmailNotification emailNotification = new EmailNotification("abc", "abcdef", "Tom", "ATT");
        TextNotification textNotification = new TextNotification("Hello", "Well hello there!", "Jane", "Verizon");

        emailNotification.transport();
        textNotification.transport();

        emailNotification.showStatus();
        textNotification.showStatus();

        emailNotification.someText();

        try {
            Object emailNotificationClone = emailNotification.clone();
            emailNotification.equals(emailNotificationClone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }

}
