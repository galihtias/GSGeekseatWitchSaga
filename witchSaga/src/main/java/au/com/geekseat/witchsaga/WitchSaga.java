/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.geekseat.witchsaga;

import au.com.geekseat.witchsaga.model.StoryModel;
import au.com.geekseat.witchsaga.services.WitchServices;
import au.com.geekseat.witchsaga.util.AskerUtil;

/**
 *
 * @author Galih Tias
 */
public class WitchSaga {

    public static void main(String[] args) {
        do {            
        } while (expellTheWitch(new AskerUtil(System.in, System.out)));
        new StoryModel().successMessage();
    }

    public static boolean  expellTheWitch(AskerUtil asker) {
        StoryModel storyModel = new StoryModel();
            storyModel.welcome();
            double vilagerTime = 0;
            for (int i = 1; i <= 2; i++) {
                long tmp = WitchServices.newVillagerTrial(
                        asker.ask(storyModel.aod(i)), 
                        asker.ask(storyModel.yod(i))
                );
                if (tmp == -1) {
                    vilagerTime = 0;
                    storyModel.failMessage();
                    break;
                } else {
                    vilagerTime += tmp;
                }
            }
            if (vilagerTime > 0) {
                storyModel.averageMessage(vilagerTime);
                return false;
            }
            return true;
    }

}
