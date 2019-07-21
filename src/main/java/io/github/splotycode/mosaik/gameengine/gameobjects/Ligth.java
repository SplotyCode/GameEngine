package io.github.splotycode.mosaik.gameengine.gameobjects;

import lombok.Getter;
import lombok.Setter;
import io.github.splotycode.mosaik.util.math.Vector3D;

public class Ligth implements PositionableGameObject {

    @Getter @Setter private int id;
    @Getter @Setter private Vector3D position = new Vector3D(0, 0, 0);

    private Vector3D colour;

    public Ligth(Vector3D position, Vector3D colour) {
        this.position = position;
        this.colour = colour;
    }

    @Override
    public void update() {

    }

    @Override
    public void render() {

    }
}
