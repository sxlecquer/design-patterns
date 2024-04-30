package org.example.prototype.component;

import org.example.prototype.stuff.Prototype;

import java.util.Objects;

public class GPSNavigator implements Prototype {
    private final String route;

    public GPSNavigator(String route) {
        this.route = route;
    }

    public GPSNavigator(GPSNavigator gpsNavigator) {
        this.route = gpsNavigator.route;
    }

    @Override
    @SuppressWarnings("all")
    public Prototype clone() {
        return new GPSNavigator(this);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        GPSNavigator that = (GPSNavigator) o;
        return Objects.equals(route, that.route);
    }

    @Override
    public int hashCode() {
        return Objects.hash(route);
    }
}
