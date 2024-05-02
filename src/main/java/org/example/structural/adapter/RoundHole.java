package org.example.structural.adapter;

public record RoundHole(double radius) {
    public boolean fits(RoundPeg roundPeg) {
        return roundPeg.getRadius() <= radius;
    }
}
