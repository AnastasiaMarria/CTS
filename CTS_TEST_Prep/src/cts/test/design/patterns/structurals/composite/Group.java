package cts.test.design.patterns.structurals.composite;

import java.util.ArrayList;

public class Group extends CompositeNode {  //represents a group of NPCs

    public Group(){
        this.nodes=new ArrayList<>();
    }
    @Override
    public void move(int distance) {
        if(this.nodes != null){
            for(CompositeNode node : nodes)
            {
                node.move(distance);
            }
        }
    }

    @Override
    public void shoot(int power) {
        return;
    }

    @Override
    public void add(AbstractGroup item) {
        this.nodes.add((CompositeNode) item);
    }

    @Override
    public void remove(AbstractGroup item) {
        this.nodes.remove(item);
    }

    @Override
    public AbstractGroup get(int index) {
        return this.nodes.get(index);
    }
}
