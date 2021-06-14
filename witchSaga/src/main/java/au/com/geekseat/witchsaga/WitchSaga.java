/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.geekseat.witchsaga;

import au.com.geekseat.witchsaga.model.StoryModel;
import au.com.geekseat.witchsaga.services.WitchServices;
import java.util.Scanner;

/**
 *
 * @author Galih Tias
 */
public class WitchSaga {
    
    public static void main(String[] args) {
        StoryModel storyModel = new StoryModel();
        do {  
            storyModel.welcome();
            double vilagerTime=0;
            for (int i = 1; i <= 2; i++) {
                Scanner sc= new Scanner(System.in); 
                storyModel.aod(i);
                int aod = sc.nextInt();
                storyModel.yod(i);
                int yod = sc.nextInt();
                long tmp = WitchServices.villagerTrial(aod, yod);
                if(tmp==-1){
                    vilagerTime=0;
                    storyModel.failMessage();
                    break;
                }else{
                    vilagerTime+=tmp;
                }
            }
           if(vilagerTime>0){
               storyModel.averageMessage(vilagerTime);
               break;
           } 
        } while (true);
        storyModel.successMessage();
    }
    
}
