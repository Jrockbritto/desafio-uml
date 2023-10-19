import apps.browser.Browser;
import apps.phone.Phone;
import apps.player.Player;

public class Iphone {
    public static void main(String[] args) throws Exception {
        Phone phone = new Phone();
        Browser safari = new Browser();
        Player iPod = new Player();

        iPod.selectSong("Scar tissue");

        phone.setIncomingCall(true);

        iPod.pause();

        phone.answer();

        phone.hangUp();

        iPod.play();

        safari.showPage("New York Times");

        safari.newTab("Youtube");

        safari.refreshPage();

        phone.selectVoiceMail("6");
    }
}
