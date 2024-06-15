package org.samtech.backendproveedores.dto;

public class ResponseDto {
    private String response;

    public ResponseDto(String response) {
        this.response = response;
    }

    public ResponseDto() {
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
