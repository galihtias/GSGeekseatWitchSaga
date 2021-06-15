/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.geekseat.witchsaga;

import au.com.geekseat.witchsaga.util.AskerUtil;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/**
 *
 * @author Galih Tias
 */
public class TestWitchSaga {

    @Test //positif
    public void testExpelWitchPositive() {
        AskerUtil asker = Mockito.mock(AskerUtil.class);
        Mockito.when(asker.ask("Age of death Villager_1")).thenReturn(10);
        Mockito.when(asker.ask("Year of death Villager_1")).thenReturn(12);
        Mockito.when(asker.ask("Age of death Villager_2")).thenReturn(13);
        Mockito.when(asker.ask("Year of death Villager_2")).thenReturn(17);
        assertEquals(false, WitchSaga.expellTheWitch(asker));
    }
    
    @Test //negative
    public void testExpelWitchNegative() {
        AskerUtil asker = Mockito.mock(AskerUtil.class);
        Mockito.when(asker.ask("Age of death Villager_1")).thenReturn(-10);
        Mockito.when(asker.ask("Year of death Villager_1")).thenReturn(10);
        Mockito.when(asker.ask("Age of death Villager_2")).thenReturn(10);
        Mockito.when(asker.ask("Year of death Villager_2")).thenReturn(-9);
        assertEquals(true, WitchSaga.expellTheWitch(asker));
    }

    
}
