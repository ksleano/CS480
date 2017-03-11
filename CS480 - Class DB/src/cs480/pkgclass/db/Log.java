/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs480.pkgclass.db;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kslea_000
 */
public class Log {
    
    private String month;
    private String date;
    private String time;
    private String src;
    private String dst;
    private String id;
    private String spt;
    private String dpt;
    
    private static int count = 0;
    private static int toStringIndexCounter = 0;
            
    public Log(String month, String date, String time, String src,
               String dst, String id, String spt, String dpt){
        this.month = month;
        this.date = date;
        this.time = time;
        this.src = src;
        this.dst = dst;
        this.id = id;
        this.spt = spt;
        this.dpt = dpt;
       
    }
    
    public String print() {
        return (month + " " + date + " " + time + " " + src + " " + dst 
                + " " + id + " " + spt + " " + dpt);
    }
}
    

