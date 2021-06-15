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
    
//    //input numeric of year
//    //return kill number
//    public static long killInYear(long year) {
//        if ((year == 0) || (year == 1)) {
//            return year;
//        } else {
//            return 1+killInYear(year - 1) + killInYear(year - 2);
//        }
//    }
//    
//    
//    //input age of death(aod), year of death(yod)
//    //output yod-aod >0 getKillInYear(yod-aod)
//    //               = 0 getKillInYear(1); because year is started since the witch take control of the village
//    //               <0  return -1, fail
//    public static long villagerTrial(int aod, int yod){
//        long tmp = yod-aod;
//        if(tmp>0){
//            return killInYear(tmp);
//        }else if(tmp==0){
//            return killInYear(1);
//        }
//        return -1;
//    }
    
    //===========================================20210615=====================
    //Update to fix performance
    
    //f(0)=0
    //f(1)=1
    //f(n) = f(n-1)+f(n-2)+1 
    // to incrase performance using internal iteration
    public static long newKillMethod(long year) {
        try {
            int prev = 0, next = 1, result = 0;
            if (year < 2) {
                return year;
            } else {
                for (int i = 1; i < year; i++) {
                    result = prev + next + 1;
                    prev = next;
                    next = result;
                }
                return result;
            }
        } catch (Exception e) {
            System.out.println("NEVER HAPEND IN REAL CASE");
            return 0;
        }

    }
    
    
    public static long newVillagerTrial(int aod, int yod){
        long tmp = yod-aod;
        if(tmp>0){
            return newKillMethod(tmp);
        }else if(tmp==0){
            return newKillMethod(1);
        }
        return -1;
    }
    
}
