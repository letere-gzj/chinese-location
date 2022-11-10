package com.letere.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.letere.dto.LocationDTO;
import com.letere.entity.Location;
import com.letere.service.RunService;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileReader;

@Service
public class RunServiceImpl implements RunService {

    private final String CLASSPATH = "src/main/resources/data/";

    private final String PROVINCE_FILE = CLASSPATH + "provinces.json";

    private final String CITY_FILE = CLASSPATH + "cities.json";

    private final String AREA_FILE = CLASSPATH + "areas.json";

    private final String STREET_FILE = CLASSPATH + "streets.json";

    private final String VILLAGE_FILE = CLASSPATH + "villages.json";

    @Override
    public LocationDTO getChineseLocation() throws Exception{
        LocationDTO locationDTO = new LocationDTO();
        // 读取省数据
        String provincesJson = this.readFile(PROVINCE_FILE);
        locationDTO.setProvinces(JSONObject.parseArray(provincesJson, Location.class));
        // 读取市数据
        String citiesJson = this.readFile(CITY_FILE);
        locationDTO.setCities(JSONObject.parseArray(citiesJson, Location.class));
        // 读取区数据
        String areasJson = this.readFile(AREA_FILE);
        locationDTO.setAreas(JSONObject.parseArray(areasJson, Location.class));
        // 读取街道数据
        String streetsJson = this.readFile(STREET_FILE);
        locationDTO.setStreets(JSONObject.parseArray(streetsJson, Location.class));
        // 读取乡村数据
        String villagesJson = this.readFile(VILLAGE_FILE);
        locationDTO.setVillages(JSONObject.parseArray(villagesJson, Location.class));
        return locationDTO;
    }

    /**
     * 读取文件中的数据
     * @param filePath
     * @return
     * @throws Exception
     */
    private String readFile(String filePath) throws Exception{
        FileReader fileReader = new FileReader(new File(filePath));
        StringBuilder builder = new StringBuilder();
        char[] cbuf = new char[1000];
        int len;
        while ((len = fileReader.read(cbuf)) != -1){
            builder.append(new String(cbuf, 0, len));
        }
        fileReader.close();
        return builder.toString();
    }
}
