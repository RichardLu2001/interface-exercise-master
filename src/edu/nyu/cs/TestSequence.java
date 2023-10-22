package edu.nyu.cs;

public class TestSequence {
    public static void main(String[] args) {
        Sentence sentence1 = new Sentence("Hello World!");
        sentence1.getFirst();
        sentence1.getLast();
        sentence1.getSequence();
        Word word = (Word)sentence1.getSequence().get(0);
        word.getFirst();
        word.getLast();
        word.getSequence();
        word.getPosition();
    }
}
