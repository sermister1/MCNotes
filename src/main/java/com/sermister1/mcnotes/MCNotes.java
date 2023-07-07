package com.sermister1.mcnotes;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
@Mod(modid = MCNotes.MODID, version = MCNotes.VERSION)
public class MCNotes
{
    public static final String MODID = "mcnotes";
    public static final String VERSION = "1.0";
    public static MCNotes instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        instance = this;
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new KeyHandler());
    }
}
