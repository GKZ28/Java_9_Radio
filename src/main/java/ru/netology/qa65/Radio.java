package ru.netology.qa65;

public class Radio {
    public int currentVolume;
    public int currentStation;

    public int getCurrentVolume () {
        return currentVolume;
    }
    public int getCurrentStation () {
        return currentStation;
    }

    public int setCurrentVolume (int newCurrentVolume) {
        return currentVolume = newCurrentVolume;
    }

    public int setCurrentStation () {
        return currentStation;
    }

}

// Пример реализации метода увеличения звука на 1
//
//    public void increaseVolume() {
//    if (currentVolume < 100) {
//      currentVolume = currentVolume + 1;
//    }
//  }