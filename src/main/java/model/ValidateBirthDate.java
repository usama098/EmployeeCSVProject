//package model;
//
//import java.sql.Date;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
///*
//                    private String employerID;
//                    private String namePrefix;
//                    private String firstName;
//                    private char middleInitial;
//                    private String lastName;
//                    private boolean gender; // Male = 0, female = 1
//                    private String email;
//                    private Date dateOfBirth;
//                    private Date dateOfJoin;
//                    private int salary;
// */
//
//public abstract class ValidateBirthDate {
//    public static boolean validateDate(String dateToCheck) {
//        String[] date = dateToCheck.split("/");
//        String month = date[0];
//        String day = date[1];
//        String year = date[2];
//
//        // checking year
//        if (year) {
//
//        }
//
//
//    }
//
//    //                  the date formats: 5/28/2016
//    public static Date validateBirthDate(String dateOfBirth) {
//        SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
//
//        java.util.Date date = null;
//
//
//        try {
//            date = df.parse(dateOfBirth);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//
//        Date sqlDate = null;
//        try {
//            sqlDate = new Date(date.getTime());
//        } catch (NullPointerException e) {
//            e.printStackTrace();
//        }
//
//
//        return sqlDate;
//    }
//
//    //quick test!
//    public static void main(String[] args) {
//        Date test = validateBirthDate("5/28/2016");
//        System.out.println(test);
//    }
//
//}
