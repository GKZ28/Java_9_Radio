package ru.netology.qa65;

public class Radio {

    private int numberOfStations = 10; // Количество станций
    private int currentStation = 0; // значение станции
    private int currentVolume = 0; // значение громкости
    private int lastStation = numberOfStations - 1; // номер последней станции

    public Radio (int numberOfStations) {
        this.numberOfStations = numberOfStations;
        this.lastStation = numberOfStations - 1;
      }

    public Radio() {}

    public int getCurrentStation() {return currentStation;} // узнать станцию

    public void setCurrentStation(int newCurrentStation) { // выставить станцию
        if (newCurrentStation > lastStation) {
            currentStation = lastStation;
        } else if (newCurrentStation < 0) {
            currentStation = 0;
        } else {
            currentStation = newCurrentStation;
        }
    }

    public void nextStation() { // Переключить станцию вперед
        if (currentStation < lastStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void previewStation() { // Переключить станцию назад
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = lastStation;
        }
    }



    //__________________________________________________________________________________-

    public int getCurrentVolume() {
        return currentVolume;
    }  // Узнать громкость

    public void setCurrentVolume(int newCurrentVolume) { // Выставить громкость
        if (newCurrentVolume > 100) {
            currentVolume = 100;
        } else if (newCurrentVolume < 0) {
            currentVolume = 0;
        } else {
            currentVolume = newCurrentVolume;
        }
    }

    public void increaseVolume() { // Увеличение громкости
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void reduceVolume() { // Уменьшение громкости
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

}
