package org.example.behavioral.memento;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.write("You will never get a job!");
        editor.display();
        editor.write("I agree with you. I'm too stupid :(");
        editor.display();

        System.out.println();

        editor.undo();
        editor.display();
        editor.write("No, because if you love a job, it's not a job.");
        editor.display();
    }
}
