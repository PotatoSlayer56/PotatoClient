package potatoslayer56.potatoclient.modules.pvp;

import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElement;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.RenderPipelines;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.item.Items;
import net.minecraft.util.AssetInfo;
import net.minecraft.util.Colors;
import net.minecraft.util.Identifier;
import potatoslayer56.potatoclient.config.modules;

import static potatoslayer56.potatoclient.PotatoClient.MOD_ID;

public class totemVignette implements HudElement {
  private static final AssetInfo.TextureAssetInfo vignetteTexture = new AssetInfo.TextureAssetInfo(Identifier.of(MOD_ID, "vignette"));

  @Override
  public void render(DrawContext drawContext, RenderTickCounter renderTickCounter) {
    if (modules.totemVignette.enabled && (MinecraftClient.getInstance().player.getMainHandStack() != Items.TOTEM_OF_UNDYING.getDefaultStack() || MinecraftClient.getInstance().player.getOffHandStack() != Items.TOTEM_OF_UNDYING.getDefaultStack())) {
      drawContext.drawTexture(
        RenderPipelines.VIGNETTE,
        vignetteTexture.texturePath(),
        0,
        0,
        0,
        0,
        drawContext.getScaledWindowWidth(),
        drawContext.getScaledWindowHeight(),
        drawContext.getScaledWindowWidth(),
        drawContext.getScaledWindowHeight(),
        modules.totemVignette.colour
      );
    }
  }
}