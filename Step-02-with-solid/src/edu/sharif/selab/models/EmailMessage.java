package edu.sharif.selab.models;

public class EmailMessage extends Message{
    private String sourceEmailAddress;
    private String targetEmailAddress;

    @Override
    public String getSource() {
        return sourceEmailAddress;
    }

    @Override
    public String getTarget() {
        return targetEmailAddress;
    }

    public void setSourceEmailAddress(String sourceEmailAddress) {
        this.sourceEmailAddress = sourceEmailAddress;
    }

    public void setTargetEmailAddress(String targetEmailAddress) {
        this.targetEmailAddress = targetEmailAddress;
    }
}
