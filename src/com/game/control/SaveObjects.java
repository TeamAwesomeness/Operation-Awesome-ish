package com.game.control;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
        
public class SaveObjects {
    
    private void writeFile(String filePath, String outputMessage) {
        File outputFile;
        BufferedWriter outputWriter;
        
        try {
            outputFile = new File(filePath);
            
            outputWriter = new BufferedWriter(new FileWriter(outputFile));
            outputWriter.write(outputMessage);
            outputWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    private void readFile(String filePath) {
        File inputFile;
        BufferedReader inputReader;
        
        try {
            inputFile = new File(filePath);
            inputReader = new BufferedReader(new FileReader(inputFile));
            String fileText = inputReader.readLine();
            System.out.println(fileText);
            inputReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}

