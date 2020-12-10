package io.github.bubbajuice.autodream.listener;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.eventhandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.eventhandler.ClientChatReceivedEvent;

import java.lang.Object;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class AutoDreamListener {
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
}

    @SubscribeEvent
    public void onChat(ClientChatReceivedEvent event) {
        String msg = event.message.getUnformattedText();
            if (msg.contains("The game starts in 10 seconds!")) {
                Minecraft.getMinecraft().thePlayer.sendChatMessage(
                        "/ac Hi."
                );
                
            }
        
    }
}
