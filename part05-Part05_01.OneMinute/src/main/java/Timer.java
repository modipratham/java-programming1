/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pratham
 */
public class Timer {

    private int hundredths;
    private int seconds;

    public Timer() {
        this.hundredths = 00;
        this.seconds = 00;

    }

    public void advance() {
        this.hundredths = this.hundredths + 1;

        if (this.hundredths == 100) {
            this.hundredths = 0;
            this.seconds += 1;
            if (seconds == 60) {
                this.seconds = 0;
            }
        }
    }

    public String toString() {
        if (this.hundredths < 10 || this.seconds < 10) {
            return "0" + seconds + ":" + "0" + hundredths;
        }
        return seconds + ":" + hundredths;
    }
}
