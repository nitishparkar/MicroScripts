import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

/*
* Title: Doodle Cheat 2
* Author: Nitish Parkar
* Date Created: 08/08/2012
* Last Modified: 08/08/2012
*
* Instructions:
* 1. Go to https://www.google.com/doodles/basketball-2012  (don't click the play button)
* 2. Run this code
* 3. Switch to the browser & then hit the play button
*/

class Doodle1 {

    public static void main(String args[]) throws AWTException {
        Robot robot = new Robot();
        int delayIncrement = 300;
        robot.delay(3000);
	for(int i=1;i<20;i++)
        {
            if(i%5==0){
                delayIncrement += 180;
                if(delayIncrement == 660){
                    i++;
                }
            }
            robot.keyPress(KeyEvent.VK_SPACE);
            robot.keyRelease(KeyEvent.VK_SPACE);
            robot.delay(delayIncrement);
            robot.keyPress(KeyEvent.VK_SPACE);
            robot.keyRelease(KeyEvent.VK_SPACE);

            robot.delay(930);

        }
    }
}