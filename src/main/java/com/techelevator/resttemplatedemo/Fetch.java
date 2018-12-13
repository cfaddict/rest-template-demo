package com.techelevator.resttemplatedemo;

import org.springframework.http.ResponseEntity;

public class Fetch {

    private String API_URL;

    public Fetch(String URL){
        this.API_URL = URL;
    }

    public ResponseEntity<String> GET() {
        return null;
    }
}