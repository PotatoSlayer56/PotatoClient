package potatoslayer56.potatoclient.modules.render.hud;

import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElement;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import potatoslayer56.potatoclient.config.modules;

public class totemCount implements HudElement {
  @Override
  public void render(DrawContext drawContext, RenderTickCounter renderTickCounter) {
    MinecraftClient minecraftClient = MinecraftClient.getInstance();
    ClientPlayerEntity player = minecraftClient.player;
    TextRenderer textRenderer = minecraftClient.textRenderer;

    if (modules.totemCount.enabled) {
      drawContext.drawItem(
        new ItemStack(Items.TOTEM_OF_UNDYING, 1),
        modules.totemCount.xPos,
        modules.totemCount.yPos
      );

      drawContext.drawText(
        textRenderer,
        String.valueOf(player.getInventory().count(Items.TOTEM_OF_UNDYING)),
        modules.totemCount.xPos + 17,
        modules.totemCount.yPos + 4,
        modules.totemCount.colour,
        false
      );
    }
  }
}
