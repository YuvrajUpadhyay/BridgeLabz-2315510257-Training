class Device {
    String deviceId;
    String status;
}

class Thermostat extends Device {
    int temperatureSetting;

    void displayStatus() {
        System.out.println("Temp: " + temperatureSetting + "°C");
    }
}
