package potatoslayer56.potatoclient;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElementRegistry;
import net.minecraft.util.Identifier;
import potatoslayer56.potatoclient.config.saveLoad;
import potatoslayer56.potatoclient.keybinds.config;
import potatoslayer56.potatoclient.modules.pvp.totemVignette;
import potatoslayer56.potatoclient.modules.render.hud.*;
import potatoslayer56.potatoclient.modules.render.hud.armour.*;
import potatoslayer56.potatoclient.modules.render.hud.counters.*;

import static potatoslayer56.potatoclient.PotatoClient.MOD_ID;

public class PotatoClientClient implements ClientModInitializer {
  @Override
  public void onInitializeClient() {

    // REGISTER HUD ELEMENTS
    HudElementRegistry.addLast(Identifier.of(MOD_ID,"totemvignette"), new totemVignette());

    HudElementRegistry.addLast(Identifier.of(MOD_ID,"fpscounter"), new fpsCounter());
    HudElementRegistry.addLast(Identifier.of(MOD_ID,"coordinates"), new coordinates());

    HudElementRegistry.addLast(Identifier.of(MOD_ID,"crystalcount"), new crystalCount());
    HudElementRegistry.addLast(Identifier.of(MOD_ID,"expcount"), new expCount());
    HudElementRegistry.addLast(Identifier.of(MOD_ID,"gapplecount"), new gappleCount());
    HudElementRegistry.addLast(Identifier.of(MOD_ID,"pearlcount"), new pearlCount());
    HudElementRegistry.addLast(Identifier.of(MOD_ID,"totemcount"), new totemCount());

    HudElementRegistry.addLast(Identifier.of(MOD_ID,"helmetdisplay"), new helmetDisplay());
    HudElementRegistry.addLast(Identifier.of(MOD_ID,"chestplatedisplay"), new chestplateDisplay());
    HudElementRegistry.addLast(Identifier.of(MOD_ID,"leggingsdisplay"), new leggingsDisplay());
    HudElementRegistry.addLast(Identifier.of(MOD_ID,"bootsdisplay"), new bootsDisplay());

    // REGISTER KEYBINDS
    config.register();

    // CREATE CONFIG
    saveLoad.createConfig();

    // SAVE TO CONFIG
    //saveLoad.saveToConfig();

    // LOAD FROM CONFIG
    saveLoad.readFromConfig();
  }
}