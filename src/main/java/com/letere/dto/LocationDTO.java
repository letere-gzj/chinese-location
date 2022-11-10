package com.letere.dto;

import com.letere.entity.Location;
import lombok.Data;

import java.util.List;

@Data
public class LocationDTO {
    /**
     * 省数据
     */
    List<Location> provinces;

    /**
     * 市数据
     */
    List<Location> cities;

    /**
     * 区数据
     */
    List<Location> areas;

    /**
     * 街道数据
     */
    List<Location> streets;

    /**
     * 乡村数据
     */
    List<Location> villages;
}
