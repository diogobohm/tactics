/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.diogobohm.tactics2dengine;

/**
 *
 * @author diogo
 */
public class Camera {
    
    private int focusX;
    private int focusY;
    
    public Camera() {
        this(0, 0);
    }
    
    public Camera(int focusX, int focusY) {
        this.focusX = focusX;
        this.focusY = focusY;
    }

    /**
     * @return the focusX
     */
    public int getFocusX() {
        return focusX;
    }

    /**
     * @param focusX the focusX to set
     */
    public void setFocusX(int focusX) {
        this.focusX = focusX;
    }

    /**
     * @return the focusY
     */
    public int getFocusY() {
        return focusY;
    }

    /**
     * @param focusY the focusY to set
     */
    public void setFocusY(int focusY) {
        this.focusY = focusY;
    }
    
}
