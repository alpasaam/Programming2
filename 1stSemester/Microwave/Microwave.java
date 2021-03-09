public class Microwave {
  private int time;
  private int level;
  private int seconds;

  // Constructor
  public Microwave() {
    time = 0;
    level = 1;
  }

  // Second Constructor
  public Microwave(int time, int level) {
    this.time = time;
    this.level = level;
  }

  /**
  * This method will add seconds to the microwave
  * @param seconds how many seconds to add to the microwave
  */
  public void increaseTime(int seconds) {
    this.seconds = seconds;
    time = time + seconds;
  }

  /**
  * This method will change the level of the microwave
  * @param level is either level one or two
  */
  public void level(int level) {
    this.level = level;
  }

  /**
  * This method will reset the time and level
  */
  public void reset() {
    time = 0;
    level = 0;
  }

  /**
  * This method will add give a string giving information about how many second and level the microwave is at
  * @return a string with the seconds and level
  */
  public String start() {
    return "Cooking for " + time + " seconds at level " + level + ".";
  }
  }
