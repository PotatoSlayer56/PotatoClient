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

public class crystalCount implements HudElement {
  @Override
  public void render(DrawContext drawContext, RenderTickCounter renderTickCounter) {
    MinecraftClient minecraftClient = MinecraftClient.getInstance();
    ClientPlayerEntity player = minecraftClient.player;
    TextRenderer textRenderer = minecraftClient.textRenderer;

    if (modules.crystalCount.enabled) {
      drawContext.drawItem(
        new ItemStack(Items.END_CRYSTAL, 1),
        modules.crystalCount.xPos,
        modules.crystalCount.yPos
      );

      drawContext.drawText(
        textRenderer,
        String.valueOf(player.getInventory().count(Items.END_CRYSTAL)),
        modules.crystalCount.xPos + 17,
        modules.crystalCount.yPos + 4,
        modules.crystalCount.colour,
        false
      );
    }
  }
}
