/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.diogobohm.tactics2dengine;

import net.diogobohm.tactics2dengine.graphics.GraphicsToolkit;
import net.diogobohm.tactics2dengine.graphics.Image;
import net.diogobohm.tactics2dengine.graphics.ImageResourceFactory;
import net.diogobohm.tactics2dengine.graphics.Renderer;

/**
 *
 * @author diogo
 */
public class GraphicsRenderer implements Renderer {
    
    protected static final int HEIGHT = 720;
    protected static final int WIDTH = 1280;
    private final Image FLOOR_IMAGE;
    private final Image WALL_IMAGE;
    private final Image CHAR_IMAGE;
    private final Image BG_IMAGE;
    
    private final Scene scene;
    
    public GraphicsRenderer(ImageResourceFactory imageFactory, Scene scene) {
        this.scene = scene;
        
        FLOOR_IMAGE = imageFactory.getImage("ground-1.png");
        WALL_IMAGE = imageFactory.getImage("wall-1.png");
        BG_IMAGE = imageFactory.getImage("bg-1.png");
        CHAR_IMAGE = imageFactory.getImage("char1.png");
    }
    
    @Override
    public int getScreenWidth() {
        return WIDTH;
    }
    
    @Override
    public int getScreenHeight() {
        return HEIGHT;
    }
    
    @Override
    public void render(GraphicsToolkit toolkit) {
        Scenario scenario = scene.getScenario();
        Camera camera = scene.getCamera();
        
        int[][] heightMap = scenario.getHeightMap();
        int groundPicWidth = 32;
        int groundPicHeight = 17;
        int wallPicWidth = groundPicWidth;
        int wallPicHeight = groundPicHeight;
        
        int blockSizeMultiplier = 2;
        
        int blockHeightSize = wallPicHeight * blockSizeMultiplier;
        int groundWidth = groundPicWidth * blockSizeMultiplier;
        int groundHeight = groundPicHeight * blockSizeMultiplier;
        int halfGroundWidth = groundWidth / 2;
        int halfGroundHeight = groundHeight / 2;
        int wallWidth = groundWidth;
        int wallHeight = groundHeight;
        
        
        int cameraX = camera.getFocusX();
        int cameraY = camera.getFocusY();
        
        int cameraBlockHeight = heightMap[cameraY][cameraX];
        
        int startX = WIDTH / 2 - halfGroundWidth - (getXDistanceForBlock(cameraX, cameraY) * halfGroundWidth);
        int startY = HEIGHT / 2 - halfGroundWidth - getYDistanceForBlock(cameraX, cameraY, cameraBlockHeight) * blockHeightSize;
        
        toolkit.drawImage(BG_IMAGE, 0, 0, WIDTH, HEIGHT);
        
        for (int y = 0; y < heightMap.length; y+=1) {
            for (int x = 0; x < heightMap[0].length; x+=1) {
                int height = heightMap[y][x];
                int blockX = startX + getXDistanceForBlock(x, y) * halfGroundWidth;
                int blockY = startY + getYDistanceForBlock(x, y, height) * halfGroundHeight;
                
                toolkit.drawImage(FLOOR_IMAGE, blockX, blockY, groundWidth, groundHeight);
                for (int h = 0; h <= height; h++) {
                    toolkit.drawImage(WALL_IMAGE, blockX, blockY + halfGroundHeight + h * wallHeight / 2,
                            wallWidth, wallHeight);
                }
            }
        }
        
        int charPicWidth = 24;
        int charPicHeight = 32;
        int charX = 4;
        int charY = 1;
        int charHeight = heightMap[charY][charX];
        
        int charPosX = startX + 4 * blockSizeMultiplier + getXDistanceForBlock(charX, charY) * halfGroundWidth;
        int charPosY = startY - 20 * blockSizeMultiplier + getYDistanceForBlock(charX, charY, charHeight) * halfGroundHeight;

        toolkit.drawImage(CHAR_IMAGE, charPosX, charPosY,
                charPicWidth * blockSizeMultiplier, charPicHeight * blockSizeMultiplier);
    }
    
    private int getXDistanceForBlock(int x, int y) {
        return x - y;
    }
    
    private int getYDistanceForBlock(int x, int y, int h) {
        return x + y - h;
    }
}
