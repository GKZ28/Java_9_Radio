package ru.netology.qa65;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
// ТЕСТЫ ГРОМКОСТЬ --------------------------------------------------------

    Radio radio = new Radio(20, 0, 0);

    @Test  // ВЫСТАВЛЕНИЕ ГРОМКОСТИ

    public void shouldSetVolume() {

        int expected = 50;
        radio.setCurrentVolume(50);
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test  // ПРИБАВЛЕНИЕ ГРОМКОСТИ

    public void testIncreaseVolume() {

        int expected = 51;
        radio.setCurrentVolume(50);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test  // УМЕНЬШЕНИЕ ГРОМКОСТИ

    public void testReduceVolume() {

        int expected = 49;
        radio.setCurrentVolume(50);
        radio.reduceVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test  // ПРИБАВЛЕНИЯ ГРОМКОСТИ ПОГРАНИЧНЫЕ ЗНАЧЕНИЯ

    public void testIncreaseVolumeMax() {

        int expected = 100;
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test  // УМЕНЬШЕНИЕ ГРОМКОСТИ ПОГРАНИЧНЫЕ ЗНАЧЕНИЯ

    public void testReduceVolumeMin() {

        int expected = 0;
        radio.setCurrentVolume(0);
        radio.reduceVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test  // ВЫСТАВЛЕНИЕ ГРОМКОСТИ ВЫШЕ ГРАНИЦ

    public void shouldSetVolumeAboveMax() {

        int expected = 100;
        radio.setCurrentVolume(101);
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test  // ВЫСТАВЛЕНИЕ ГРОМКОСТИ НИЖЕ ГРАНИЦ

    public void shouldSetVolumeBelowMax() {

        int expected = 0;
        radio.setCurrentVolume(-1);
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }


// ТЕСТЫ СТАНЦИИ --------------------------------------------------------


    @Test // ПРОВЕРКА ВЫСТАВЛЕНИЯ СТАНЦИИ

    public void shouldSetStation() {

        int expected = 5;
        radio.setCurrentStation(5);
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // ПЕРЕКЛЮЧЕНИЕ СТАНЦИИ ВПЕРЕД

    public void testNextStation() {

        int expected = 5;
        radio.setCurrentStation(4);
        radio.nextStation();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // ПЕРЕКЛЮЧЕНИЕ СТАНЦИИ НАЗАД

    public void testPreviewStation() {

        int expected = 3;
        radio.setCurrentStation(4);
        radio.previewStation();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // ПЕРЕКЛЮЧЕНИЕ СТАНЦИИ ВПЕРЕД ПОГРАНИЧНОЕ ЗНАЧЕНИЕ

    public void testNextStationMax() {

        int expected = 0;
        radio.setCurrentStation(19);
        radio.nextStation();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // ПЕРЕКЛЮЧЕНИЕ СТАНЦИИ НАЗАД ПОГРАНИЧНОЕ ЗНАЧЕНИЕ

    public void testPreviewStationMin() {

        int expected = 19;
        radio.setCurrentStation(0);
        radio.previewStation();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // ПРОВЕРКА ВЫСТАВЛЕНИЯ СТАНЦИИ ВЫШЕ ГРАНИЦ

    public void shouldSetStationAboveMax() {

        int expected = 19;
        radio.setCurrentStation(25);
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // ПРОВЕРКА ВЫСТАВЛЕНИЯ СТАНЦИИ НИЖЕ ГРАНИЦ

    public void shouldSetStationBelowMax() {

        Radio radio1 = new Radio();
        int expected = 0;
        radio.setCurrentStation(-1);
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

}