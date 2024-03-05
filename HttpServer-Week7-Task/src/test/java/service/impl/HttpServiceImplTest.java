package service.impl;

import org.junit.jupiter.api.Test;
import static common.HttpServer.PORT;
import static org.junit.jupiter.api.Assertions.*;

class HttpServiceImplTest {

    @Test
    void start() {

        HttpServiceImpl httpService = new HttpServiceImpl();
        httpService.start(PORT);

        String expected = httpService.start(8080);
        String actual = "";
        assertEquals(expected, actual);
    }
}