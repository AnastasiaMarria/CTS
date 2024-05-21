package cts.test.design.patterns.structurals.composite;

public abstract class AbstractGroup { //methods for managing groups of NPC
    public abstract void add (AbstractGroup item);  //adds an item to the group
    public abstract void remove (AbstractGroup item);  //remove an item from the group
    public abstract AbstractGroup get(int index); //retrieves an item from the gruou by index
}
