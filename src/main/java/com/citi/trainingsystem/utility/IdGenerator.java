package com.citi.trainingsystem.utility;

import java.security.SecureRandom;

public final class IdGenerator {
    private static class Holder{
        static final  SecureRandom numberGenerator = new SecureRandom();
    }

    public synchronized static String generateUniqueId(int hashcode){
        Integer randomNumber = Holder.numberGenerator.nextInt();
        String macAddress = HardAddress.getValue();
        long currentTime = System.currentTimeMillis();
        return new StringBuilder().append(macAddress).append(currentTime)
                .append(randomNumber).append(hashcode).toString();
    }
}
