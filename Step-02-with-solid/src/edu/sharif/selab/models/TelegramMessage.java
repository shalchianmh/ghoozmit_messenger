package edu.sharif.selab.models;

public class TelegramMessage extends Message{
    private String sourceUsername;
    private String targetUsername;

    @Override
    public String getSource() {
        return sourceUsername;
    }

    @Override
    public String getTarget() {
        return targetUsername;
    }

    public void setSourceUsername(String sourceUsername) {
        this.sourceUsername = sourceUsername;
    }

    public void setTargetUsername(String targetUsername) {
        this.targetUsername = targetUsername;
    }
}
