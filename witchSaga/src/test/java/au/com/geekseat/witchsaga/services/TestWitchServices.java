/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.geekseat.witchsaga.services;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
/**
 *
 * @author Galih Tias
 */
public class TestWitchServices {
    
    @Test //positif
    public void testKillInYearPositif(){
        assertEquals(1,WitchServices.killInYear(1));
        assertEquals(2,WitchServices.killInYear(2));
        assertEquals(4,WitchServices.killInYear(3));
        assertEquals(7,WitchServices.killInYear(4));
        assertEquals(12,WitchServices.killInYear(5));
    }
    
    @Test//negatif
    public void testKillInYearNegatif(){
        assertNotEquals(0,WitchServices.killInYear(1));
        assertNotEquals(1,WitchServices.killInYear(2));
        assertNotEquals(2,WitchServices.killInYear(3));
        assertNotEquals(3,WitchServices.killInYear(4));
        assertNotEquals(6,WitchServices.killInYear(5));
    }
    
    @Test//positif
    public void testVillageTrialPositif(){
        assertEquals(2,WitchServices.villagerTrial(10, 12));
        assertEquals(7,WitchServices.villagerTrial(13, 17));
    }
    
    @Test//negatif
    public void testVillageTrialNegatif(){
        assertNotEquals(7,WitchServices.villagerTrial(12, 10));
        assertNotEquals(2,WitchServices.villagerTrial(13, 17));
    }
    
}
