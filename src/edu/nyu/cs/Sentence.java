package edu.nyu.cs;

import java.util.ArrayList;

public class Sentence implements SequentiallyOrdered {
    private ArrayList<Word> wordlist = new ArrayList<Word>();
    public Sentence(String s) {
        String[] words = s.split("[^\\w']+");
        for (int i=0;i<words.length;i++) {
            Word wordx = new Word(words[i],i);
            wordlist.add(wordx);
        }
    }
    public Word getFirst() {
        return this.wordlist.get(0);
    }
    public Word getLast() {
        return this.wordlist.get(wordlist.size()-1);
    }
    public ArrayList<OrderedThing> getSequence() {
        ArrayList<OrderedThing> enabler=new ArrayList<OrderedThing>();
        for (Word word:this.wordlist) {
            enabler.add(word);
        }
        return enabler;
    }
}
