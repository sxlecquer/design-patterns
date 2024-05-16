package org.example.behavioral.memento;

import org.example.behavioral.memento.TextArea.Memento;

import java.util.Stack;

public class Editor {
    private final Stack<Memento> history = new Stack<>();
    private final TextArea textArea = new TextArea();

    public void write(String text) {
        history.push(textArea.takeSnapshot());
        textArea.setText(text);
    }

    public void display() {
        System.out.println(textArea.getText());
    }

    public void undo() {
        if(!history.empty()) {
            textArea.restore(history.pop());
        }
    }
}
