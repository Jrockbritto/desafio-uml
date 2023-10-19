package apps.player;

public class Player implements PlayerFunctions {
  private boolean Playing = false;

  public boolean getPlaying() {
    return this.Playing;
  }

  private void setPlaying(boolean Playing) {
    this.Playing = Playing;
  }

  @Override
  public void play() {
    setPlaying(true);
    System.out.println("Playing song");
  }

  @Override
  public void pause() {
    setPlaying(false);
    System.out.println("Pausing song");;
  }

  @Override
  public void selectSong(String song) {
    setPlaying(true);
    System.out.println("Now playing "+ song);
  }
}
