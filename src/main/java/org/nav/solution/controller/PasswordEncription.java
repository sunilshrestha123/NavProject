package org.nav.solution.controller;

import java.math.BigInteger;
import java.security.MessageDigest;

public class PasswordEncription {

    public static String encryptPassword(String inputValue) {//a
        //inputValue= a
        String salt="admin123!@#";
        // a+admin123!@#=aadmin123!@#
        String inputValuewithsalt=inputValue+salt;
        String encryptedValue = null;
        if(null == inputValue) return null;

        try {
            //message digest ko object banako with the specified algorithm name
            MessageDigest digest = MessageDigest.getInstance("MD5");

            //Input string ko byte representation ma rakhi digest bhitra update garchha..
            // update HJGHKJGKJG675757578HIHgarda kun point dekhi kun point samma ko byte value lai
            //  liney
            digest.update(inputValuewithsalt.getBytes(), 0, inputValuewithsalt.length());

            //digest ma stored bhayeko byte value lai 16 digits hexadecimal ma convert garera string ma 	//lanchha.
            encryptedValue = new BigInteger(1, digest.digest()).toString(16);

        } catch (Exception e) {
            System.out.println("Not converted");
        }
        return encryptedValue;
    }

}


