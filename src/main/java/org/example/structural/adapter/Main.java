package org.example.structural.adapter;

public class Main {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(3.9);

        System.out.println("Round peg with r = " + roundPeg.getRadius()
                + " fits a round hole with r = " + roundHole.radius() + ", doesn't it? " + roundHole.fits(roundPeg));

        SquarePeg squarePeg = new SquarePeg(7);
        SquarePegAdapter adapter = new SquarePegAdapter(squarePeg);

        System.out.println("Square peg with width = " + squarePeg.getWidth()
                + " fits a round hole with r = " + roundHole.radius() + ", doesn't it? " + roundHole.fits(adapter));

        squarePeg.setWidth(7.5);
        System.out.println("Square peg with width = " + squarePeg.getWidth()
                + " doesn't fit a round hole with r = " + roundHole.radius() + ", does it? " + !roundHole.fits(adapter));

    }
}
