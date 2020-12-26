package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadiomanTest {


    @Test
    public void shouldIncreaseVolumeNotMax() {
        Radioman radioman = new Radioman();
        radioman.setVolume(7);
        radioman.increaseVolume();
        assertEquals(8, radioman.getVolume());
    }
    @Test
    public void shouldIncreaseVolumeMax() {
        Radioman radioman = new Radioman();
        radioman.setVolume(100);
        radioman.increaseVolume();
        assertEquals(100, radioman.getVolume());
    }
    @Test
    public void shouldDecreaseVolumeNotMin() {
        Radioman radioman = new Radioman();
        radioman.setVolume(7);
        radioman.decreaseVolume();
        assertEquals(6, radioman.getVolume());
    }
    @Test
    public void shouldDecreaseVolumeMin() {
        Radioman radioman = new Radioman();
        radioman.setVolume(0);
        radioman.decreaseVolume();
        assertEquals(0, radioman.getVolume());
    }
    @Test
    public void shouldIncreaseStation() {
        Radioman radioman = new Radioman();
        radioman.setStation(7);
        radioman.increaseStation();
        assertEquals(8, radioman.getStation());
    }
    @Test
    public void shouldIncreaseStationMax() {
        Radioman radioman = new Radioman();
        radioman.setStation(10);
        radioman.increaseStation();
        assertEquals(0, radioman.getStation());

    }
    @Test
    public void shouldDecreaseStation() {
        Radioman radioman = new Radioman();
        radioman.setStation(7);
        radioman.decreaseStation();
        assertEquals(6, radioman.getStation());
    }
    @Test
    public void shouldDecreaseStationMin() {
        Radioman radioman = new Radioman();
        radioman.setStation(0);
        radioman.decreaseStation();
        assertEquals(10, radioman.getStation());
    }
    @Test
    public void shouldStationControlDefault() {
        Radioman radioman = new Radioman();
        radioman.setStationControl(10);
       assertEquals(10, radioman.getStationControl());
    }
    @Test
    public  void shouldStationControlConstructor() {
        Radioman radioman = new Radioman(15);
        radioman.getStationControl();
        assertEquals(15, radioman.getStationControl());

    }
    @Test
    public void shouldStationControl() {
        Radioman radioman = new Radioman();
        radioman.setStationControl(15);
        assertEquals(15, radioman.getStationControl());

    }
    @Test
    public void shouldStationControlFix() {
        Radioman radioman = new Radioman(35);
        radioman.setStationControl(25);
        assertEquals(25, radioman.getStationControl());
    }
}


