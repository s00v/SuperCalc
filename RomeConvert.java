package com.example.supercalc;

public class RomeConvert<rNms> {

    int rNumsConv(char[] rNms){
        char rNm;
        int a = 0;
        int i = 0;
        
        for (int j = 0; j < (rNms.length - 1); j++) {

            if(j == 0){

                if (rConv(String.valueOf(rNms[j])) < rConv(String.valueOf(rNms[j + 1]))) {
                    a = (rConv(String.valueOf(rNms[j + 1])) - rConv(String.valueOf(rNms[j])));
                }

                else {
                    a = (rConv(String.valueOf(rNms[j + 1])) + rConv(String.valueOf(rNms[j])));
                }
            }

                if ( j > 0) {
                    if (rConv(String.valueOf(rNms[j])) < rConv(String.valueOf(rNms[j + 1]))) {
                        a += (rConv(String.valueOf(rNms[j + 1])) - (2 * rConv(String.valueOf(rNms[j]))));
                    }

                    else {
                        a += (rConv(String.valueOf(rNms[j + 1])));
                    }
                }


        }


        return a;
    }

    int rNumsConv(String rNm){

        char[] rNms = rNm.toCharArray();
        int a = 0;
        int i = 0;

        if (rNm.length() == 1) {
            a = rConv(rNms[0]);

        }

        for (int j = 0; j < (rNms.length - 1); j++) {

            if(j == 0){

                if (rConv(String.valueOf(rNms[j])) < rConv(String.valueOf(rNms[j + 1]))) {
                    a = (rConv(String.valueOf(rNms[j + 1])) - rConv(String.valueOf(rNms[j])));
                }

                else {
                    a = (rConv(String.valueOf(rNms[j + 1])) + rConv(String.valueOf(rNms[j])));
                }
            }




            if ( j > 0) {
                if (rConv(String.valueOf(rNms[j])) < rConv(String.valueOf(rNms[j + 1]))) {
                    a += (rConv(String.valueOf(rNms[j + 1])) - (2 * rConv(String.valueOf(rNms[j]))));
                }

                else {
                    a += (rConv(String.valueOf(rNms[j + 1])));
                }
            }



        }


        return a;
    }

    public String rFlip(int a){
        String b = "";
        if (a == 1){
            b = "I";
        }

        if (a == 2){
            b = "II";
        }

        if (a == 3){
            b = "III";
        }

        if (a == 5){
            b = "V";
        }

        if (a == 10){
            b = "X";
        }

        if (a == 50){
            b = "L";
        }

        if (a == 100){
            b = "C";
        }

        if (a == 500){
            b = "D";
        }

        if (a == 1000){
            b = "M";
        }

        return b;
    }

    public int rConv(String rNums){
        int a = 0;
        if (rNums.equals("I")){
            a = 1;
        }

        if (rNums.equals("II")){
            a = 2;
        }

        if (rNums.equals("III")){
            a = 3;
        }

        if (rNums.equals("V")){
            a = 5;
        }

        if (rNums.equals("X")){
            a = 10;
        }

        if (rNums.equals("L")){
            a = 50;
        }

        if (rNums.equals("C")){
            a = 100;
        }

        if (rNums.equals("D")){
            a = 500;
        }

        if (rNums.equals("M")){
            a = 1000;
        }

        return a;
    }

    public int rConv(char rNums){

        int a = 0;

        if (String.valueOf(rNums).equals(String.valueOf('I'))){
            a = 1;
        }

        if (String.valueOf(rNums).equals(String.valueOf('V'))){
            a = 5;
        }

        if (String.valueOf(rNums).equals(String.valueOf('X'))){
            a = 10;
        }

        if (String.valueOf(rNums).equals(String.valueOf('L'))){
            a = 50;
        }

        if (String.valueOf(rNums).equals(String.valueOf('C'))){
            a = 100;
        }

        if (String.valueOf(rNums).equals(String.valueOf('D'))){
            a = 500;
        }

        if (String.valueOf(rNums).equals(String.valueOf('M'))){
            a = 1000;
        }

        return a;
    }




    String ArabConv(int n){
        String t = Integer.toString(n);
        char[] s = t.toCharArray();
        int[] p = new int[s.length];
        String newStr = "";
        for(int i = 0; i < s.length; i++){

            p[i] = Character.getNumericValue(s[i]);

        }

        char[][] arabConv = {{'I','X','C','M'},{'V','L','D'}};


        for ( int d = 0; d < p.length ; d++) {

            int m = p[d];

                if ( m >= 1 && m < 4){

                    for (int i = 0; i < m; i++){

                    newStr += arabConv[ 0 ][ (p.length - d - 1)];
                }


                }

                if (m == 4){

                    newStr += arabConv[0][(p.length - d - 1)];

                    newStr += arabConv[1][(p.length - d - 1)];

                }

                if (m == 5){

                    newStr += arabConv[1][(p.length - d - 1)];

                }

                if (m > 5 && m < 9){

                    newStr += arabConv[1][(p.length - d - 1)];


                    for (int i = 5; i < m; i++){
                        newStr += arabConv[0][(p.length - d - 1)];
                    }


                }

            if (m == 9){

                newStr += arabConv[0][(p.length - d - 1)];

                newStr += arabConv[0][(p.length - d)];

            }

                if (m == 0){
                    newStr += "";

                }

            }

//      }

        return newStr;



    }

    String ArabConv(String n){

        char[] s = n.toCharArray();
        int[] p = new int[s.length];
        String newStr = "";
        for(int i = 0; i < s.length; i++){

            p[i] = Character.getNumericValue(s[i]);

        }

        char[][] arabConv = {{'I','X','C','M'},{'V','L','D'}};


        for ( int d = 0; d < p.length ; d++) {

            int m = p[d];

            if ( m >= 1 && m < 4){

                for (int i = 0; i < m; i++){

                    newStr += arabConv[ 0 ][ (p.length - d - 1)];
                }


            }

            if (m == 4){

                newStr += arabConv[0][(p.length - d - 1)];

                newStr += arabConv[1][(p.length - d - 1)];

            }

            if (m == 5){

                newStr += arabConv[1][(p.length - d - 1)];

            }

            if (m > 5 && m < 9){

                newStr += arabConv[1][(p.length - d - 1)];


                for (int i = 5; i < m; i++){
                    newStr += arabConv[0][(p.length - d - 1)];
                }


            }

            if (m == 9){

                newStr += arabConv[0][(p.length - d - 1)];

                newStr += arabConv[0][(p.length - d)];

            }

            if (m == 0){
                newStr += "";

            }

        }

        return newStr;

    }


    String ArabConv(char[] n){

        int[] p = new int[n.length];
        String newStr = "";
        for(int i = 0; i < n.length; i++){

            p[i] = Character.getNumericValue(n[i]);

        }

        char[][] arabConv = {{'I','X','C','M'},{'V','L','D'}};

        for ( int d = 0; d < p.length ; d++) {

            int m = p[d];

            if ( m >= 1 && m < 4){

                for (int i = 0; i < m; i++){

                    newStr += arabConv[ 0 ][ (p.length - d - 1)];
                }


            }

            if (m == 4){

                newStr += arabConv[0][(p.length - d - 1)];

                newStr += arabConv[1][(p.length - d - 1)];

            }

            if (m == 5){

                newStr += arabConv[1][(p.length - d - 1)];

            }

            if (m > 5 && m < 9){

                newStr += arabConv[1][(p.length - d - 1)];


                for (int i = 5; i < m; i++){
                    newStr += arabConv[0][(p.length - d - 1)];
                }


            }

            if (m == 9){

                newStr += arabConv[0][(p.length - d - 1)];

                newStr += arabConv[0][(p.length - d)];

            }

            if (m == 0){
                newStr += "";

            }

        }

        return newStr;

    }


}
