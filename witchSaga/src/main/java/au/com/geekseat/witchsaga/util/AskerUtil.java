/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.geekseat.witchsaga.util;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author Galih Tias
 */
public class AskerUtil {

    private final Scanner scanner;
    private final PrintStream out;

    public AskerUtil(InputStream in, PrintStream out) {
        scanner = new Scanner(in);
        this.out = out;
    }

    public int ask(String message) {
        out.println(message);
        int result = 0;
        while (true) {   
            try {
               result =  scanner.nextInt();  
               break;
            } catch (Exception e) {
                System.out.println("Only Number Allowed !");
                scanner.nextLine();
            }
           
        }
        return result;
    }
}
