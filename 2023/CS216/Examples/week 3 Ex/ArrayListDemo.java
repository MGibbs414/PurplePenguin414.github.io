// Delta College - CST 183 - Klingler & Gaddis Text                          
// This program demonstrates basic use of the ArrayList class

import java.util.ArrayList;    // Needed for ArrayList class

public class ArrayListDemo
{
   public static void main(String[] args)
   {
      // Create an ArrayList to store Strings
      ArrayList<String> cityList = new ArrayList<String>();
      
      // Add some names to the ArrayList.
      cityList.add("Detroit");
      cityList.add("Grand Rapids");
      cityList.add("Flint");
      cityList.add("Columbus");
      cityList.add("Lansing");  
          
      // Display the size of the ArrayList.
      System.out.println("Number of cities: " + cityList.size());
      
      // Perform some list edits
      if (cityList.contains("Columbus"))
         cityList.remove("Columbus");       

      // Display the items in list (using abbreviated for-loop)
      for (String name : cityList)
         System.out.println(name);
   }
}
