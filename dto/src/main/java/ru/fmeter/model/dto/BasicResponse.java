package ru.fmeter.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@NoArgsConstructor
public class BasicResponse {
    @Getter @Setter
    @JsonProperty("message")
    private String message;
    @Getter @Setter
    @JsonProperty("localMessage")
    private String localMessage;
    @Getter @Setter
    @JsonProperty("timestamp")
    private String timestamp = new Timestamp(System.currentTimeMillis()).toString();

    public BasicResponse(String message, String localMessage) {
        this.message = message;
        this.localMessage = localMessage;
    }
}
