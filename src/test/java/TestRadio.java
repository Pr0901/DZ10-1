import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRadio {

    @Test
    public void increaseVolumeMiddle() {
        Radio volume = new Radio();
        volume.currentVolume = 5;

        int expected = 6;
        int actual = volume.increaseVolume(volume.currentVolume);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void increaseVolumeMax() {
        Radio volume = new Radio();
        volume.currentVolume = 10;

        int expected = 10;
        int actual = volume.increaseVolume(volume.currentVolume);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void decreaseVolumeMiddle() {
        Radio volume = new Radio();
        volume.currentVolume = 5;

        int expected = 4;
        int actual = volume.decreaseVolume(volume.currentVolume);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void decreaseVolumeMin() {
        Radio volume = new Radio();
        volume.currentVolume = 0;

        int expected = 0;
        int actual = volume.decreaseVolume(volume.currentVolume);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void increaseNumberStationMiddle() {
        Radio numberStation = new Radio();
        numberStation.currentNumberStation = 4;

        int expected = 5;
        int actual = numberStation.increaseNumberStation(numberStation.currentNumberStation);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void increaseNumberStationMax() {
        Radio numberStation = new Radio();
        numberStation.currentNumberStation = 9;

        int expected = 0;
        int actual = numberStation.increaseNumberStation(numberStation.currentNumberStation);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void decreaseNumberStationMiddle() {
        Radio numberStation = new Radio();
        numberStation.currentNumberStation = 4;

        int expected = 3;
        int actual = numberStation.decreaseNumberStation(numberStation.currentNumberStation);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void decreaseNumberStationMin() {
        Radio numberStation = new Radio();
        numberStation.currentNumberStation = 0;

        int expected = 9;
        int actual = numberStation.decreaseNumberStation(numberStation.currentNumberStation);

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void numberStationRight() {
        Radio numberStation = new Radio();
        numberStation.setNumberStation(8);


        numberStation.concreteNumberStation();
        int expected = 8;
        int actual = numberStation.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberStationWrong() {
        Radio numberStation = new Radio();
        numberStation.setNumberStation(15);


        numberStation.concreteNumberStation();
        int expected = numberStation.currentNumberStation;
        int actual = numberStation.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }
}
