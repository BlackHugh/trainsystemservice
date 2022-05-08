package com.citi.trainingsystem.utility;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Logger;

public final class HardAddress {
    static Logger logger = Logger.getLogger(HardAddress.class.getName());

    private static volatile String value;

    public static String getValue(){
        if(value!=null){
            return value;
        }
        InetAddress ip;
        try{
            ip = InetAddress.getLocalHost();
            NetworkInterface network = NetworkInterface.getByInetAddress(ip);
            byte[] mac = network.getHardwareAddress();

            StringBuilder stringBuilder = new StringBuilder();
            for(int i=0;i<mac.length; i++){
                stringBuilder.append(String.format("%02X%s", mac[i], (i<mac.length - 1)?"-":""));
            }
            value = stringBuilder.toString();
        } catch (UnknownHostException | SocketException e) {
            logger.warning("Current Application is invalid in network.");
            value = "";
        }
        return value;
    }
}
