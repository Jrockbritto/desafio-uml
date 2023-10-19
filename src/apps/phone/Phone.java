package apps.phone;

public class Phone implements PhoneFunctions {
  private boolean OnCall = false;
  private boolean IncomingCall = false;

  public boolean getIncomingCall() {
    return this.IncomingCall;
  }

  public void setIncomingCall(boolean IncomingCall) {
    this.IncomingCall = IncomingCall;
  }

  public boolean getOnCall() {
    return this.OnCall;
  }

  private void setOnCall(boolean OnCall) {
    this.OnCall = OnCall;
  }

  @Override
  public void answer() {
    setOnCall(true);
    setIncomingCall(false);
    System.out.println("On phone Call");
  }

  @Override
  public void hangUp() {
    setOnCall(false);
    System.out.println("Hanging up");
  }

  @Override
  public void selectVoiceMail(String voiceMail) {
    System.out.println("Now playing the voicemail "+ voiceMail);
  }

  @Override
  public void call(String phoneNumber) {
    System.out.println("Calling "+ phoneNumber);
  }
}
