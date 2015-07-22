package org.spacehq.mc.classic.protocol.packet.server;

import org.spacehq.packetlib.io.NetInput;
import org.spacehq.packetlib.io.NetOutput;
import org.spacehq.packetlib.packet.Packet;

import java.io.IOException;

/**
 * Sent by a server to prepare a client to receive level data.
 */
public class ServerLevelInitializePacket implements Packet {
    /**
     * Creates a ServerLevelInitializePacket instance.
     */
    public ServerLevelInitializePacket() {
    }

    @Override
    public void read(NetInput in) throws IOException {
    }

    @Override
    public void write(NetOutput out) throws IOException {
    }

    @Override
    public boolean isPriority() {
        return false;
    }
}
