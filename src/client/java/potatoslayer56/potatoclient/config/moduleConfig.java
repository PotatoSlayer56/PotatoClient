package potatoslayer56.potatoclient.config;

public class moduleConfig {
  public int xPos;
  public int yPos;

  public int colour;

  public boolean enabled;

  public moduleConfig(int x, int y, int col, boolean enab) {
    xPos = x;
    yPos = y;
    colour = col;
    enabled = enab;
  }
}
