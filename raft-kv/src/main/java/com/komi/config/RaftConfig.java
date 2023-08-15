package com.komi.config;

/**
 * @author LoKomi
 */
public class RaftConfig {

    /**
     * 心跳时间间隔
     */
    public static final int heartBeatInterval = 300;

    /**
     * 选举超时时间
     * 在该时间内没收到心跳信号则发起选举
     */
    static public final int electionTimeout = 3 * 1000;
}
