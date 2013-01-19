package com.ciebiada.escapeanalysis;

public class Vector3d {

    private float x, y, z;

    public Vector3d(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3d add(Vector3d v) {
        return new Vector3d(x + v.x, y + v.y, z + v.z);
    }

    public float dot(Vector3d v) {
        return x * v.x + y * v.y + z * v.z;
    }
}
