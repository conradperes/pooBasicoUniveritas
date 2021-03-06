package collectionsGabarito;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetComparision {
	  
    public static void main(String args[]){             
        HashSet<String> fruitsStore = new HashSet<String>();
        LinkedHashSet<String> fruitMarket = new LinkedHashSet<String>();
        TreeSet<String> fruitBuzz = new TreeSet<String>();
      
        for(String fruit: Arrays.asList("mango", "apple", "banana", "banana")){
            fruitsStore.add(fruit);
            fruitMarket.add(fruit);
            fruitBuzz.add(fruit);
        }
       
        //no ordering in HashSet ??? elements stored in random order
        System.out.println("Ordenando no HashSet :" + fruitsStore);

        //insertion order or elements ??? LinkedHashSet storeds elements as insertion
        System.err.println("Ordenando no LinkedHashSet :" + fruitMarket);

        //should be sorted order ??? TreeSet stores element in sorted order 
        System.out.println("Ordenando no TreeSet :" + fruitBuzz); 
     

        //Performance test to insert 10M elements in HashSet, LinkedHashSet and TreeSet
        Set<Integer> numbers = new HashSet<Integer>();
        long startTime = System.nanoTime();
        for(int i =0; i<10000000; i++){
            numbers.add(i);
        }

        long endTime = System.nanoTime();
        System.out.println("Total tempo para inserir 10M elementos no HashSet em sec :       "
                            + (endTime - startTime));
      
      
        // LinkedHashSet performance Test ??? inserting 10M objects
        numbers = new LinkedHashSet<Integer>();
        startTime = System.nanoTime();
        for(int i =0; i<10000000; i++){
            numbers.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("Total tempo para inserir 10M elementos no LinkedHashSet em sec : "
                            + (endTime - startTime));
       
        // TreeSet performance Test ??? inserting 10M objects
        numbers = new TreeSet<Integer>();
        startTime = System.nanoTime();
        for(int i =0; i<10000000; i++){
            numbers.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("Total tempo para inserir 10M elementos no TreeSet em sec :       "
                            + (endTime - startTime));
    }
}


