package potatoslayer56.potatoclient.keybinds;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.text.Text;
import org.lwjgl.glfw.GLFW;
import potatoslayer56.potatoclient.screens.mainConfigScreen;
import potatoslayer56.potatoclient.screens.renderMainConfigScreen;

public class config {
  public static void register() {
    KeyBinding openConfigGUI = KeyBindingHelper.registerKeyBinding(new KeyBinding(
      "key.potatoclient.openConfigGUI",
      InputUtil.Type.KEYSYM,
      GLFW.GLFW_KEY_RIGHT_SHIFT,
      KeyBinding.Category.MISC
    ));

    ClientTickEvents.END_CLIENT_TICK.register(minecraftClient -> {
      while (openConfigGUI.isPressed()) {
        MinecraftClient.getInstance().setScreen(new mainConfigScreen(Text.translatable("potatoclient.screen.config.name")));
      }
    });
  }
}
