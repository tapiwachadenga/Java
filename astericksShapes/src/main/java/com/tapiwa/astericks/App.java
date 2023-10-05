package com.tapiwa.astericks;

import org.fusesource.jansi.AnsiConsole;

import static org.fusesource.jansi.Ansi.ansi;

public class App {

    public static void main(String[] args) throws Exception {
        AnsiConsole.systemInstall();
        System.out.print(ansi().bold().fgBrightRed().a(">").fgBrightYellow().a(">").fgBrightGreen().a(">").reset().a(" "));
      // System.out.println("Hello World!");
      	Ohh.ohh(5, 5);
    }
}
