package com.example.jcr.demo.withdb.bean;

import lombok.Data;

@Data
public class FileResponse {

    private byte[] bytes;
    private String contentType;
}
