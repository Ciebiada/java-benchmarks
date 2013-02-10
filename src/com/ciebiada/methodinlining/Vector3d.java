package com.ciebiada.methodinlining;

public class Vector3d {

    public float x, y, z;

    public Vector3d(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float dot(Vector3d v) {
        return x * v.x + y * v.y + z * v.z;
    }
}
