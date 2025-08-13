public class VolumeOfEarth {
    public static void main(String[] args) {
        double radiusKm = 6378; // Radius in kilometers
        double radiusMiles = radiusKm / 1.6; // Convert km to miles

        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 +" and cubic miles is " + volumeMiles3);
    }
}
