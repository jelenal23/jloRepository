package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "rootroot");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        //sort array

        int array[] = new int[]{9,8,5,1,0,-5};
        for(int i=0; i<array.length; i++) {
            for(int j=i+1; j<array.length; j++){
                int temp=0;
            //rastuci niz
                if(array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }
            System.out.println(array[i]);
        }

    }
}