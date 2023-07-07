package com.sermister1.mcnotes;

import net.minecraft.client.settings.KeyBinding;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import org.lwjgl.input.Keyboard;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

public class KeyHandler {
	public static final KeyBinding myKey = new KeyBinding("key.opennotes", Keyboard.KEY_P, "key.category.mcnotes");
	
    public KeyHandler() {
        ClientRegistry.registerKeyBinding(myKey);
    }

    @SubscribeEvent
    public void onKeyInput(InputEvent.KeyInputEvent event) {
        if (myKey.isPressed()) {
            // Do something when the key is pressed
            
        	Minecraft.getMinecraft().displayGuiScreen(new GuiCustomMenu());
        }
    }
}
