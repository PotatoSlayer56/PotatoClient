package potatoslayer56.potatoclient.modules.render.hud;

import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElement;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.RenderTickCounter;
import potatoslayer56.potatoclient.config.modules;

public class coordinates implements HudElement {
  @Override
  public void render(DrawContext drawContext, RenderTickCounter renderTickCounter) {
    MinecraftClient minecraftClient = MinecraftClient.getInstance();
    TextRenderer textRenderer = minecraftClient.textRenderer;
    ClientPlayerEntity player = minecraftClient.player;

    if (modules.coordinates.enabled) {
      drawContext.drawText(
        textRenderer,
        "%.1f %.1f %.1f".formatted(player.getX(), player.getY(), player.getZ()),
        modules.coordinates.xPos,
        modules.coordinates.yPos,
        modules.coordinates.colour,
        false
      );
    }
  }
}
