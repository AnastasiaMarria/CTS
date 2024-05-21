package cts.test.design.patterns.structurals.composite;

import java.util.List;

public abstract class CompositeNode extends AbstractGroup implements  InterfaceNPC {
    List<CompositeNode> nodes;  //to hold child nodes, representing either individual NPCs or groups.

    @Override
    public void add(AbstractGroup item) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(AbstractGroup item) {
        throw new UnsupportedOperationException();

    }

    @Override
    public AbstractGroup get(int index) {
        return null;
    }
}
