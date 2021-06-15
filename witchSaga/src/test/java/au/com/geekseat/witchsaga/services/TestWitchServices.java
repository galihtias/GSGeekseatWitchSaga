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
    public void testKillInYearPositif() {
        assertEquals(1, WitchServices.newKillMethod(1));
        assertEquals(2, WitchServices.newKillMethod(2));
        assertEquals(4, WitchServices.newKillMethod(3));
        assertEquals(7, WitchServices.newKillMethod(4));
        assertEquals(12, WitchServices.newKillMethod(5));
    }

    @Test//negatif
    public void testKillInYearNegatif() {
        assertNotEquals(0, WitchServices.newKillMethod(1));
        assertNotEquals(1, WitchServices.newKillMethod(2));
        assertNotEquals(2, WitchServices.newKillMethod(3));
        assertNotEquals(3, WitchServices.newKillMethod(4));
        assertNotEquals(6, WitchServices.newKillMethod(-5));
    }

    @Test//positif
    public void testVillageTrialPositif() {
        assertEquals(2, WitchServices.newVillagerTrial(10, 12));
        assertEquals(7, WitchServices.newVillagerTrial(13, 17));
    }

    @Test//negatif
    public void testVillageTrialNegatif() {
        assertNotEquals(7, WitchServices.newVillagerTrial(12, -10));
        assertNotEquals(2, WitchServices.newVillagerTrial(-13, 17));
    }

//    =====================TEST PERFORMANCE=================================
//    public void testTimeOld() {
//        for (int i = 0; i < 50; i++) {
//            long start = System.currentTimeMillis();
//            System.out.println(WitchServices.killInYear(i));
//            long end = System.currentTimeMillis();
//            System.out.println("DEBUG: old time " + (end - start) + " MilliSeconds");
//        }
//    }
    
    public void testTimeNew() {
        for (int i = 0; i < 50; i++) {
            long start = System.currentTimeMillis();
            WitchServices.newKillMethod(i);
            long end = System.currentTimeMillis();
            System.out.println("DEBUG: new time " + (end - start) + " MilliSeconds");
        }
    }
}
