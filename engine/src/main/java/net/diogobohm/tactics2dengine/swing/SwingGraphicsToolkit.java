/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.diogobohm.tactics2dengine.swing;

import java.awt.Graphics2D;
import net.diogobohm.tactics2dengine.graphics.GraphicsToolkit;
import net.diogobohm.tactics2dengine.graphics.Image;

/**
 *
 * @author diogo
 */
public class SwingGraphicsToolkit implements GraphicsToolkit {

    private final Graphics2D graphics;
    
    public SwingGraphicsToolkit(Graphics2D graphics) {
        this.graphics = graphics;
    }
    
    @Override
    public void drawImage(Image image, int x, int y) {
        SwingImage nativeImage = (SwingImage) image;
        
        graphics.drawImage(nativeImage.getImage(), x, y, nativeImage.getIconWidth(),
                nativeImage.getIconHeight(), nativeImage.getImageObserver());
    }
    
    @Override
    public void drawImage(Image image, int x, int y, int width, int height) {
        SwingImage nativeImage = (SwingImage) image;
        
        graphics.drawImage(nativeImage.getImage(), x, y, width, height,
                nativeImage.getImageObserver());
    }
}
