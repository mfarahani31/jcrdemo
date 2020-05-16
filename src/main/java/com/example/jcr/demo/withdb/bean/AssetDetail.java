package com.example.jcr.demo.withdb.bean;

import lombok.Data;

@Data
public class AssetDetail {

    private String assetName;
    private double size;
    private String createdBy;
    private String createdOn;
    private String assetType;
    private String assetId;

}
