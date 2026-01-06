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

public class gappleCount implements HudElement {
  @Override
  public void render(DrawContext drawContext, RenderTickCounter renderTickCounter) {
    MinecraftClient minecraftClient = MinecraftClient.getInstance();
    ClientPlayerEntity player = minecraftClient.player;
    TextRenderer textRenderer = minecraftClient.textRenderer;

    if (modules.gappleCount.enabled) {
      drawContext.drawItem(
        new ItemStack(Items.GOLDEN_APPLE, 1),
        modules.gappleCount.xPos,
        modules.gappleCount.yPos
      );

      drawContext.drawText(
        textRenderer,
        String.valueOf(player.getInventory().count(Items.GOLDEN_APPLE)),
        modules.gappleCount.xPos + 16,
        modules.gappleCount.yPos + 4,
        modules.gappleCount.colour,
        false
      );
    }
  }
}
