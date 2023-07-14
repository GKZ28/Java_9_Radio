package ru.netology.qa65;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

    public class RadioTest {

        @Test
        public void testSetCurrentVolume() {
            Radio radio = new Radio();

            int expectedVolume = 50;
            radio.setCurrentVolume(expectedVolume);

            int actualVolume = radio.getCurrentVolume();

            Assertions.assertEquals(expectedVolume, actualVolume);
        }


    @Test
        public void shouldSetVolume () {
            Radio radio =new Radio();

            int expected = 50;
            radio.setCurrentVolume(50);
            int actual = radio.getCurrentVolume();

            Assertions.assertEquals(expected, actual);

    }

    }