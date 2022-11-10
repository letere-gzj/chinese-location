package com.letere.runner;

import com.letere.dto.LocationDTO;
import com.letere.service.RunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements ApplicationRunner {
    @Autowired
    public RunService runService;

    /**
     * springboot启动后自动执行
     * @param args
     * @throws Exception
     */
    @Override
    public void run(ApplicationArguments args) throws Exception {
        LocationDTO chineseLocation = runService.getChineseLocation();
        // ..... 按需进行数据处理，数据转换，写入mysql数据之类操作，层级关系直接用原生数据的code就行，没必要自己重建层级关系
        System.out.println("finish!");
    }
}
