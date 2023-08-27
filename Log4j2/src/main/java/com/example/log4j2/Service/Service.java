package com.example.log4j2.Service;

import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.ThreadContext;

import java.util.UUID;

@org.springframework.stereotype.Service
@Log4j2
public class Service {

    public void logService() {
        String uuid = UUID.randomUUID().toString();
        ThreadContext.put("uuid", uuid);
        log.info("Uuid gán vào thread của log4j2: "+uuid);
    }
}
