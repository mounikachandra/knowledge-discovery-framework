/*
 * Copyright (C) 2015 Mastek Ltd
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
/**
 *
 * @author Alok Joshi, Mounika G, Rahul Gope, Sri Harsha Moturi Bhushan
 * Kharbikar
 */
package my.demo;

import java.util.ArrayList;

public class Variables {

    //Initialised with default values.
    //Can be changed during runtime using the GUI

    public static String filePathTxt = "/home/rahul102855/Desktop/myfiles/glioma.txt";
    public static String filePathProp = "/home/rahul102855/Desktop/myfiles/mytry.prop";
    public static String filePathTrain = "/home/rahul102855/Desktop/myfiles/mytry.train";
    public static String bratPath = "/home/rahul102855/Desktop/brat-v1.3_Crunchy_Frog/data/Internship/";
    public static String fileName = "glioma";

    //Static values cannot be changed in GUI
    //No need to change
    public static String filePathTrain2 = "/home/rahul102855/Desktop/myfiles/take2.train";

    public static String filePathTrain2multi = "/home/rahul102855/Desktop/myfiles/take2multi.train";

    public static String filePathProp2 = "/home/rahul102855/Desktop/myfiles/take2.prop";
    public static String fileNameTest2 = "disease.test";

    /**
     * The server URL
     */
    public static String bratURL = "http://127.0.0.1:8001/index.xhtml#/Internship/";

    //Visualisation
    //Frequency in abstract
    public static int proteinCount = 0;
    public static int geneCount = 0;
    public static int otherCount = 0;

    // scores in abstract
    public static ArrayList<Double> geneScores = new ArrayList<>();
    public static ArrayList<Double> proteinScores = new ArrayList<>();
    public static ArrayList<String> keyWords = new ArrayList<>();

    //Scores of diseases
    public static double leukemiaCount = 0;
    public static double breastCancerCount = 0;
    public static double pancreaticCancerCount = 0;
    public static double gliomaCount = 0;

    /**
     * To try with MultiVariate Data change this Value to true
     */
    public static boolean multiVariate = false;
    
    //Threshold Levels
    
    public static double thresholdIndividual=2;
    public static double thresholdIndividualmulti=0.5;
    public static double thresholdOutlier=6;
    public static double thresholdOutliermulti=6;
}
