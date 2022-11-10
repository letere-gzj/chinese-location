package com.letere.entity;

import lombok.Data;

@Data
public class Location {
    /**
     * 编号
     */
    private Long code;

    /**
     * 名称
     */
    private String name;

    /**
     * 街道编号
     */
    private Long streetCode;

    /**
     * 区编号
     */
    private Long areaCode;

    /**
     * 市编号
     */
    private Long cityCode;

    /**
     * 省编号
     */
    private Long provinceCode;
}
