package edu.nyu.cs;

import java.util.ArrayList;

public class Word extends OrderedThing implements SequentiallyOrdered {
    private ArrayList<Character> characterlist = new ArrayList<Character>();
    public Word(String characters, int wordposition) {
        for (char c: characters.toCharArray()) {
            Character C = new Character(c);
            this.characterlist.add(C);
        }
        this.setPosition(wordposition);
    }
    public Character getFirst() {
        return this.characterlist.get(0);
    }
    public Character getLast() {
        return this.characterlist.get(characterlist.size()-1);
    }
    public ArrayList<OrderedThing> getSequence() {
        ArrayList<OrderedThing> enabler=new ArrayList<OrderedThing>();
        for (Character character:this.characterlist) {
            enabler.add(character);
        }
        return enabler;
    }
    public int getPosition() {
        return this.getPosition();
    }
}
