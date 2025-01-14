package CS216.Other.Exam2Prep;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PeopleList extends People {

    public static PeopleList[] People;
    

    public static PeopleList[] parsePeopleFile(String peopleFile) {
        // Create an array to store the objects
        PeopleList[] People = new PeopleList[700000];
        int index2 = 0;

        // Try to read the file
        try (BufferedReader br = new BufferedReader(new FileReader(peopleFile))) {
            String line;
            while ((line = br.readLine()) != null ) {
                // Split the line by commas
                String[] values = line.split(",");

                // Create a new People object and set its properties
                PeopleList tempdata = new PeopleList();
                tempdata.ssn = values[0];
                tempdata.last = values[1];
                tempdata.first = values[2];

                // Add the object to the array
                People[index2] = tempdata;
                index2++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return People;
    }


    public String getSocial() {
        return ssn;
    }


    public void setSocial(String ssn) {
        this.ssn = ssn;
    }


    public String getLastName() {
        return last;
    }


    public void setLastName(String last) {
        this.last = last;
    }


    public String getFirstName() {
        return first;
    }


    public void setFirstName(String first) {
        this.first = first;
    }


    public static String snnSearch(String ssn, PeopleList[] People) {
        for (PeopleList data : People) {
            if (data != null){
                if (ssn.equals(data.ssn))
                    ssn = data.first + " " + data.last + " (" + data.ssn + ") ";
                else ssn = null;
            }else;
                
        }
        return ssn;
    }


    
}
