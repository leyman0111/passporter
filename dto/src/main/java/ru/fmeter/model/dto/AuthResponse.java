package ru.fmeter.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

public class AuthResponse<T extends String> extends BasicResponse {
    @JsonProperty("result")
    @Getter @Setter
    private String result;

    public AuthResponse(String result) {
        this.result = result;
    }
}
