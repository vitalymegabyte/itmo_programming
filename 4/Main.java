import PartsOfSpeech.*;
import interfaces.IActionable;
import interfaces.IDescribeable;
public class Main {
    public static void main(String[] args) {
        Person vintik = new Person("Винтик", "Винтика", GenderEnum.MALE);
        Person tubik = new Person("Тюбик", "Тюбика", GenderEnum.MALE);
        Person vintikAndShpuntik = new Person("Винтик и Шпунтик", "Винтика и Шпунтика", GenderEnum.THEY);
        Noun zmeevka = new Noun("Змеевка", "Змеевке", GenderEnum.FEMALE);
        Noun greenCity = new Noun("Зеленый город", "Зеленом городе", GenderEnum.MALE);
        Noun greatEvents = new Noun("значительные события", "значительных событий", GenderEnum.THEY);
        Noun day = new Noun("день", "дня", GenderEnum.MALE);
        Noun _this = new Noun("того", "того", GenderEnum.THIS);
        Noun portrait = new Noun("портрет", "портрете", GenderEnum.MALE);
        Noun snezhinka = new Noun("Снежинка", "Снежинки", GenderEnum.FEMALE);
        Noun deal = new Noun("дело", "дела", GenderEnum.THIS);
        Noun hour = new Noun("час", "часа", GenderEnum.MALE);
        Noun alive = new Noun("живой", "живой", GenderEnum.THIS);
        Noun similarity = new Noun("Сходствo", "Сходство", GenderEnum.THIS);
        Noun lotsOf = new Noun("многие", "многих", GenderEnum.THEY);
        Noun notTrue = new Noun("неправда", "неправды", GenderEnum.THIS);
        Noun painter = new Noun("художник", "художника", GenderEnum.MALE);
        Noun beauty = new Noun("красота", "красоту", GenderEnum.FEMALE);
        Noun traits = new Noun("черты", "черт", GenderEnum.THEY);
        Noun _this2 = new Noun("это", "это", GenderEnum.THIS);
        Noun realArt = new Noun("настоящее искусство", "настоящего искусства", GenderEnum.THIS);
        Noun lifeArt = new Noun("живопись", "живописи", GenderEnum.FEMALE);
        Noun wall = new Noun("стена", "стене", GenderEnum.FEMALE);
        Noun downstairsRoom = new Noun("нижняя комната", "нижней комнате", GenderEnum.FEMALE);
        Noun all = new Noun("все", "всех", GenderEnum.THEY);

        Action say = new Action("сказал", "сказала", "сказало", "говорили");
        Action travel = new Action("путешествовал", "путешествовала", "путешествовало", "путешествовали");
        Action happen = new Action("произошел", "произошла", "произошло", "произошли");
        Action begin = new Action("начался", "началась", "началось", "начались");
        Action draw = new Action("нарисовал", "нарисовала", "нарисовало", "нарисовали");
        Action spend = new Action("потратил", "потратила", "потратило", "потратили");
        Action turnedOut = new Action("получился", "получилась", "получилось", "получились");
        Action needed = new Action("нуждался", "нуждалась", "нуждалось", "нуждались");
        SimpleAction embelished = new SimpleAction("приукрашивать");
        Action managedTo = new Action("сумел", "сумела", "сумело", "сумели");
        Action poveshen = new Action("повешен", "повешена", "повешено", "повешены");
        Action could = new Action("мог", "могла", "могло", "могли");
        SimpleAction show = new SimpleAction("показать");
        SimpleAction see = new SimpleAction("видеть");
        SimpleAction required = new SimpleAction("требуется");
        SimpleAction is = new SimpleAction("является");

        Intro whileI = new Intro("Пока");
        Intro empty = new Intro("");
        Intro what = new Intro("что");
        Intro to = new Intro("чтобы");
        Intro noZato = new Intro("но зато");
        Intro although = new Intro("Хотя");
        Intro _if = new Intro("Если");
        Intro then = new Intro("то");
        Intro which = new Intro("каким");

        Prep po = new Prep("по", NounFormEnum.SUB);
        Prep in = new Prep("в", NounFormEnum.SUB);
        Prep with = new Prep("с", NounFormEnum.SUB);
        Prep naEto = new Prep("на это", NounFormEnum.BASE);
        Prep nearlyTwo = new Prep("почти два", NounFormEnum.SUB);
        Prep as = new Prep("как", NounFormEnum.BASE);
        Prep thatOn = new Prep("что на", NounFormEnum.SUB);
        Prep butThis = new Prep("но это", NounFormEnum.BASE);
        Prep from = new Prep("от", NounFormEnum.SUB);
        Prep on = new Prep("на", NounFormEnum.SUB);
        Prep her = new Prep("её", NounFormEnum.SUB);
        Prep was = new Prep("был", NounFormEnum.BASE);

        vintik.print(false).action(say);
        vintik.talk();
        ((IActionable)whileI.print().subword(vintikAndShpuntik, NounFormEnum.BASE))
            .action(travel)
            .subword(zmeevka, po);
        ((Action)travel.describe(", разыскивая паяльник,"))
            .subword(greenCity, in);
        greatEvents.action(happen);
        greatEvents.print();
        System.out.print(".");
        day.print().action(begin).subword(_this, with);
        System.out.print(", ");
        ((Word)((IActionable)what.print().subword(tubik, NounFormEnum.BASE))
            .action(draw)
            .subword(portrait, NounFormEnum.BASE)).subword(snezhinka);
        System.out.print(". ");
        System.out.print(tubik.pronoun);
        ((Word)tubik.action(spend).subword(deal, naEto))
            .subword(hour, nearlyTwo);
        System.out.print(", ");
        ((IActionable)noZato.print().subword(portrait, NounFormEnum.BASE))
            .action(turnedOut)
            .subword(alive, as);
        System.out.print(".");
        similarity.print().describe("было поразительное");
        System.out.print(". ");
        ((IActionable)although.print().subword(lotsOf, NounFormEnum.BASE)).action(say)
            .subword(portrait, thatOn);
        snezhinka.print().action(turnedOut).describe(" даже лучше, чем в жизни");
        System.out.print(",");
        empty.subword(notTrue, butThis);
        System.out.print(".");
        snezhinka.print().describe("вовсе не").action(needed).describe(" в том, ");
        to.print();
        painter.action(embelished).describe(" её");
        System.out.print(".");
        ((Word)((Word)((Word)((IActionable)_if.print()
            .subword(tubik, NounFormEnum.BASE))
            .action(managedTo).describe(" оттенить"))
            .subword(portrait, on))
            .subword(beauty))
            .subword(traits, her);
        System.out.print(" и");
        tubik.action(show).describe("их ярче и выразительнее");
        System.out.print(", ");
        ((IActionable) ((IDescribeable)then.print()
            .subword(_this2))
            .describe("и"))
            .action(required)
            .subword(realArt, from);
        System.out.print(", ");
        which.print();
        lifeArt.action(is);
        lifeArt.print();
        System.out.print(".");
        ((Word)portrait.print().describe("был")
            .action(poveshen)
            .subword(wall, on))
                .subword(downstairsRoom, in);
        System.out.print(", ");
        ((Noun)to.print().subword(all, NounFormEnum.BASE)).action(could);
        all.action(see);
    }
}
