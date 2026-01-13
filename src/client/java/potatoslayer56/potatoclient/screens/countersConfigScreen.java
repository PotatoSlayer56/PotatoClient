package potatoslayer56.potatoclient.screens;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.gui.widget.TextWidget;
import net.minecraft.text.Text;
import potatoslayer56.potatoclient.config.modules;

public class countersConfigScreen extends Screen {
  public countersConfigScreen(Text title) {
    super(title);
  }

  @Override
  protected void init() {
    // COLUMN LABELS
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

    // CRYSTAL COUNT
    TextWidget crystalCountText = new TextWidget(
      10,
      20,
      this.width / 2,
      20,
      Text.translatable("potatoclient.config.crystalCount.text"),
      this.textRenderer
    );

    TextFieldWidget crystalCountPositionXInput = new TextFieldWidget(
      this.textRenderer,
      100,
      20,
      50,
      20,
      Text.literal("X")
    );

    TextFieldWidget crystalCountPositionYInput = new TextFieldWidget(
      this.textRenderer,
      155,
      20,
      50,
      20,
      Text.literal("Y")
    );

    ButtonWidget crystalCountToggle = ButtonWidget.builder(Text.translatable("potatoclient.config.toggle.text"), (button -> {
        modules.crystalCount.enabled = !modules.crystalCount.enabled;
      })
    ).dimensions(210,20,50,20).build();

    // EXP COUNT
    TextWidget expCountText = new TextWidget(
      10,
      42,
      this.width / 2,
      20,
      Text.translatable("potatoclient.config.expCount.text"),
      this.textRenderer
    );

    TextFieldWidget expCountPositionXInput = new TextFieldWidget(
      this.textRenderer,
      100,
      42,
      50,
      20,
      Text.literal("X")
    );

    TextFieldWidget expCountPositionYInput = new TextFieldWidget(
      this.textRenderer,
      155,
      42,
      50,
      20,
      Text.literal("Y")
    );

    ButtonWidget expCountToggle = ButtonWidget.builder(Text.translatable("potatoclient.config.toggle.text"), (button -> {
        modules.expCount.enabled = !modules.expCount.enabled;
      })
    ).dimensions(210,42,50,20).build();

    // GAPPLE COUNT
    TextWidget gappleCountText = new TextWidget(
      10,
      64,
      this.width / 2,
      20,
      Text.translatable("potatoclient.config.gappleCount.text"),
      this.textRenderer
    );

    TextFieldWidget gappleCountPositionXInput = new TextFieldWidget(
      this.textRenderer,
      100,
      64,
      50,
      20,
      Text.literal("X")
    );

    TextFieldWidget gappleCountPositionYInput = new TextFieldWidget(
      this.textRenderer,
      155,
      64,
      50,
      20,
      Text.literal("Y")
    );

    ButtonWidget gappleCountToggle = ButtonWidget.builder(Text.translatable("potatoclient.config.toggle.text"), (button -> {
        modules.gappleCount.enabled = !modules.gappleCount.enabled;
      })
    ).dimensions(210,64,50,20).build();

    // PEARL COUNT
    TextWidget pearlCountText = new TextWidget(
      10,
      86,
      this.width / 2,
      20,
      Text.translatable("potatoclient.config.pearlCount.text"),
      this.textRenderer
    );

    TextFieldWidget pearlCountPositionXInput = new TextFieldWidget(
      this.textRenderer,
      100,
      86,
      50,
      20,
      Text.literal("X")
    );

    TextFieldWidget pearlCountPositionYInput = new TextFieldWidget(
      this.textRenderer,
      155,
      86,
      50,
      20,
      Text.literal("Y")
    );

    ButtonWidget pearlCountToggle = ButtonWidget.builder(Text.translatable("potatoclient.config.toggle.text"), (button -> {
        modules.pearlCount.enabled = !modules.pearlCount.enabled;
      })
    ).dimensions(210,86,50,20).build();

    // TOTEM COUNT
    TextWidget totemCountText = new TextWidget(
      10,
      108,
      this.width / 2,
      20,
      Text.translatable("potatoclient.config.totemCount.text"),
      this.textRenderer
    );

    TextFieldWidget totemCountPositionXInput = new TextFieldWidget(
      this.textRenderer,
      100,
      108,
      50,
      20,
      Text.literal("X")
    );

    TextFieldWidget totemCountPositionYInput = new TextFieldWidget(
      this.textRenderer,
      155,
      108,
      50,
      20,
      Text.literal("Y")
    );

    ButtonWidget totemCountToggle = ButtonWidget.builder(Text.translatable("potatoclient.config.toggle.text"), (button -> {
        modules.totemCount.enabled = !modules.totemCount.enabled;
      })
    ).dimensions(210,108,50,20).build();

    ButtonWidget backButton = ButtonWidget.builder(Text.translatable("potatoclient.config.backButton.text"), (button -> {
        MinecraftClient.getInstance().setScreen(new renderMainConfigScreen(Text.translatable("potatoclient.screen.config.name")));
        modules.crystalCount.xPos = Integer.parseInt(crystalCountPositionXInput.getText());
        modules.crystalCount.yPos = Integer.parseInt(crystalCountPositionYInput.getText());
        modules.expCount.xPos = Integer.parseInt(expCountPositionXInput.getText());
        modules.expCount.yPos = Integer.parseInt(expCountPositionYInput.getText());
        modules.gappleCount.xPos = Integer.parseInt(gappleCountPositionXInput.getText());
        modules.gappleCount.yPos = Integer.parseInt(gappleCountPositionYInput.getText());
        modules.pearlCount.xPos = Integer.parseInt(pearlCountPositionXInput.getText());
        modules.pearlCount.yPos = Integer.parseInt(pearlCountPositionYInput.getText());
        modules.totemCount.xPos = Integer.parseInt(totemCountPositionXInput.getText());
        modules.totemCount.yPos = Integer.parseInt(totemCountPositionYInput.getText());
      })
    ).dimensions((this.width / 2) - 50, (int) (this.height * 0.95) - 20,100,20).build();

    crystalCountPositionXInput.setText(String.valueOf(modules.crystalCount.xPos));
    crystalCountPositionYInput.setText(String.valueOf(modules.crystalCount.yPos));
    expCountPositionXInput.setText(String.valueOf(modules.expCount.xPos));
    expCountPositionYInput.setText(String.valueOf(modules.expCount.yPos));
    gappleCountPositionXInput.setText(String.valueOf(modules.gappleCount.xPos));
    gappleCountPositionYInput.setText(String.valueOf(modules.gappleCount.yPos));
    pearlCountPositionXInput.setText(String.valueOf(modules.pearlCount.xPos));
    pearlCountPositionYInput.setText(String.valueOf(modules.pearlCount.yPos));
    totemCountPositionXInput.setText(String.valueOf(modules.totemCount.xPos));
    totemCountPositionYInput.setText(String.valueOf(modules.totemCount.yPos));

    this.addDrawableChild(moduleColumnText);
    this.addDrawableChild(xPositionColumnText);
    this.addDrawableChild(yPositionColumnText);
    this.addDrawableChild(crystalCountText);
    this.addDrawableChild(crystalCountPositionXInput);
    this.addDrawableChild(crystalCountPositionYInput);
    this.addDrawableChild(crystalCountToggle);
    this.addDrawableChild(expCountText);
    this.addDrawableChild(expCountPositionXInput);
    this.addDrawableChild(expCountPositionYInput);
    this.addDrawableChild(expCountToggle);
    this.addDrawableChild(gappleCountText);
    this.addDrawableChild(gappleCountPositionXInput);
    this.addDrawableChild(gappleCountPositionYInput);
    this.addDrawableChild(gappleCountToggle);
    this.addDrawableChild(pearlCountText);
    this.addDrawableChild(pearlCountPositionXInput);
    this.addDrawableChild(pearlCountPositionYInput);
    this.addDrawableChild(pearlCountToggle);
    this.addDrawableChild(totemCountText);
    this.addDrawableChild(totemCountPositionXInput);
    this.addDrawableChild(totemCountPositionYInput);
    this.addDrawableChild(totemCountToggle);
    this.addDrawableChild(backButton);
  }
}
