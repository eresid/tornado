package com.github.tornado;

/**
 * Main interface for interacting with Tornado Analytics.
 *
 * Copyright (c) 2017 Eugene Sakara
 */
public interface TornadoAnalytics {

    /**
     * Set unique user or device ID
     *
     * @param uniqueId - please, use user's id from server, or device id
     */
    void identify(String uniqueId);

    /**
     * Track event without any data
     *
     * @param event - name of event
     */
    void track(String event);
}
