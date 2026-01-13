package potatoslayer56.potatoclient.screens;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.gui.widget.TextWidget;
import net.minecraft.text.Text;
import potatoslayer56.potatoclient.config.modules;

public class renderMainConfigScreen extends Screen {
  public renderMainConfigScreen(Text title) {
    super(title);
  }

  @Override
  protected void init() {
    TextWidget moduleColumnText = new TextWidget(
      10,
      5,
      this.width / 2,
      20,
      Text.translatable("potatoclient.config.column.module.text"),
      this.textRenderer
    );

    TextWidget xPositionColumnText = new TextWidget(
      100,
      5,
      this.width / 2,
      20,
      Text.translatable("potatoclient.config.column.xPosition.text"),
      this.textRenderer
    );

    TextWidget yPositionColumnText = new TextWidget(
      155,
      5,
      this.width / 2,
      20,
      Text.translatable("potatoclient.config.column.yPosition.text"),
      this.textRenderer
    );

    // FPS Counter
    TextWidget fpsCounterText = new TextWidget(
      10,
      20,
      this.width / 2,
      20,
      Text.translatable("potatoclient.config.fpsCounter.text"),
      this.textRenderer
    );

    TextFieldWidget fpsCounterPositionXInput = new TextFieldWidget(
      this.textRenderer,
      100,
      20,
      50,
      20,
      Text.literal("X")
    );

    TextFieldWidget fpsCounterPositionYInput = new TextFieldWidget(
      this.textRenderer,
      155,
      20,
      50,
      20,
      Text.literal("Y")
    );

    ButtonWidget fpsCounterToggle = ButtonWidget.builder(Text.translatable("potatoclient.config.toggle.text"), (button -> {
        modules.fpsCounter.enabled = !modules.fpsCounter.enabled;
      })
    ).dimensions(210,20,50,20).build();

    // COORDINATES
    TextWidget coordinatesText = new TextWidget(
      10,
      42,
      this.width / 2,
      20,
      Text.translatable("potatoclient.config.coordinates.text"),
      this.textRenderer
    );

    TextFieldWidget coordinatesPositionXInput = new TextFieldWidget(
      this.textRenderer,
      100,
      42,
      50,
      20,
      Text.literal("X")
    );

    TextFieldWidget coordinatesPositionYInput = new TextFieldWidget(
      this.textRenderer,
      155,
      42,
      50,
      20,
      Text.literal("Y")
    );

    ButtonWidget coordinatesToggle = ButtonWidget.builder(Text.translatable("potatoclient.config.toggle.text"), (button -> {
        modules.coordinates.enabled = !modules.coordinates.enabled;
      })
    ).dimensions(210,42,50,20).build();

    fpsCounterPositionXInput.setText(String.valueOf(modules.fpsCounter.xPos));
    fpsCounterPositionYInput.setText(String.valueOf(modules.fpsCounter.yPos));
    coordinatesPositionXInput.setText(String.valueOf(modules.coordinates.xPos));
    coordinatesPositionYInput.setText(String.valueOf(modules.coordinates.yPos));

    ButtonWidget countersButton = ButtonWidget.builder(Text.translatable("potatoclient.config.countersButton.text"), (button -> {
      modules.fpsCounter.xPos = Integer.parseInt(fpsCounterPositionXInput.getText());
      modules.fpsCounter.yPos = Integer.parseInt(fpsCounterPositionYInput.getText());
      modules.coordinates.yPos = Integer.parseInt(coordinatesPositionYInput.getText());
      modules.coordinates.yPos = Integer.parseInt(coordinatesPositionYInput.getText());
      MinecraftClient.getInstance().setScreen(new countersConfigScreen(Text.translatable("potatoclient.screen.config.name")));
      })
    ).dimensions(10, 100, 100, 20).build();

    ButtonWidget armourDisplayButton = ButtonWidget.builder(Text.translatable("potatoclient.config.armourButton.text"), (button -> {
        modules.fpsCounter.xPos = Integer.parseInt(fpsCounterPositionXInput.getText());
        modules.fpsCounter.yPos = Integer.parseInt(fpsCounterPositionYInput.getText());
        modules.coordinates.yPos = Integer.parseInt(coordinatesPositionYInput.getText());
        modules.coordinates.yPos = Integer.parseInt(coordinatesPositionYInput.getText());
        MinecraftClient.getInstance().setScreen(new armourConfigScreen(Text.translatable("potatoclient.screen.config.name")));
      })
    ).dimensions(10, 130, 100, 20).build();

    ButtonWidget backButton = ButtonWidget.builder(Text.translatable("potatoclient.config.backButton.text"), (button -> {
      modules.fpsCounter.xPos = Integer.parseInt(fpsCounterPositionXInput.getText());
      modules.fpsCounter.yPos = Integer.parseInt(fpsCounterPositionYInput.getText());
      modules.coordinates.yPos = Integer.parseInt(coordinatesPositionYInput.getText());
      modules.coordinates.yPos = Integer.parseInt(coordinatesPositionYInput.getText());
      MinecraftClient.getInstance().setScreen(new mainConfigScreen(Text.translatable("potatoclient.screen.config.name")));
      })
    ).dimensions((this.width / 2) - 50, (int) (this.height * 0.95) - 20,100,20).build();

    this.addDrawableChild(moduleColumnText);
    this.addDrawableChild(xPositionColumnText);
    this.addDrawableChild(yPositionColumnText);
    this.addDrawableChild(fpsCounterText);
    this.addDrawableChild(fpsCounterPositionXInput);
    this.addDrawableChild(fpsCounterPositionYInput);
    this.addDrawableChild(fpsCounterToggle);
    this.addDrawableChild(coordinatesText);
    this.addDrawableChild(coordinatesPositionXInput);
    this.addDrawableChild(coordinatesPositionYInput);
    this.addDrawableChild(coordinatesToggle);
    this.addDrawableChild(countersButton);
    this.addDrawableChild(armourDisplayButton);
    this.addDrawableChild(backButton);
  }
}
