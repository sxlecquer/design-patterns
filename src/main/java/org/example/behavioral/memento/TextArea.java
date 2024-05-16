package org.example.behavioral.memento;

public class TextArea {
    private String text = "";

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Memento takeSnapshot() {
        return new Memento(text);
    }

    public void restore(Memento memento) {
        text = memento.getSavedText();
    }

    public static class Memento {
        private final String text;

        public Memento(String text) {
            this.text = text;
        }

        private String getSavedText() {
            return text;
        }
    }
}
