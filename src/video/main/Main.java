package video.main;

import static video.ui.AppUi.inputIntger;
import static video.ui.AppUi.startScreen;

public class Main {
    public static void main(String[] args) {

        AppController controller = new AppController();



        while (true){

            startScreen();

            int selectNumber = inputIntger(">>>");
            controller.chooseSystem(selectNumber);



        }










    }
}
