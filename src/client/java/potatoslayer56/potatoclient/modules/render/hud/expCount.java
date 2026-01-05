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

public class expCount implements HudElement {
  @Override
  public void render(DrawContext drawContext, RenderTickCounter renderTickCounter) {
    MinecraftClient minecraftClient = MinecraftClient.getInstance();
    ClientPlayerEntity player = minecraftClient.player;
    TextRenderer textRenderer = minecraftClient.textRenderer;

    if (modules.expCount.enabled) {
      drawContext.drawItem(
        new ItemStack(Items.EXPERIENCE_BOTTLE, 1),
        modules.expCount.xPos,
        modules.expCount.yPos
      );

      drawContext.drawText(
        textRenderer,
        String.valueOf(player.getInventory().count(Items.EXPERIENCE_BOTTLE)),
        modules.expCount.xPos + 17,
        modules.expCount.yPos + 4,
        modules.expCount.colour,
        false
      );
    }
  }
}
