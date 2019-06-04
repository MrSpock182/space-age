class SpaceAge {

    private final double secondsOnEarth = 31557600L;

    private double seconds;


    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double onEarth() {
        return this.seconds / secondsOnEarth;
    }

    double onMercury() {
        double secondsOnYear = 0.2408467 * secondsOnEarth;
        return this.seconds / secondsOnYear;
    }

    double onVenus() {
        double secondsOnYear = 0.61519726 * secondsOnEarth;
        return this.seconds / secondsOnYear;
    }

    double onMars() {
        double secondsOnYear = 1.8808158 * secondsOnEarth;
        return this.seconds / secondsOnYear;
    }

    double onJupiter() {
        double secondsOnYear = 11.862615 * secondsOnEarth;
        return this.seconds / secondsOnYear;
    }

    double onSaturn() {
        double secondsOnYear = 29.447498 * secondsOnEarth;
        return this.seconds / secondsOnYear;
    }

    double onUranus() {
        double secondsOnYear = 84.016846 * secondsOnEarth;
        return this.seconds / secondsOnYear;
    }

    double onNeptune() {
        double secondsOnYear = 164.79132 * secondsOnEarth;
        return this.seconds / secondsOnYear;
    }

}
