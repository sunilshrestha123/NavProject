package java.org.nav.solution.pojo;

import java.security.SecureRandom;

public class TokenGenerator {
    public static void main(String[] args) {
        System.out.println();
    }

        protected static SecureRandom random = new SecureRandom();

        public synchronized String generateToken( String username ) {
            long longToken = Math.abs( random.nextLong() );
            String random = Long.toString( longToken, 16 );
            return ( username + ":" + random );
        }
    }

