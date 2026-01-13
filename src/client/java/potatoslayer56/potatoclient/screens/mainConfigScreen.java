package potatoslayer56.potatoclient.screens;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.widget.TextWidget;
import net.minecraft.text.Text;
import potatoslayer56.potatoclient.config.modules;
import potatoslayer56.potatoclient.config.saveLoad;

import java.awt.*;

public class mainConfigScreen extends Screen {
  public mainConfigScreen(Text title) {
    super(title);
  }

  @Override
  protected void init() {

    TextWidget title = new TextWidget(
      this.width / 2 - 50,
      10,
      this.width,
      20,
      Text.translatable("potatoclient.config.title.text"),
      this.textRenderer
    );

    ButtonWidget renderConfigButton = ButtonWidget.builder(Text.translatable("potatoclient.config.renderConfigButton.text"), button -> {
      MinecraftClient.getInstance().setScreen(new renderMainConfigScreen(Text.translatable("potatoclient.screen.config.name")));
    }).dimensions(this.width / 2 - 50, 100, 100, 20).build();

    ButtonWidget pvpConfigButton = ButtonWidget.builder(Text.translatable("potatoclient.config.pvpConfigButton.text"), button -> {
      MinecraftClient.getInstance().setScreen(new pvpMainConfigScreen(Text.translatable("potatoclient.screen.config.name")));
    }).dimensions(this.width / 2 - 50, 130, 100, 20).build();

    ButtonWidget closeButton = ButtonWidget.builder(Text.translatable("potatoclient.config.saveButton.text"), (button -> {
        MinecraftClient.getInstance().setScreen(null);
        saveLoad.saveToConfig();
      })
    ).dimensions((this.width / 2) - 50, (int) (this.height * 0.95) - 20,100,20).build();

    this.addDrawableChild(title);
    this.addDrawableChild(renderConfigButton);
    this.addDrawableChild(pvpConfigButton);
    this.addDrawableChild(closeButton);
  }
}
