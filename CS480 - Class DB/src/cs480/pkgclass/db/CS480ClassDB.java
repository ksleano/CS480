/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs480.pkgclass.db;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kslea_000
 */
public class CS480ClassDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Log> logOfDB = new ArrayList<Log>();
        
        try {
        File file = new File( "log1.txt" );
        Scanner inFile = new Scanner( file );
        
        String d1, d2, d3, d4, d5, d6, d7, d8;
        
        while( inFile.hasNext() ) {
            // put everyrhing in an array
	    d1 = inFile.next();
	    d2 = inFile.next();
	    d3 = inFile.next();
            d4 = inFile.next();
            d5 = inFile.next();
            d6 = inFile.next();
            d7 = inFile.next();
            d8 = inFile.next();
	    Log en = new Log( d1, d2, d3, d4, d5, d6, d7,d8);
            logOfDB.add(en);
            
        }
        
	inFile.close();
        } catch (FileNotFoundException ex) {
            System.out.println("fdsfasfas");
        }
        
        System.out.println(logOfDB.get(0).print());
        
    }  
    
}
