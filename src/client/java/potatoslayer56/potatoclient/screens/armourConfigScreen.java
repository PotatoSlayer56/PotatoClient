package potatoslayer56.potatoclient.screens;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.gui.widget.TextWidget;
import net.minecraft.text.Text;
import potatoslayer56.potatoclient.config.modules;

public class armourConfigScreen extends Screen {
  public armourConfigScreen(Text title) {
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

    // HELMET
    TextWidget helmetDisplayText = new TextWidget(
      10,
      20,
      this.width / 2,
      20,
      Text.translatable("potatoclient.config.helmetDisplay.text"),
      this.textRenderer
    );

    TextFieldWidget helmetDisplayPositionXInput = new TextFieldWidget(
      this.textRenderer,
      100,
      20,
      50,
      20,
      Text.literal("X")
    );

    TextFieldWidget helmetDisplayPositionYInput = new TextFieldWidget(
      this.textRenderer,
      155,
      20,
      50,
      20,
      Text.literal("Y")
    );

    ButtonWidget helmetDisplayToggle = ButtonWidget.builder(Text.translatable("potatoclient.config.toggle.text"), (button -> {
        modules.helmetDisplay.enabled = !modules.helmetDisplay.enabled;
      })
    ).dimensions(210,20,50,20).build();

    // CHESTPLATE
    TextWidget chestplateDisplayText = new TextWidget(
      10,
      42,
      this.width / 2,
      20,
      Text.translatable("potatoclient.config.chestplateDisplay.text"),
      this.textRenderer
    );

    TextFieldWidget chestplateDisplayPositionXInput = new TextFieldWidget(
      this.textRenderer,
      100,
      42,
      50,
      20,
      Text.literal("X")
    );

    TextFieldWidget chestplateDisplayPositionYInput = new TextFieldWidget(
      this.textRenderer,
      155,
      42,
      50,
      20,
      Text.literal("Y")
    );

    ButtonWidget chestplateDisplayToggle = ButtonWidget.builder(Text.translatable("potatoclient.config.toggle.text"), (button -> {
        modules.chestplateDisplay.enabled = !modules.chestplateDisplay.enabled;
      })
    ).dimensions(210,42,50,20).build();

    // LEGGINGS
    TextWidget leggingsDisplayText = new TextWidget(
      10,
      64,
      this.width / 2,
      20,
      Text.translatable("potatoclient.config.leggingsDisplay.text"),
      this.textRenderer
    );

    TextFieldWidget leggingsDisplayPositionXInput = new TextFieldWidget(
      this.textRenderer,
      100,
      64,
      50,
      20,
      Text.literal("X")
    );

    TextFieldWidget leggingsDisplayPositionYInput = new TextFieldWidget(
      this.textRenderer,
      155,
      64,
      50,
      20,
      Text.literal("Y")
    );

    ButtonWidget leggingsDisplayToggle = ButtonWidget.builder(Text.translatable("potatoclient.config.toggle.text"), (button -> {
        modules.leggingsDisplay.enabled = !modules.leggingsDisplay.enabled;
      })
    ).dimensions(210,64,50,20).build();

    // BOOTS
    TextWidget bootsDisplayText = new TextWidget(
      10,
      86,
      this.width / 2,
      20,
      Text.translatable("potatoclient.config.bootsDisplay.text"),
      this.textRenderer
    );

    TextFieldWidget bootsDisplayPositionXInput = new TextFieldWidget(
      this.textRenderer,
      100,
      86,
      50,
      20,
      Text.literal("X")
    );

    TextFieldWidget bootsDisplayPositionYInput = new TextFieldWidget(
      this.textRenderer,
      155,
      86,
      50,
      20,
      Text.literal("Y")
    );

    ButtonWidget bootsDisplayToggle = ButtonWidget.builder(Text.translatable("potatoclient.config.toggle.text"), (button -> {
        modules.bootsDisplay.enabled = !modules.bootsDisplay.enabled;
      })
    ).dimensions(210,86,50,20).build();

    ButtonWidget backButton = ButtonWidget.builder(Text.translatable("potatoclient.config.backButton.text"), (button -> {
        MinecraftClient.getInstance().setScreen(new mainConfigScreen(Text.translatable("potatoclient.screen.config.name")));
        modules.helmetDisplay.xPos = Integer.parseInt(helmetDisplayPositionXInput.getText());
        modules.helmetDisplay.yPos = Integer.parseInt(helmetDisplayPositionYInput.getText());
        modules.chestplateDisplay.xPos = Integer.parseInt(chestplateDisplayPositionXInput.getText());
        modules.chestplateDisplay.yPos = Integer.parseInt(chestplateDisplayPositionYInput.getText());
        modules.leggingsDisplay.xPos = Integer.parseInt(leggingsDisplayPositionXInput.getText());
        modules.leggingsDisplay.yPos = Integer.parseInt(leggingsDisplayPositionYInput.getText());
        modules.bootsDisplay.xPos = Integer.parseInt(bootsDisplayPositionXInput.getText());
        modules.bootsDisplay.yPos = Integer.parseInt(bootsDisplayPositionYInput.getText());
      })
    ).dimensions((this.width / 2) - 50, (int) (this.height * 0.95) - 20,100,20).build();

    helmetDisplayPositionXInput.setText(String.valueOf(modules.helmetDisplay.xPos));
    helmetDisplayPositionYInput.setText(String.valueOf(modules.helmetDisplay.yPos));
    chestplateDisplayPositionXInput.setText(String.valueOf(modules.chestplateDisplay.xPos));
    chestplateDisplayPositionYInput.setText(String.valueOf(modules.chestplateDisplay.yPos));
    leggingsDisplayPositionXInput.setText(String.valueOf(modules.leggingsDisplay.xPos));
    leggingsDisplayPositionYInput.setText(String.valueOf(modules.leggingsDisplay.yPos));
    bootsDisplayPositionXInput.setText(String.valueOf(modules.bootsDisplay.xPos));
    bootsDisplayPositionYInput.setText(String.valueOf(modules.bootsDisplay.yPos));

    this.addDrawableChild(moduleColumnText);
    this.addDrawableChild(xPositionColumnText);
    this.addDrawableChild(yPositionColumnText);
    this.addDrawableChild(helmetDisplayText);
    this.addDrawableChild(helmetDisplayPositionXInput);
    this.addDrawableChild(helmetDisplayPositionYInput);
    this.addDrawableChild(helmetDisplayToggle);
    this.addDrawableChild(chestplateDisplayText);
    this.addDrawableChild(chestplateDisplayPositionXInput);
    this.addDrawableChild(chestplateDisplayPositionYInput);
    this.addDrawableChild(chestplateDisplayToggle);
    this.addDrawableChild(leggingsDisplayText);
    this.addDrawableChild(leggingsDisplayPositionXInput);
    this.addDrawableChild(leggingsDisplayPositionYInput);
    this.addDrawableChild(leggingsDisplayToggle);
    this.addDrawableChild(bootsDisplayText);
    this.addDrawableChild(bootsDisplayPositionXInput);
    this.addDrawableChild(bootsDisplayPositionYInput);
    this.addDrawableChild(bootsDisplayToggle);
    this.addDrawableChild(backButton);
  }
}
