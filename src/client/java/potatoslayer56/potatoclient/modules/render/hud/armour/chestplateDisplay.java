package potatoslayer56.potatoclient.modules.render.hud.armour;

import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElement;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.item.ItemStack;
import potatoslayer56.potatoclient.config.modules;

public class chestplateDisplay implements HudElement {
  @Override
  public void render(DrawContext drawContext, RenderTickCounter renderTickCounter) {
    MinecraftClient minecraftClient = MinecraftClient.getInstance();
    TextRenderer textRenderer = minecraftClient.textRenderer;
    ClientPlayerEntity player = minecraftClient.player;

    if (modules.chestplateDisplay.enabled && player.getInventory().getStack(38) != ItemStack.EMPTY) {
      drawContext.drawItem(
        player.getInventory().getStack(38),
        modules.chestplateDisplay.xPos,
        modules.chestplateDisplay.yPos
      );

      drawContext.drawText(
        textRenderer,
        String.valueOf(player.getInventory().getStack(38).getMaxDamage() - player.getInventory().getStack(38).getDamage()),
        modules.chestplateDisplay.xPos + 17,
        modules.chestplateDisplay.yPos + 4,
        modules.chestplateDisplay.colour,
        false
      );
    }
  }
}
