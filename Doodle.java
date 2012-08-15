import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

/*
* Title: Doodle Cheat
* Author: Nitish Parkar
* Date Created: 07/08/2012
* Last Modified: 07/08/2012
*
* Instructions:
* 1. Go to https://www.google.com/doodles/hurdles-2012  (don't click the play button)
* 2. Run this code
* 3. Switch to the browser & then hit the play button
*    (you still have to manually jump the hurdles, the program doesn't do it for you)
*/

class Doodle {

    public static void main(String args[]) throws AWTException {
        Robot robot = new Robot();

		for(int i=0;i<1000;i++)
                {
                    robot.keyPress(KeyEvent.VK_LEFT);
                    robot.keyPress(KeyEvent.VK_RIGHT);
                    robot.delay(100);

                }
    }
}