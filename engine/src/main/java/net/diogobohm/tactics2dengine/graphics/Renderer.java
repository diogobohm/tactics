/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.diogobohm.tactics2dengine.graphics;

/**
 *
 * @author diogo
 */
public interface Renderer {
    
    void render(GraphicsToolkit graphics);
    
    int getScreenWidth();
    int getScreenHeight();
}
