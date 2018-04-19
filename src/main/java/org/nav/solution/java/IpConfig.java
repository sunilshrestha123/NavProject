package org.nav.solution.java;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpConfig {
    public static void main(String[] args) throws Exception {
        InetAddress myipaddress=InetAddress.getLocalHost();
        System.out.println(myipaddress);
    }
}
