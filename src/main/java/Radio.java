public class Radio {


    public int currentVolume;


    public int increaseVolume(int newCurrentVolume) {
        if (newCurrentVolume < 10) {
            currentVolume = newCurrentVolume + 1;
        } else {
            return currentVolume;
        }
        return currentVolume;
    }

    public int decreaseVolume(int newCurrentVolume) {
        if (currentVolume > 0) {
            currentVolume = newCurrentVolume - 1;
        } else {
            return currentVolume;
        }
        return currentVolume;

    }

    public int currentNumberStation;

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public int increaseNumberStation(int newNumberStation) {
        if (currentNumberStation < 9) {
            currentNumberStation = newNumberStation + 1;
        } else {
            currentNumberStation = 0;
        }
        return currentNumberStation;
    }

    public int decreaseNumberStation(int newNumberStation) {
        if (currentNumberStation > 0) {
            currentNumberStation = newNumberStation - 1;
        } else {
            currentNumberStation = 9;
        }
        return currentNumberStation;
    }

    public void setNumberStation(int newNumberStation) {

        if (newNumberStation > 9) {
            return;
        }
        currentNumberStation = newNumberStation;
    }

    public void concreteNumberStation() {

        int newNumberStation = currentNumberStation;
        setNumberStation(newNumberStation);
    }


}
