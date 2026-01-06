package potatoslayer56.potatoclient;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElementRegistry;
import net.minecraft.util.Identifier;
import potatoslayer56.potatoclient.commands.moveModule;
import potatoslayer56.potatoclient.commands.toggleModule;
import potatoslayer56.potatoclient.config.saveLoad;
import potatoslayer56.potatoclient.modules.render.hud.*;
import potatoslayer56.potatoclient.modules.render.hud.armour.*;
import potatoslayer56.potatoclient.modules.render.hud.counters.*;

public class PotatoClientClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {

		// REGISTER HUD ELEMENTS
		HudElementRegistry.addLast(Identifier.of("potatoclient","fpscounter"), new fpsCounter());
		HudElementRegistry.addLast(Identifier.of("potatoclient","coordinates"), new coordinates());

		HudElementRegistry.addLast(Identifier.of("potatoclient","crystalcount"), new crystalCount());
		HudElementRegistry.addLast(Identifier.of("potatoclient","expcount"), new expCount());
		HudElementRegistry.addLast(Identifier.of("potatoclient","gapplecount"), new gappleCount());
		HudElementRegistry.addLast(Identifier.of("potatoclient","pearlcount"), new pearlCount());
		HudElementRegistry.addLast(Identifier.of("potatoclient","totemcount"), new totemCount());

		HudElementRegistry.addLast(Identifier.of("potatoclient","helmetdisplay"), new helmetDisplay());
		HudElementRegistry.addLast(Identifier.of("potatoclient","chestplatedisplay"), new chestplateDisplay());
		HudElementRegistry.addLast(Identifier.of("potatoclient","leggingsdisplay"), new leggingsDisplay());
		HudElementRegistry.addLast(Identifier.of("potatoclient","bootsdisplay"), new bootsDisplay());

		// REGISTER COMMANDS
		moveModule.register();
		toggleModule.register();

		// CREATE CONFIG
		saveLoad.createConfig();

		// SAVE TO CONFIG
		//saveLoad.saveToConfig();

		// LOAD FROM CONFIG
		saveLoad.readFromConfig();

	}
}