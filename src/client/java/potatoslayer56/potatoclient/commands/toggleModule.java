package potatoslayer56.potatoclient.commands;

import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandManager;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;
import net.minecraft.text.Text;
import potatoslayer56.potatoclient.config.modules;
import potatoslayer56.potatoclient.config.saveLoad;

public class toggleModule {
  public static void register() {
    // FPS COUNTER
    ClientCommandRegistrationCallback.EVENT.register(((dispatcher, registryAccess) ->
      dispatcher.register(ClientCommandManager.literal("toggleModule")
        .then(ClientCommandManager.literal("fpsCounter")
          .then(ClientCommandManager.argument("enabled", BoolArgumentType.bool()).executes(context -> {
            boolean enabled = BoolArgumentType.getBool(context, "enabled");
            modules.fpsCounter.enabled = enabled;
            context.getSource().sendFeedback(Text.literal("§7[§bPotatoClient§7] §aToggled §6FPS Counter §ato §d%b".formatted(enabled)));
            saveLoad.saveToConfig();
            return 1;
          })))
        )
      )
    );

    // COORDINATES
    ClientCommandRegistrationCallback.EVENT.register(((dispatcher, registryAccess) ->
        dispatcher.register(ClientCommandManager.literal("toggleModule")
          .then(ClientCommandManager.literal("coordinates")
            .then(ClientCommandManager.argument("enabled", BoolArgumentType.bool()).executes(context -> {
              boolean enabled = BoolArgumentType.getBool(context, "enabled");
              modules.coordinates.enabled = enabled;
              context.getSource().sendFeedback(Text.literal("§7[§bPotatoClient§7] §aToggled §6Coordinates §ato §d%b".formatted(enabled)));
              saveLoad.saveToConfig();
              return 1;
            })))
        )
      )
    );

    // CRYSTAL COUNT
    ClientCommandRegistrationCallback.EVENT.register(((dispatcher, registryAccess) ->
        dispatcher.register(ClientCommandManager.literal("toggleModule")
          .then(ClientCommandManager.literal("crystalCount")
            .then(ClientCommandManager.argument("enabled", BoolArgumentType.bool()).executes(context -> {
              boolean enabled = BoolArgumentType.getBool(context, "enabled");
              modules.crystalCount.enabled = enabled;
              context.getSource().sendFeedback(Text.literal("§7[§bPotatoClient§7] §aToggled §6Crystal Count §ato §d%b".formatted(enabled)));
              saveLoad.saveToConfig();
              return 1;
            })))
        )
      )
    );

    // EXP COUNT
    ClientCommandRegistrationCallback.EVENT.register(((dispatcher, registryAccess) ->
        dispatcher.register(ClientCommandManager.literal("toggleModule")
          .then(ClientCommandManager.literal("expCount")
            .then(ClientCommandManager.argument("enabled", BoolArgumentType.bool()).executes(context -> {
              boolean enabled = BoolArgumentType.getBool(context, "enabled");
              modules.expCount.enabled = enabled;
              context.getSource().sendFeedback(Text.literal("§7[§bPotatoClient§7] §aToggled §6EXP Count §ato §d%b".formatted(enabled)));
              saveLoad.saveToConfig();
              return 1;
            })))
        )
      )
    );

    // GAPPLE COUNT
    ClientCommandRegistrationCallback.EVENT.register(((dispatcher, registryAccess) ->
        dispatcher.register(ClientCommandManager.literal("toggleModule")
          .then(ClientCommandManager.literal("gappleCount")
            .then(ClientCommandManager.argument("enabled", BoolArgumentType.bool()).executes(context -> {
              boolean enabled = BoolArgumentType.getBool(context, "enabled");
              modules.gappleCount.enabled = enabled;
              context.getSource().sendFeedback(Text.literal("§7[§bPotatoClient§7] §aToggled §6Gapple Count §ato §d%b".formatted(enabled)));
              saveLoad.saveToConfig();
              return 1;
            })))
        )
      )
    );

    // PEARL COUNT
    ClientCommandRegistrationCallback.EVENT.register(((dispatcher, registryAccess) ->
        dispatcher.register(ClientCommandManager.literal("toggleModule")
          .then(ClientCommandManager.literal("pearlCount")
            .then(ClientCommandManager.argument("enabled", BoolArgumentType.bool()).executes(context -> {
              boolean enabled = BoolArgumentType.getBool(context, "enabled");
              modules.pearlCount.enabled = enabled;
              context.getSource().sendFeedback(Text.literal("§7[§bPotatoClient§7] §aToggled §6Pearl Count §ato §d%b".formatted(enabled)));
              saveLoad.saveToConfig();
              return 1;
            })))
        )
      )
    );

    // TOTEM COUNT
    ClientCommandRegistrationCallback.EVENT.register(((dispatcher, registryAccess) ->
        dispatcher.register(ClientCommandManager.literal("toggleModule")
          .then(ClientCommandManager.literal("totemCount")
            .then(ClientCommandManager.argument("enabled", BoolArgumentType.bool()).executes(context -> {
              boolean enabled = BoolArgumentType.getBool(context, "enabled");
              modules.totemCount.enabled = enabled;
              context.getSource().sendFeedback(Text.literal("§7[§bPotatoClient§7] §aToggled §6Totem Count §ato §d%b".formatted(enabled)));
              saveLoad.saveToConfig();
              return 1;
            })))
        )
      )
    );

    // HELMET DISPLAY
    ClientCommandRegistrationCallback.EVENT.register(((dispatcher, registryAccess) ->
        dispatcher.register(ClientCommandManager.literal("toggleModule")
          .then(ClientCommandManager.literal("helmetDisplay")
            .then(ClientCommandManager.argument("enabled", BoolArgumentType.bool()).executes(context -> {
              boolean enabled = BoolArgumentType.getBool(context, "enabled");
              modules.helmetDisplay.enabled = enabled;
              context.getSource().sendFeedback(Text.literal("§7[§bPotatoClient§7] §aToggled §6Helmet Display §ato §d%b".formatted(enabled)));
              saveLoad.saveToConfig();
              return 1;
            })))
        )
      )
    );

    // CHESTPLATE DISPLAY
    ClientCommandRegistrationCallback.EVENT.register(((dispatcher, registryAccess) ->
        dispatcher.register(ClientCommandManager.literal("toggleModule")
          .then(ClientCommandManager.literal("chestplateDisplay")
            .then(ClientCommandManager.argument("enabled", BoolArgumentType.bool()).executes(context -> {
              boolean enabled = BoolArgumentType.getBool(context, "enabled");
              modules.chestplateDisplay.enabled = enabled;
              context.getSource().sendFeedback(Text.literal("§7[§bPotatoClient§7] §aToggled §6Chestplate Display §ato §d%b".formatted(enabled)));
              saveLoad.saveToConfig();
              return 1;
            })))
        )
      )
    );

    // LEGGINGS DISPLAY
    ClientCommandRegistrationCallback.EVENT.register(((dispatcher, registryAccess) ->
        dispatcher.register(ClientCommandManager.literal("toggleModule")
          .then(ClientCommandManager.literal("leggingsDisplay")
            .then(ClientCommandManager.argument("enabled", BoolArgumentType.bool()).executes(context -> {
              boolean enabled = BoolArgumentType.getBool(context, "enabled");
              modules.leggingsDisplay.enabled = enabled;
              context.getSource().sendFeedback(Text.literal("§7[§bPotatoClient§7] §aToggled §6 Display §ato §d%b".formatted(enabled)));
              saveLoad.saveToConfig();
              return 1;
            })))
        )
      )
    );

    // BOOTS DISPLAY
    ClientCommandRegistrationCallback.EVENT.register(((dispatcher, registryAccess) ->
        dispatcher.register(ClientCommandManager.literal("toggleModule")
          .then(ClientCommandManager.literal("bootsDisplay")
            .then(ClientCommandManager.argument("enabled", BoolArgumentType.bool()).executes(context -> {
              boolean enabled = BoolArgumentType.getBool(context, "enabled");
              modules.bootsDisplay.enabled = enabled;
              context.getSource().sendFeedback(Text.literal("§7[§bPotatoClient§7] §aToggled §6Boots Display §ato §d%b".formatted(enabled)));
              saveLoad.saveToConfig();
              return 1;
            })))
        )
      )
    );
  }
}
