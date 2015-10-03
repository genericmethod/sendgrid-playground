package com.genericmethod.sendgridplayground;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;

/**
 * @author cfarrugia
 */
public class SendGridEvent {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Generated("org.jsonschema2pojo")
    @JsonPropertyOrder({
            "sg_message_id",
            "email",
            "timestamp",
            "smtp-id",
            "event",
            "category",
            "url",
            "asm_group_id"
    })

    @JsonProperty("sg_message_id")
    public String sgMessageId;
    @JsonProperty("email")
    public String email;
    @JsonProperty("timestamp")
    public Integer timestamp;
    @JsonProperty("smtp-id")
    public String smtpId;
    @JsonProperty("event")
    public String event;
    @JsonProperty("category")
    public String category;
    @JsonProperty("url")
    public String url;
    @JsonProperty("asm_group_id")
    public Integer asmGroupId;

    public String getSgMessageId() {
        return sgMessageId;
    }

    public void setSgMessageId(String sgMessageId) {
        this.sgMessageId = sgMessageId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public String getSmtpId() {
        return smtpId;
    }

    public void setSmtpId(String smtpId) {
        this.smtpId = smtpId;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getAsmGroupId() {
        return asmGroupId;
    }

    public void setAsmGroupId(Integer asmGroupId) {
        this.asmGroupId = asmGroupId;
    }

}
