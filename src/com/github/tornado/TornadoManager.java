package com.github.tornado;

/**
 * Copyright (c) 2017 Eugene Sakara
 */
public final class TornadoManager {

    private static TornadoAnalytics analytics;

    private TornadoManager() {
        // nothing
    }

    public synchronized static TornadoAnalytics getAnalyticsInstance() {
        if (analytics == null) {
            analytics = new TornadoAnalyticsImpl();
        }

        return analytics;
    }
}
