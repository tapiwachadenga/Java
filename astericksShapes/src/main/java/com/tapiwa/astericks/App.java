package com.tapiwa.astericks;

import org.fusesource.jansi.AnsiConsole;
import static org.fusesource.jansi.Ansi.ansi;
import java.security.SecureRandom;

public class App {

    public static void main(String[] args) throws Exception {
        AnsiConsole.systemInstall();
        System.out.print(ansi().bold().fgBrightRed().a(">").fgBrightYellow().a(">").fgBrightGreen().a(">").reset().a(" "));
      // System.out.println("Hello World!");
        int high = 10;
        int low = 3;
      	Ohh.ohh((new SecureRandom()).nextInt(high - low) + low, (new SecureRandom()).nextInt(high - low) + low);
    }
}
