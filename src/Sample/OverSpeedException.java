package sample;

public class OverSpeedException extends Exception {

  public OverSpeedException() {
  }

  public OverSpeedException(String message) {
    super(message);
  }

  public OverSpeedException(Throwable cause) {

  }

  public OverSpeedException(String message, Throwable cause) {
    super(message, cause);
  }

}
