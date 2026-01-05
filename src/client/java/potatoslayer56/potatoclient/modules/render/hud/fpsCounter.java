package potatoslayer56.potatoclient.modules.render.hud;

import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElement;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.RenderTickCounter;
import potatoslayer56.potatoclient.config.modules;

public class fpsCounter implements HudElement {

  @Override
  public void render(DrawContext drawContext, RenderTickCounter renderTickCounter) {
    MinecraftClient minecraftClient = MinecraftClient.getInstance();
    TextRenderer textRenderer = minecraftClient.textRenderer;

    if (modules.fpsCounter.enabled) {
      drawContext.drawText(
        textRenderer,
        "FPS: %d".formatted(minecraftClient.getCurrentFps()),
        modules.fpsCounter.xPos,
        modules.fpsCounter.yPos,
        modules.fpsCounter.colour,
        false
      );
    }
  }
}
