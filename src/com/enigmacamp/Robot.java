package com.enigmacamp;

public class Robot {
    int x;
    int y;

    public Robot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void atas(){
        this.y += 1;
    }

    public void bawah(){
        this.y -= 1;
    }

    public void kanan(){
        this.x += 1;
    }

    public void kiri(){
        this.x -= 1;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
