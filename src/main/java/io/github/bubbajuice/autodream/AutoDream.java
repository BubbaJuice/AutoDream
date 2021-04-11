package io.github.bubbajuice.autodream;
package io.github.bubbajuice.autodream.simplecommands;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = "autodream", name = "AutoDream", version = "1.0")
public class AutoDream {
    private boolean running;

    @Mod.Instance("autodream")
    public static AutoDream instance;

    @Mod.EventHandler
    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }


@Mod.EventHandler
public void init(FMLInitializationEvent event) {
    MinecraftForge.EVENT_BUS.register(this);
    ClientCommandHandler.instance.registerCommand(new SimpleCommands());
}

@SubscribeEvent
    public void onChat(ClientChatReceivedEvent event) {
        String msg = event.message.getUnformattedText();
            if (msg.contains("The game starts in 10 seconds!")) {
                Minecraft.getMinecraft().thePlayer.sendChatMessage(
                    "/ac Dream is overrated."
                );

            }
            
    }

}
