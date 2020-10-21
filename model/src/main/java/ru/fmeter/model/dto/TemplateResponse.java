package ru.fmeter.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

public class TemplateResponse<T> extends BasicResponse {
    @JsonProperty("result")
    @Getter @Setter
    private T result;

    public TemplateResponse(T result) {
        this.result = result;
    }
}