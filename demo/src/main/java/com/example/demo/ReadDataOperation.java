package com.example.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadDataOperation implements DataOperation{

    @Override
    public void execute(DataState dataState) {
        ArrayList<String> fileInfo = readFile(dataState.getFilename());
        ArrayList<Glass> glasses = new ArrayList<>();
        for(var s : fileInfo) {
            String[] instr = s.split(",");
            if(s.isEmpty()){
                break;
            }
            Glass glass = new Glass(Integer.parseInt(instr[0]), Double.parseDouble(instr[1]),
                    Double.parseDouble(instr[2]), Double.parseDouble(instr[3]),
                    Double.parseDouble(instr[4]), Double.parseDouble(instr[5]),
                    Double.parseDouble(instr[6]), Double.parseDouble(instr[7]),
                    Double.parseDouble(instr[8]), Double.parseDouble(instr[9]),
                    instr[10]);
            glasses.add(glass);

        }

        dataState.setGlasses(glasses);
    }

    private static ArrayList<String> readFile(String filename) {
        try {
            ArrayList<String> fileInfo = new ArrayList<>();
            File file = new File(filename);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String str;
            while ((str  = br.readLine()) != null) {
                fileInfo.add(str);
            }
            fr.close();
            System.out.println("read");
            return fileInfo;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
