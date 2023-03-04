
package zad_prog_rozdz_7_zad_8;

import java.util.ArrayList;

/**
 * Ratings
 * @author Magdalena
 */
public class Ratings {
    
    ArrayList<String> names;
    ArrayList<Integer> test1;
    ArrayList<Integer> test2;
    ArrayList<Integer> test3;
    ArrayList<Integer> test4;
    ArrayList<Double> average;
    ArrayList<Integer> ratings;
    
    public Ratings() {
        
        names = new ArrayList<>();
        test1 = new ArrayList<>();
        test2 = new ArrayList<>();
        test3 = new ArrayList<>();
        test4 = new ArrayList<>();
        average = new ArrayList<>();
        ratings = new ArrayList<>();
    }
    
    public Ratings(ArrayList<String> aNames, ArrayList<Integer> aTest1, ArrayList<Integer> aTest2, ArrayList<Integer> aTest3, ArrayList<Integer> aTest4) {
        
        names = new ArrayList<>();
        
        for (String i : aNames) {
            
            names.add(i);
        }
        
        test1 = new ArrayList<>();
        
        for (Integer i : aTest1) {
            
            test1.add(i);
        }
        
        test2 = new ArrayList<>();
        
        for (Integer i : aTest2) {
            
            test2.add(i);
        }
        
        test3 = new ArrayList<>();
        
        for (Integer i : aTest3) {
            
            test3.add(i);
        }
        
        test4 = new ArrayList<>();
        
        for (Integer i : aTest4) {
            
            test4.add(i);
        }
    }
       
    public void setNames(ArrayList<String> aNames) {
        
        for (String i : aNames) {
            
            names.add(i);
        }
    }
    
    public String getNames(int index) {
        
        return names.get(index);
    }
    
    public void setTest1(ArrayList<Integer> aTest1) {
        
        for (Integer i : aTest1) {
            
            test1.add(i);
        }
    }
    
    public void setTest2(ArrayList<Integer> aTest2) {
        
        for (Integer i : aTest2) {
            
            test2.add(i);
        }
    }
    
    public void setTest3(ArrayList<Integer> aTest3) {
        
        for (Integer i : aTest3) {
            
            test3.add(i);
        }
    }
    
    public void setTest4(ArrayList<Integer> aTest4) {
        
        for (Integer i : aTest4) {
            
            test4.add(i);
        }
    }
    
    public void setNames(String aName) {
        
        names.add(aName);
    }
    
    public void setTest1(Integer aTest1) {
        
        test1.add(aTest1);
    }
    
    public void setTest2(Integer aTest2) {
        
        test2.add(aTest2);
    }
    
    public void setTest3(Integer aTest3) {
        
        test3.add(aTest3);
    }
    
    public void setTest4(Integer aTest4) {
        
        test4.add(aTest4);
    }
    
    public void average() {
        
        for (int index = 0; index < test1.size(); index++)
            
            average.add((test1.get(index) + test2.get(index) + test3.get(index) + test4.get(index)) / 4.0);
    }
    
    public double getAverage(int index) {
        
        return average.get(index);
    }
    
    public void ratings() {
        
        for (int index = 0; index < average.size(); index++) {
            
            if (average.get(index) >= 0 && average.get(index) <= 59) {

                ratings.add(1);
            }
            else if (average.get(index) >= 60 && average.get(index) <= 69) {

                ratings.add(2);
            }
            else if (average.get(index) >= 70 && average.get(index) <= 79) {

                ratings.add(3);
            }
            else if (average.get(index) >= 80 && average.get(index) <= 89) {

                ratings.add(4);
            }
            else if (average.get(index) >= 90 && average.get(index) <= 100) {

                ratings.add(5);
            }
            else {

            }
        }
    }
    
    public int getRatings(int index) {
        
        return ratings.get(index);
    }
}
