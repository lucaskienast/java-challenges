package com.kienast.concurrency.extras.threadCoordination;

import java.math.BigInteger;

public class PowerCalculatingThread extends Thread {

    private BigInteger result = BigInteger.ONE;;
    private final BigInteger base;
    private final BigInteger power;

    public PowerCalculatingThread(BigInteger base, BigInteger power) {
        this.base = base;
        this.power = power;
    }

    @Override
    public void run() {
        result = base.pow(power.intValue());
    }

    public BigInteger getResult() {
        return result;
    }
}
