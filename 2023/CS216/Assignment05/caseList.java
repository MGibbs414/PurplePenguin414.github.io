package CS216.Assignment05;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;


public class caseList {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String fileName = "2023/CS216/Assignment05/accused.txt";
        Case[] dataArray = parseFile(fileName);
        System.out.println("Case Loaded");

        System.out.println("The Accused List is Provided Here: ");


        
    }



    public static Case[] parseFile(String fileName) {
        Case[] dataArray = new Case[688049];
        int index = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null ) {
                String[] values = line.split(",");
                Case data = new Case();
                data.ssn = values[0];
                data.code = values[1];
                data.Ccode = Integer.parseInt(values[2]);
                data.date1 = values[3];
                data.date2 = values[4];
                dataArray[index] = data;
                index++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataArray;
    }
}
class Case {
    String ssn;
    String code;
    int Ccode;
    String date1;
    String date2;

    public String getSSN() {
        return ssn;
    }

    public void setSSN(String ssn) {
        this.ssn = ssn;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getCcode() {
        return Ccode;
    }

    public void setCcode(int Ccode) {
        this.Ccode = Ccode;
    }

    public String getDate1() {
        return date1;
    }

    public void setDate1(String date1) {
        this.date1 = date1;
    }
    
    public String getDate2() {
        return date2;
    }

    public void setDate2(String date2) {
        this.date2 = date2;
    }

    @Override
    public String toString() {
        return "Case{" +
                "Social of Accused = " + ssn +
                ", Crime Code = " + code +
                ", County = " + Ccode +
                ", Date of Crime = " + date1 +
                ", Court Date = " + date2 +
                '}';
    }
}

