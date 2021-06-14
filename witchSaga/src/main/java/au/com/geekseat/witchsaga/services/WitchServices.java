/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.geekseat.witchsaga.services;

/**
 *
 * @author Galih Tias
 */
public class WitchServices {
    
    //input numeric of year
    //return kill number
    public static long killInYear(long year) {
        if ((year == 0) || (year == 1)) {
            return year;
        } else {
            return 1+killInYear(year - 1) + killInYear(year - 2);
        }
    }
    
    //input age of death(aod), year of death(yod)
    //output yod-aod >0 getKillInYear(yod-aod)
    //               = 0 getKillInYear(1); because year is started since the witch take control of the village
    //               <0  return -1, fail
    public static long villagerTrial(int aod, int yod){
        long tmp = yod-aod;
        if(tmp>0){
            return killInYear(tmp);
        }else if(tmp==0){
            return killInYear(1);
        }
        return -1;
    }
    
}
