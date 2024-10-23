import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
     /*   Chat деген класс тузунуз, полелери (name, isNew( boolean),dateOfIssue,
                designColor),methods:
        getChatName() {
        }
        ;
        chat тын атын жана тусун чыгарып берсин.
                getIsNewChat() {
        }
        ;
        эгерде акыркы 5 жылдын аралыгында чыксы true,
                болбосо false кайтарсын.
                Аларды мурастаган WhatsApp, Telegram, Instagram, Slack жана башкалар.
        Ар бир класста 2 ден уникалдуу полелери болсун жана parent class тын
методторун переопределять этиши керек.Ар бир мурастап жаткан
        класстын озуно тиешелуу методу болсун, ошол гана класстын эмне
        кылып жатканын жана кандай озгочолуктору бар экенин кайтарып
        берчу.
                main ден ар бир класстын бир нече объектин тузуп баарын массивге
        салыныз.Метод тузунуз бизге параметрден келген чаттардын
        арасынан эн жаны чатты табып, анан чаттын атын жана “эн жаны чат”
        деп консолго чыгарып берсин.
            ,
      */


        Telegram telegram = new Telegram("Telegram", true, LocalDate.of(2013, 4, 17), "Blue", 456, 2000);
        System.out.println(telegram);
        telegram.name();
        telegram.isnew();
        telegram.addSticker();
        telegram.maxSize();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        Whatsapp whatsapp = new Whatsapp("Whatsapp", true, LocalDate.of(2009, 11, 9), "Green", "Family", 200);
        System.out.println(whatsapp);
        whatsapp.name();
        whatsapp.isnew();
        whatsapp.checkMaxFileSize();
        whatsapp.sendMessage("Hi my dear family");

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Instagram instagram = new Instagram("Instagram", true, LocalDate.of(2010, 10, 6), "Pirple", 9, 143);
        System.out.println(instagram);
        instagram.name();
        instagram.isnew();
        instagram.publicPhoto();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        TikTok tikTok = new TikTok("TikTok", true, LocalDate.of(2016, 7, 12), "Black", 5, "Edelweis_0");
        System.out.println(tikTok);
        tikTok.name();
        tikTok.isnew();
        tikTok.upload();
        tikTok.namE();



        Chat [] chats = {whatsapp,telegram,tikTok,instagram};
        newChat(chats);

        }
        public static void newChat(Chat [] chats){
        LocalDate currentDay = LocalDate.now();
        Chat newChat = chats[0];
        for (Chat chat: chats){
            Period curentDay= Period.between(chat.getDateOfIssue(),currentDay);
            Period newDay = Period.between(newChat.getDateOfIssue(),currentDay);
            if (curentDay.getYears()<newDay.getYears()){
                newChat=chat;
            }else if (curentDay.getYears()==newDay.getYears()){
                if (curentDay.getMonths()< newDay.getMonths()){
                    newChat=chat;
                }
            }else if (curentDay.getMonths()==newDay.getMonths()){
                if (curentDay.getDays()<newDay.getDays()){
                    newChat=chat;
                }
            }
           
        }
            System.out.println("Newest chat: "+newChat.getName());
        }

    }

