package com.wonginnovations.oldresearch.common.lib.network;

import com.wonginnovations.oldresearch.Tags;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

public class PacketHandler {

    public static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(Tags.MODID.toLowerCase());

    public static void preInit() {
        int discriminator = 0;
        INSTANCE.registerMessage(PacketAspectCombinationToServer.class, PacketAspectCombinationToServer.class, discriminator++, Side.SERVER);
        INSTANCE.registerMessage(PacketAspectDiscovery.class, PacketAspectDiscovery.class, discriminator++, Side.CLIENT);
        INSTANCE.registerMessage(PacketAspectPlaceToServer.class, PacketAspectPlaceToServer.class, discriminator++, Side.SERVER);
        INSTANCE.registerMessage(PacketAspectPool.class, PacketAspectPool.class, discriminator++, Side.CLIENT);
        INSTANCE.registerMessage(PacketPlayerCompleteToServer.class, PacketPlayerCompleteToServer.class, discriminator++, Side.SERVER);
        INSTANCE.registerMessage(PacketResearchComplete.class, PacketResearchComplete.class, discriminator++, Side.CLIENT);
        INSTANCE.registerMessage(PacketScannedToServer.class, PacketScannedToServer.class, discriminator++, Side.SERVER);
        INSTANCE.registerMessage(PacketSyncAspects.class, PacketSyncAspects.class, discriminator++, Side.CLIENT);
        INSTANCE.registerMessage(PacketSyncResearch.class, PacketSyncResearch.class, discriminator++, Side.CLIENT);
        INSTANCE.registerMessage(PacketSyncResearchTableData.class, PacketSyncResearchTableData.class, discriminator++, Side.CLIENT);
        INSTANCE.registerMessage(PacketSyncWarp.class, PacketSyncWarp.class, discriminator++, Side.CLIENT);
        INSTANCE.registerMessage(PacketWarpMessage.class, PacketWarpMessage.class, discriminator++, Side.CLIENT);
    }

}
