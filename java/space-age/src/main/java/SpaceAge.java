class SpaceAge {

	double age;

    SpaceAge(double seconds) {
        this.age = seconds;
    }

    double getSeconds() {
        return this.age;
    }

    double onEarth() {
        return this.age / 31557600;
    }

    double onMercury() {
        return (this.age/31557600)/0.2408467;
    }

    double onVenus() {
        return (this.age/31557600)/0.61519726;
    }

    double onMars() {
        return (this.age/31557600)/1.8808158;
    }

    double onJupiter() {
        return (this.age/31557600)/11.862615;
    }

    double onSaturn() {
        return (this.age/31557600)/29.447498;
    }

    double onUranus() {
        return (this.age/31557600)/84.016846;
    }

    double onNeptune() {
        return (this.age/31557600)/164.79132;
    }

}
