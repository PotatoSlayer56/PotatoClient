package potatoslayer56.potatoclient.screens;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.widget.TextWidget;
import net.minecraft.text.Text;
import potatoslayer56.potatoclient.config.modules;

public class pvpMainConfigScreen extends Screen {
  public pvpMainConfigScreen(Text title) {
    super(title);
  }

  @Override
  protected void init() {
    TextWidget totemVignetteText = new TextWidget(
      10,
      20,
      this.width,
      20,
      Text.translatable("potatoclient.config.totemVignette.text"),
      this.textRenderer
    );

    ButtonWidget totemVignetteToggle = ButtonWidget.builder(Text.translatable("potatoclient.config.toggle.text"),  button -> {
      modules.totemVignette.enabled = !modules.totemVignette.enabled;
    }).dimensions(100,20,50,20).build();

    ButtonWidget backButton = ButtonWidget.builder(Text.translatable("potatoclient.config.backButton.text"), (button -> {
        MinecraftClient.getInstance().setScreen(new mainConfigScreen(Text.translatable("potatoclient.screen.config.name")));
      })
    ).dimensions((this.width / 2) - 50, (int) (this.height * 0.95) - 20,100,20).build();

    this.addDrawableChild(totemVignetteText);
    this.addDrawableChild(totemVignetteToggle);
    this.addDrawableChild(backButton);
  }
}
