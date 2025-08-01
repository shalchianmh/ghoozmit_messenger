package edu.sharif.selab.models;

public class SmsMessage extends Message{
    private String sourcePhoneNumber;
    private String targetPhoneNumber;

    @Override
    public String getSource() {
        return sourcePhoneNumber;
    }

    @Override
    public String getTarget() {
        return targetPhoneNumber;
    }

    public void setSourcePhoneNumber(String sourcePhoneNumber) {
        this.sourcePhoneNumber = sourcePhoneNumber;
    }

    public void setTargetPhoneNumber(String targetPhoneNumber) {
        this.targetPhoneNumber = targetPhoneNumber;
    }
}
