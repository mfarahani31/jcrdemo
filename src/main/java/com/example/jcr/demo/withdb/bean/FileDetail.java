package com.example.jcr.demo.withdb.bean;

import lombok.Data;

import java.io.InputStream;

@Data
public class FileDetail {

    private String fileName;
    private long size;
    private String contentType;
    private InputStream fileData;
    private String createdBy;

}
