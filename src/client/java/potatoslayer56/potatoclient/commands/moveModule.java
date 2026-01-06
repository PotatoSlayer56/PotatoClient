package potatoslayer56.potatoclient.commands;

import com.mojang.brigadier.arguments.IntegerArgumentType;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandManager;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;
import net.minecraft.text.Text;
import potatoslayer56.potatoclient.config.modules;
import potatoslayer56.potatoclient.config.saveLoad;

public class moveModule {
  public static void register() {
    // FPS COUNTER
    ClientCommandRegistrationCallback.EVENT.register(((dispatcher, registryAccess) ->
      dispatcher.register(ClientCommandManager.literal("moveModule")
        .then(ClientCommandManager.literal("fpsCounter")
          .then(ClientCommandManager.argument("x position", IntegerArgumentType.integer(0))
            .then(ClientCommandManager.argument("y position", IntegerArgumentType.integer(0)).executes(context -> {
              int xPos = IntegerArgumentType.getInteger(context, "x position");
              int yPos = IntegerArgumentType.getInteger(context, "y position");
              modules.fpsCounter.xPos = xPos;
              modules.fpsCounter.yPos = yPos;
              context.getSource().sendFeedback(Text.literal("§7[§bPotatoClient§7] §aChanged §6FPS Counter §aposition to §d%d, %d".formatted(xPos,yPos)));
              saveLoad.saveToConfig();
              return 1;
            })))
        )
      )
    ));

    // COORDINATES
    ClientCommandRegistrationCallback.EVENT.register(((dispatcher, registryAccess) ->
      dispatcher.register(ClientCommandManager.literal("moveModule")
        .then(ClientCommandManager.literal("coordinates")
          .then(ClientCommandManager.argument("x position", IntegerArgumentType.integer(0))
            .then(ClientCommandManager.argument("y position", IntegerArgumentType.integer(0)).executes(context -> {
              int xPos = IntegerArgumentType.getInteger(context, "x position");
              int yPos = IntegerArgumentType.getInteger(context, "y position");
              modules.coordinates.xPos = xPos;
              modules.coordinates.yPos = yPos;
              context.getSource().sendFeedback(Text.literal("§7[§bPotatoClient§7] §aChanged §6Coordinates §aposition to §d%d, %d".formatted(xPos,yPos)));
              saveLoad.saveToConfig();
              return 1;
            })))
        )
      )
    ));

    // CRYSTAL COUNT
    ClientCommandRegistrationCallback.EVENT.register(((dispatcher, registryAccess) ->
      dispatcher.register(ClientCommandManager.literal("moveModule")
        .then(ClientCommandManager.literal("crystalCount")
          .then(ClientCommandManager.argument("x position", IntegerArgumentType.integer(0))
            .then(ClientCommandManager.argument("y position", IntegerArgumentType.integer(0)).executes(context -> {
              int xPos = IntegerArgumentType.getInteger(context, "x position");
              int yPos = IntegerArgumentType.getInteger(context, "y position");
              modules.crystalCount.xPos = xPos;
              modules.crystalCount.yPos = yPos;
              context.getSource().sendFeedback(Text.literal("§7[§bPotatoClient§7] §aChanged §6Crystal Count §aposition to §d%d, %d".formatted(xPos,yPos)));
              saveLoad.saveToConfig();
              return 1;
            })))
        )
      )
    ));

    // EXP COUNT
    ClientCommandRegistrationCallback.EVENT.register(((dispatcher, registryAccess) ->
      dispatcher.register(ClientCommandManager.literal("moveModule")
        .then(ClientCommandManager.literal("expCount")
          .then(ClientCommandManager.argument("x position", IntegerArgumentType.integer(0))
            .then(ClientCommandManager.argument("y position", IntegerArgumentType.integer(0)).executes(context -> {
              int xPos = IntegerArgumentType.getInteger(context, "x position");
              int yPos = IntegerArgumentType.getInteger(context, "y position");
              modules.expCount.xPos = xPos;
              modules.expCount.yPos = yPos;
              context.getSource().sendFeedback(Text.literal("§7[§bPotatoClient§7] §aChanged §6EXP Count §aposition to §d%d, %d".formatted(xPos,yPos)));
              saveLoad.saveToConfig();
              return 1;
            })))
        )
      )
    ));

    // GAPPLE COUNT
    ClientCommandRegistrationCallback.EVENT.register(((dispatcher, registryAccess) ->
      dispatcher.register(ClientCommandManager.literal("moveModule")
        .then(ClientCommandManager.literal("gappleCount")
          .then(ClientCommandManager.argument("x position", IntegerArgumentType.integer(0))
            .then(ClientCommandManager.argument("y position", IntegerArgumentType.integer(0)).executes(context -> {
              int xPos = IntegerArgumentType.getInteger(context, "x position");
              int yPos = IntegerArgumentType.getInteger(context, "y position");
              modules.gappleCount.xPos = xPos;
              modules.gappleCount.yPos = yPos;
              context.getSource().sendFeedback(Text.literal("§7[§bPotatoClient§7] §aChanged §6Gapple Count §aposition to §d%d, %d".formatted(xPos,yPos)));
              saveLoad.saveToConfig();
              return 1;
            })))
        )
      )
    ));

    // PEARL COUNT
    ClientCommandRegistrationCallback.EVENT.register(((dispatcher, registryAccess) ->
      dispatcher.register(ClientCommandManager.literal("moveModule")
        .then(ClientCommandManager.literal("pearlCount")
          .then(ClientCommandManager.argument("x position", IntegerArgumentType.integer(0))
            .then(ClientCommandManager.argument("y position", IntegerArgumentType.integer(0)).executes(context -> {
              int xPos = IntegerArgumentType.getInteger(context, "x position");
              int yPos = IntegerArgumentType.getInteger(context, "y position");
              modules.pearlCount.xPos = xPos;
              modules.pearlCount.yPos = yPos;
              context.getSource().sendFeedback(Text.literal("§7[§bPotatoClient§7] §aChanged §6Pearl Count §aposition to §d%d, %d".formatted(xPos,yPos)));
              saveLoad.saveToConfig();
              return 1;
            })))
        )
      )
    ));

    // TOTEM COUNT
    ClientCommandRegistrationCallback.EVENT.register(((dispatcher, registryAccess) ->
      dispatcher.register(ClientCommandManager.literal("moveModule")
        .then(ClientCommandManager.literal("totemCount")
          .then(ClientCommandManager.argument("x position", IntegerArgumentType.integer(0))
            .then(ClientCommandManager.argument("y position", IntegerArgumentType.integer(0)).executes(context -> {
              int xPos = IntegerArgumentType.getInteger(context, "x position");
              int yPos = IntegerArgumentType.getInteger(context, "y position");
              modules.totemCount.xPos = xPos;
              modules.totemCount.yPos = yPos;
              context.getSource().sendFeedback(Text.literal("§7[§bPotatoClient§7] §aChanged §6Totem Count §aposition to §d%d, %d".formatted(xPos,yPos)));
              saveLoad.saveToConfig();
              return 1;
            })))
        )
      )
    ));

    // HELMET DISPLAY
    ClientCommandRegistrationCallback.EVENT.register(((dispatcher, registryAccess) ->
      dispatcher.register(ClientCommandManager.literal("moveModule")
        .then(ClientCommandManager.literal("helmetDisplay")
          .then(ClientCommandManager.argument("x position", IntegerArgumentType.integer(0))
            .then(ClientCommandManager.argument("y position", IntegerArgumentType.integer(0)).executes(context -> {
              int xPos = IntegerArgumentType.getInteger(context, "x position");
              int yPos = IntegerArgumentType.getInteger(context, "y position");
              modules.helmetDisplay.xPos = xPos;
              modules.helmetDisplay.yPos = yPos;
              context.getSource().sendFeedback(Text.literal("§7[§bPotatoClient§7] §aChanged §6Helmet Display §aposition to §d%d, %d".formatted(xPos,yPos)));
              saveLoad.saveToConfig();
              return 1;
            })))
        )
      )
    ));

    // CHESTPLATE DISPLAY
    ClientCommandRegistrationCallback.EVENT.register(((dispatcher, registryAccess) ->
      dispatcher.register(ClientCommandManager.literal("moveModule")
        .then(ClientCommandManager.literal("chestplateDisplay")
          .then(ClientCommandManager.argument("x position", IntegerArgumentType.integer(0))
            .then(ClientCommandManager.argument("y position", IntegerArgumentType.integer(0)).executes(context -> {
              int xPos = IntegerArgumentType.getInteger(context, "x position");
              int yPos = IntegerArgumentType.getInteger(context, "y position");
              modules.chestplateDisplay.xPos = xPos;
              modules.chestplateDisplay.yPos = yPos;
              context.getSource().sendFeedback(Text.literal("§7[§bPotatoClient§7] §aChanged §6Chestplate Display §aposition to §d%d, %d".formatted(xPos,yPos)));
              saveLoad.saveToConfig();
              return 1;
            })))
        )
      )
    ));

    // LEGGINGS DISPLAY
    ClientCommandRegistrationCallback.EVENT.register(((dispatcher, registryAccess) ->
      dispatcher.register(ClientCommandManager.literal("moveModule")
        .then(ClientCommandManager.literal("leggingsDisplay")
          .then(ClientCommandManager.argument("x position", IntegerArgumentType.integer(0))
            .then(ClientCommandManager.argument("y position", IntegerArgumentType.integer(0)).executes(context -> {
              int xPos = IntegerArgumentType.getInteger(context, "x position");
              int yPos = IntegerArgumentType.getInteger(context, "y position");
              modules.leggingsDisplay.xPos = xPos;
              modules.leggingsDisplay.yPos = yPos;
              context.getSource().sendFeedback(Text.literal("§7[§bPotatoClient§7] §aChanged §6Leggings Display §aposition to §d%d, %d".formatted(xPos,yPos)));
              saveLoad.saveToConfig();
              return 1;
            })))
        )
      )
    ));

    // BOOTS DISPLAY
    ClientCommandRegistrationCallback.EVENT.register(((dispatcher, registryAccess) ->
      dispatcher.register(ClientCommandManager.literal("moveModule")
        .then(ClientCommandManager.literal("bootsDisplay")
          .then(ClientCommandManager.argument("x position", IntegerArgumentType.integer(0))
            .then(ClientCommandManager.argument("y position", IntegerArgumentType.integer(0)).executes(context -> {
              int xPos = IntegerArgumentType.getInteger(context, "x position");
              int yPos = IntegerArgumentType.getInteger(context, "y position");
              modules.bootsDisplay.xPos = xPos;
              modules.bootsDisplay.yPos = yPos;
              context.getSource().sendFeedback(Text.literal("§7[§bPotatoClient§7] §aChanged §6Boots Display §aposition to §d%d, %d".formatted(xPos,yPos)));
              saveLoad.saveToConfig();
              return 1;
            })))
        )
      )
    ));
  }
}
