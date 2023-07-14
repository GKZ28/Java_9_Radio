package ru.netology.qa65;

public class Radio {
    public int currentVolume; // значение громкости
    public int currentStation; // значение станции

    public int getCurrentVolume() {
        return currentVolume;
    }  // Узнать громкость
    public int getCurrentStation() {return currentStation;} // узнать станцию

    public void setCurrentVolume(int newCurrentVolume) { // Выставить громкость
        if (newCurrentVolume > 100) {
            currentVolume = 100;
        }
        else if (newCurrentVolume < 0) {
            currentVolume = 0;
        } else {
            currentVolume = newCurrentVolume;
        }
    }

    public void increaseVolume () { // Увеличение громкости
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void reduceVolume () { // Уменьшение громкости
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public void setCurrentStation(int newCurrentStation) { // выставить станцию
       if ( newCurrentStation > 9) {
           currentStation = 9;
       } else if (newCurrentStation < 0) {
           currentStation = 0;
        } else {
           currentStation = newCurrentStation; }
    }

    public void nextStation () { // Переключить станцию вперед
        if (currentStation < 9) {
            currentStation++;
        } else { currentStation = 0;}
    }

    public void previewStation () { // Переключить станцию назад
        if (currentStation > 0) {
            currentStation--;
        } else { currentStation = 9;}
    }




}

// Пример реализации метода увеличения звука на 1
//
//    public void increaseVolume() {
//    if (currentVolume < 100) {
//      currentVolume = currentVolume + 1;
//    }
//  }