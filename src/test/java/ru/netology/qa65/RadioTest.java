package ru.netology.qa65;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RadioTest {

    @Test  // ПРОВЕРКА ВЫСТАВЛЕНИЯ ГРОМКОСТИ

    public void shouldSetVolume() {
        Radio radio = new Radio();

        int expected = 50;
        radio.setCurrentVolume(50);
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test  // ПРОВЕРКА ПРИБАВЛЕНИЯ ГРОМКОСТИ

    public void testIncreaseVolume() {
        Radio radio = new Radio();

        int expected = 51;
        radio.setCurrentVolume(50);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test  // ПРОВЕРКА УМЕНЬШЕНИЯ ГРОМКОСТИ

    public void testReduceVolume() {
        Radio radio = new Radio();

        int expected = 49;
        radio.setCurrentVolume(50);
        radio.reduceVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test // ПРОВЕРКА ВЫСТАВЛЕНИЯ СТАНЦИИ

    public void shouldSetStation () {
        Radio radio = new Radio();

        int expected =5;
        radio.setCurrentStation(5);
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test // ПЕРЕУЛЮЧЕНИЕ СТАНЦИИ ВПЕРЕД

    public void testNextStation () {
        Radio radio = new Radio();

        int expected =6;
        radio.setCurrentStation(5);
        radio.nextStation();
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test // ПЕРЕУЛЮЧЕНИЕ СТАНЦИИ НАЗАД

    public void testPreviewStation () {
        Radio radio = new Radio();

        int expected =4;
        radio.setCurrentStation(5);
        radio.previewStation();
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
    }

}