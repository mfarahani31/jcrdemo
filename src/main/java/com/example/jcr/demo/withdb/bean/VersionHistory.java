package com.example.jcr.demo.withdb.bean;

import lombok.Data;

import java.util.Date;

import javax.jcr.Node;

@Data
public class VersionHistory {
    String fileName;
    String modifiedBy;
    Date modifiedOn;
    String identifier;
    long size;
    boolean current;
    private Node content;

}
