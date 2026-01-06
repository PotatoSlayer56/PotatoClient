package potatoslayer56.potatoclient.modules.render.hud.armour;

import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElement;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.item.ItemStack;
import potatoslayer56.potatoclient.config.modules;

public class helmetDisplay implements HudElement {
  @Override
  public void render(DrawContext drawContext, RenderTickCounter renderTickCounter) {
    MinecraftClient minecraftClient = MinecraftClient.getInstance();
    TextRenderer textRenderer = minecraftClient.textRenderer;
    ClientPlayerEntity player = minecraftClient.player;

    if (modules.helmetDisplay.enabled && player.getInventory().getStack(39) != ItemStack.EMPTY) {
      drawContext.drawItem(
        player.getInventory().getStack(39),
        modules.helmetDisplay.xPos,
        modules.helmetDisplay.yPos
      );

      drawContext.drawText(
        textRenderer,
        String.valueOf(player.getInventory().getStack(39).getMaxDamage() - player.getInventory().getStack(39).getDamage()),
        modules.helmetDisplay.xPos + 17,
        modules.helmetDisplay.yPos + 4,
        modules.helmetDisplay.colour,
        false
      );
    }
  }
}
