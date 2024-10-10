package ru.netology.geo;

import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GeoServiceImplTest {
    private GeoService geoService = new GeoServiceImpl();

    @Test
    void testByIp_RussianIp() {
        Location location = geoService.byIp("172.0.0.1");
        assertEquals("Moscow", location.getCity());
        assertEquals(Country.RUSSIA, location.getCountry());
    }

    @Test
    void testByIp_AmericanIp() {
        Location location = geoService.byIp("96.0.0.1");
        assertEquals("New York", location.getCity());
        assertEquals(Country.USA, location.getCountry());
    }


}