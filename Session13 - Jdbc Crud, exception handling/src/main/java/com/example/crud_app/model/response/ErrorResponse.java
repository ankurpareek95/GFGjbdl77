package com.example.crud_app.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
public class ErrorResponse {

    private List<String> message;
    private HttpStatus httpStatus;
    private String devMessage;
    private String errorCode;
}
