package com.company;

/**
 * Created by Ethan on 7/19/17.
 */
public class EmailNotification extends Notification {
    private String recipient;
    private String smtpProvider;
    protected String status = "Online";

    public EmailNotification(String subject, String body, String recipient, String smtpProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmtpProvider() {
        return smtpProvider;
    }

    @Override
    public void transport() {
        System.out.println(recipient);
        System.out.println(smtpProvider);
        System.out.println(getBody());
        System.out.println(getSubject());
        System.out.println(getCreatedAt());
    }

    public void showStatus() {
        System.out.println(status);
    }

    @Override
    public void someText() {
        System.out.println("Some more text for you");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmailNotification that = (EmailNotification) o;

        if (recipient != null ? !recipient.equals(that.recipient) : that.recipient != null) return false;
        if (smtpProvider != null ? !smtpProvider.equals(that.smtpProvider) : that.smtpProvider != null) return false;
        return status != null ? status.equals(that.status) : that.status == null;
    }

    @Override
    public int hashCode() {
        int result = recipient != null ? recipient.hashCode() : 0;
        result = 31 * result + (smtpProvider != null ? smtpProvider.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new EmailNotification("abc", "abcdef", "Tom", "ATT");
    }
}
