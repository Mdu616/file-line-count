/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filecount;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author mduduzi
 */
public class FileCount {

    public static void main(String[] args) throws IOException {
        String line = " ";
        int count = 0;
        int ccount = 0;
        // buffer opens path and reads the file
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\mduduzi\\Desktop\\FileCount\\src\\filecount\\Test1.txt"));

        try {
            while ((line = br.readLine()) != null) {
                count++; //increment total number of lines in the file

                if (line.contains("//") || line.contains("/*") || line.contains("*/") || line.isEmpty()) { //check if file contains comments and counts them
                    line = line.trim();
                    ccount++; //increment the number of commented lines and empty lines
                }
            }
            br.close();
        } catch (FileNotFoundException e) {
        }
        System.out.println("code lines count =" + (count - ccount)); //print line of code by subtracting total of lines from the commented lines
        System.out.println("commented lines count =" + ccount);
        System.out.println("total number of lines count =" + count);
    }

}
