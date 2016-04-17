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
public interface GraphicsToolkit {
    
    void drawImage(Image image, int x, int y);

    void drawImage(Image image, int x, int y, int width, int height);

}
