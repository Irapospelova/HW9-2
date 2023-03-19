package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParamRadioTest {
    @Test
    public void shouldSetCurrentStation() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(29);

        int expected = 29;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationAboveMax() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(30);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationBelowMin() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(23);
        radio.nextStation();
        int expected = 24;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationAboveMax() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(29);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(17);
        radio.prevStation();
        int expected = 16;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetPrevStationBelowMin() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(0);
        radio.prevStation();
        int expected = 29;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
}
