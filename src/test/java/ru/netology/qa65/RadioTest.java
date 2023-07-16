package ru.netology.qa65;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RadioTest {
// ТЕСТЫ ГРОМКОСТЬ --------------------------------------------------------


    @Test  // ВЫСТАВЛЕНИЕ ГРОМКОСТИ

    public void shouldSetVolume() {
        Radio radio = new Radio();

        int expected = 50;
        radio.setCurrentVolume(50);
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test  // ПРИБАВЛЕНИЕ ГРОМКОСТИ

    public void testIncreaseVolume() {
        Radio radio = new Radio();

        int expected = 51;
        radio.setCurrentVolume(50);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test  // УМЕНЬШЕНИЕ ГРОМКОСТИ

    public void testReduceVolume() {
        Radio radio = new Radio();

        int expected = 49;
        radio.setCurrentVolume(50);
        radio.reduceVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test  // ПРИБАВЛЕНИЯ ГРОМКОСТИ ПОГРАНИЧНЫЕ ЗНАЧЕНИЯ

    public void testIncreaseVolumeMax() {
        Radio radio = new Radio();

        int expected = 100;
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test  // УМЕНЬШЕНИЕ ГРОМКОСТИ ПОГРАНИЧНЫЕ ЗНАЧЕНИЯ

    public void testReduceVolumeMin() {
        Radio radio = new Radio();

        int expected = 0;
        radio.setCurrentVolume(0);
        radio.reduceVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test  // ВЫСТАВЛЕНИЕ ГРОМКОСТИ ВЫШЕ ГРАНИЦ

    public void shouldSetVolumeAboveMax() {
        Radio radio = new Radio();

        int expected = 100;
        radio.setCurrentVolume(101);
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test  // ВЫСТАВЛЕНИЕ ГРОМКОСТИ НИЖЕ ГРАНИЦ

    public void shouldSetVolumeBelowMax() {
        Radio radio = new Radio();

        int expected = 0;
        radio.setCurrentVolume(-1);
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }


// ТЕСТЫ СТАНЦИИ --------------------------------------------------------


    @Test // ПРОВЕРКА ВЫСТАВЛЕНИЯ СТАНЦИИ

    public void shouldSetStation() {
        Radio radio = new Radio();

        int expected = 5;
        radio.setCurrentStation(5);
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // ПЕРЕКЛЮЧЕНИЕ СТАНЦИИ ВПЕРЕД

    public void testNextStation() {
        Radio radio = new Radio();

        int expected = 5;
        radio.setCurrentStation(4);
        radio.nextStation();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // ПЕРЕКЛЮЧЕНИЕ СТАНЦИИ НАЗАД

    public void testPreviewStation() {
        Radio radio = new Radio();

        int expected = 3;
        radio.setCurrentStation(4);
        radio.previewStation();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // ПЕРЕКЛЮЧЕНИЕ СТАНЦИИ ВПЕРЕД ПОГРАНИЧНОЕ ЗНАЧЕНИЕ

    public void testNextStationMax() {
        Radio radio = new Radio();

        int expected = 0;
        radio.setCurrentStation(9);
        radio.nextStation();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // ПЕРЕКЛЮЧЕНИЕ СТАНЦИИ НАЗАД ПОГРАНИЧНОЕ ЗНАЧЕНИЕ

    public void testPreviewStationMin() {
        Radio radio = new Radio();

        int expected = 9;
        radio.setCurrentStation(0);
        radio.previewStation();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // ПРОВЕРКА ВЫСТАВЛЕНИЯ СТАНЦИИ ВЫШЕ ГРАНИЦ

    public void shouldSetStationAboveMax() {
        Radio radio = new Radio();

        int expected = 9;
        radio.setCurrentStation(10);
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // ПРОВЕРКА ВЫСТАВЛЕНИЯ СТАНЦИИ НИЖЕ ГРАНИЦ

    public void shouldSetStationBelowMax() {
        Radio radio = new Radio();

        int expected = 0;
        radio.setCurrentStation(-1);
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
}