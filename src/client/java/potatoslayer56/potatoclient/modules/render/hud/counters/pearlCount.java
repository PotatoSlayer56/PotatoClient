package potatoslayer56.potatoclient.modules.render.hud.counters;

import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElement;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import potatoslayer56.potatoclient.config.modules;

public class pearlCount implements HudElement {
  @Override
  public void render(DrawContext drawContext, RenderTickCounter renderTickCounter) {
    MinecraftClient minecraftClient = MinecraftClient.getInstance();
    ClientPlayerEntity player = minecraftClient.player;
    TextRenderer textRenderer = minecraftClient.textRenderer;

    if (modules.pearlCount.enabled) {
      drawContext.drawItem(
        new ItemStack(Items.ENDER_PEARL, 1),
        modules.pearlCount.xPos,
        modules.pearlCount.yPos
      );

      drawContext.drawText(
        textRenderer,
        String.valueOf(player.getInventory().count(Items.ENDER_PEARL)),
        modules.pearlCount.xPos + 17,
        modules.pearlCount.yPos + 4,
        modules.pearlCount.colour,
        false
      );
    }
  }
}
