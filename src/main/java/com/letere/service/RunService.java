package com.letere.service;

import com.letere.dto.LocationDTO;
import com.letere.entity.Location;

import java.util.List;

public interface RunService {
    /**
     * 获取中国所有省，市，区，街道数据
     * @return
     */
    LocationDTO getChineseLocation() throws Exception;
}
