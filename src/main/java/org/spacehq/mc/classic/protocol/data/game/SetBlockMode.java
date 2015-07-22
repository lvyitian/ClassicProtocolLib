package org.spacehq.mc.classic.protocol.data.game;

/**
 * Mode used by a client when setting a block.
 */
public enum SetBlockMode {
    /**
     * Destroying a block.
     */
    DESTROYED,
    /**
     * Creating a block.
     */
    CREATED;
}
