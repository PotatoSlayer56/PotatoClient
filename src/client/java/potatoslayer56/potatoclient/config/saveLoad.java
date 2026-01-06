package potatoslayer56.potatoclient.config;

import com.google.gson.Gson;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class saveLoad {
  public static String configPath = "config/potatoclient.config";

  public static void createConfig() {
    try {
      File configFile = new File(configPath);
      if (configFile.createNewFile()) {
        System.out.println("Config created");
        saveToConfig();
      }
      else {
        System.out.println("Config exists");
      }
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public static void saveToConfig() {
    Gson gson = new Gson();
    try {
      FileWriter fileWriter = new FileWriter(configPath);

      fileWriter.write(gson.toJson(modules.fpsCounter));fileWriter.write("\n");
      fileWriter.write(gson.toJson(modules.coordinates));fileWriter.write("\n");
      fileWriter.write(gson.toJson(modules.crystalCount));fileWriter.write("\n");
      fileWriter.write(gson.toJson(modules.expCount));fileWriter.write("\n");
      fileWriter.write(gson.toJson(modules.gappleCount));fileWriter.write("\n");
      fileWriter.write(gson.toJson(modules.pearlCount));fileWriter.write("\n");
      fileWriter.write(gson.toJson(modules.totemCount));fileWriter.write("\n");
      fileWriter.write(gson.toJson(modules.helmetDisplay));fileWriter.write("\n");
      fileWriter.write(gson.toJson(modules.chestplateDisplay));fileWriter.write("\n");
      fileWriter.write(gson.toJson(modules.leggingsDisplay));fileWriter.write("\n");
      fileWriter.write(gson.toJson(modules.bootsDisplay));fileWriter.write("\n");

      fileWriter.close();
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public static void readFromConfig() {
    try {
      File configFile = new File(configPath);
      BufferedReader bufferedReader = new BufferedReader(new FileReader(configFile));
      List<String> data = new ArrayList<String>();
      String st;

      while ((st = bufferedReader.readLine()) != null){
        data.add(st);
      }

      Gson gson = new Gson();
      modules.fpsCounter = gson.fromJson(data.get(0), moduleConfig.class);
      modules.coordinates = gson.fromJson(data.get(1), moduleConfig.class);
      modules.crystalCount = gson.fromJson(data.get(2), moduleConfig.class);
      modules.expCount = gson.fromJson(data.get(3), moduleConfig.class);
      modules.gappleCount = gson.fromJson(data.get(4), moduleConfig.class);
      modules.pearlCount = gson.fromJson(data.get(5), moduleConfig.class);
      modules.totemCount = gson.fromJson(data.get(6), moduleConfig.class);
      modules.helmetDisplay = gson.fromJson(data.get(7), moduleConfig.class);
      modules.chestplateDisplay = gson.fromJson(data.get(8), moduleConfig.class);
      modules.leggingsDisplay = gson.fromJson(data.get(9), moduleConfig.class);
      modules.bootsDisplay = gson.fromJson(data.get(10), moduleConfig.class);
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
