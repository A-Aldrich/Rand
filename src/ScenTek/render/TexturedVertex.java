/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ScenTek.render;

import java.awt.Color;

/**
 *
 * @author aldrich_a
 */
public class TexturedVertex extends ColoredVertex{
    private float[] st;
    public TexturedVertex(float[] coords, Color c, float[] stCoords) {
        super(coords, c);
        st = stCoords;
    }
    
    public float[] getSTCoords(){
        return st;
    }
    
    
    
}
