package model;

public class StringSplitter {
    // how an element from ArrayList looks like:
    // 173003,Mrs.,Willia,Q,Weigand,F,willia.weigand@gmail.com,10/20/1960,7/30/2005,158292, 133641,Mr.,Chas,F,Hurdle,M,chas.hurdle@gmail.com,4/20/1995,5/28/2016,45102

    /*
    1) the function gonna ask for the array

   2) for loop to iterate over the ArrayList
   3) we going splice each element by ","
   4) call the specific validate functions, nd pass on the string
        -> this function should return the date in corresponding data type:
                    private String employerID;
                    private String namePrefix;
                    private String firstName;
                    private char middleInitial;
                    private String lastName;
                    private boolean gender; // Male = 0, female = 1
                    private String email;
                    private Date dateOfBirth;
                    private Date dateOfJoin;
                    private int salary;
    5) if every line is good, then we going to create a Data instance [passing on the data types]

     */
}
