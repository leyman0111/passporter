package ru.fmeter.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.File;

public class PassportResponse<T extends File> extends BasicResponse {
    @JsonProperty("result")
    @Getter @Setter
    private File passport;

    public PassportResponse(File passport) {
        this.passport = passport;
    }
}
