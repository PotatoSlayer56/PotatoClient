package potatoslayer56.potatoclient;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElementRegistry;
import net.minecraft.util.Identifier;
import potatoslayer56.potatoclient.commands.moveModule;
import potatoslayer56.potatoclient.commands.toggleModule;
import potatoslayer56.potatoclient.config.saveLoad;
import potatoslayer56.potatoclient.modules.render.hud.*;

public class PotatoClientClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// REGISTER HUD ELEMENTS
		HudElementRegistry.addLast(Identifier.of("potatoclient", "fpscounter"), new fpsCounter());
		HudElementRegistry.addLast(Identifier.of("potatoclient", "coordinates"), new coordinates());
		HudElementRegistry.addLast(Identifier.of("potatoclient", "crystalcount"), new crystalCount());
		HudElementRegistry.addLast(Identifier.of("potatoclient", "expcount"), new expCount());
		HudElementRegistry.addLast(Identifier.of("potatoclient", "gapplecount"), new gappleCount());
		HudElementRegistry.addLast(Identifier.of("potatoclient", "pearlcount"), new pearlCount());
		HudElementRegistry.addLast(Identifier.of("potatoclient", "totemcount"), new totemCount());

		// REGISTER COMMANDS
		moveModule.register();
		toggleModule.register();

		// CREATE CONFIG
		saveLoad.createConfig();

		// LOAD FROM CONFIG
		saveLoad.readFromConfig();

	}
}