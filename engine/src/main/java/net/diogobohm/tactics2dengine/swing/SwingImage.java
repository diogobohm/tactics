/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.diogobohm.tactics2dengine.swing;

import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author diogo
 */
public class SwingImage extends ImageIcon implements net.diogobohm.tactics2dengine.graphics.Image {
    
    public SwingImage(URL url) {
        super(url);
    }
}
