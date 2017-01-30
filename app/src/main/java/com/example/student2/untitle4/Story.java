package com.example.student2.untitle4;

/**
 * Created by student2 on 30.01.17.
 */
public class Story {
    private Situation start_story;
    public Situation Situations[];
    public Situation current_situation;
    public int currentSituation;
    Story() {
        Situations = new Situation[12];
        currentSituation = 0;
        int []variants = new int[3];

        variants[0] = 1;
        variants[1] = 2;
        variants[2] = 7;

        Situations[0]= new Situation("Северная Докота, 1865 год", "Ты впервые попал на территорию Каррингтона, небольшого городка с плохой репутацией. После целого дня в седле неплохо \nбыло бы расслабиться в трактире, " + "привязав своего вороного скакуна, ты отправляешься к самому шумному месту в этом \nгородке, с коротким название 'Saloon',\n"
                + "(1) Открыть пендельтюр ударом ноги, привлекая всеобщее внимание\n"
                + "(2) А тебе оно вообще надо? - ты решаешь отдохнуть в другом месте\n"
                + "(3) Ты аккуратно протискиваешься между дверей, и как можно незаметнее пытаешься пройти к барной стойке", variants);

        variants[0] = 6;
        variants[1] = 0;
        Situations[1]= new Situation(" ", "В трактире так и продолжают шуметь. Ты с подозрением осматриваешь контингент трактира и решаешь найти местечко поспокойнее.\nОседлав своего коня, ты удаляешься от сомнительного заведения, не замечая пристального взгляда в спину. Через пару секунд ты слышишь выстрел,\nи все тело пронзает острая боль. В глазах начинает темнеть, ты теряешь равновесие, и твой конь, почуяв запах крови,\nсбрасывает тебя на дорогу, подняв кучу пыли. По твоему бездыханному телу пробежит перекати-поле, а шериф так никогда и не узнает, что это не\nты убил его любимую собачку в прошлом месяце. "
                +"\n(1) Завершить игру"
                +"\n(2) Начать заново", variants);

        variants[0] = 3;
        variants[1] = 4;
        variants[2] = 5;
        Situations[2]= new Situation("Трактир","Наступает тишина. На тебя уставились десятки глаз: брр, ну и жуткие же тут типы. Особенно пристально,\nпочему-то, на тебя смотрел шериф и компания из трех человек, до этого играющих в карты."
                +"\n- (1) Проследуешь к барной стойке, как и собирался ранее."
                +"\n- (2) Попробуешь докопаться к пристально смотрящей на тебя компании. "
                +"\n- (3) Останешься стоять на месте, пока на тебя не перестанут так явно пялиться.  ", variants);

        variants[0] = 6;
        variants[1] = 0;
        Situations[3]= new Situation("Барная стойка","Тебе точно сейчас необходимо выпить. Подходишь к трактирщику и заказываешь стаканчик виски, небрежно\nбросив горсть монет. Самое время осмотреть людей вокруг. Внезапно ты застываешь, боясь поверить своим глазам. В паре шагов от тебя стоит Джек.\nТот самый Джек. Кажется, кого-то ждет запоминающаяся ночка… \nДальше нам было стыдно за тобой следить. На этом и распрощаемся. Только осторожнее с гомофобами, уважаемый Дел Мар."
                +"\n(1) Завершить игру"
                +"\n(2) Начать заново", variants);

        variants[0] = 6;
        variants[1] = 0;
        Situations[4]= new Situation("","Нагло оглядев заведение, ты подошел к компании за столом, которые пристально уставились на тебя, отложив свои карты.\nВзяв стул у соседнего столика, ты поудобнее устроился среди них, и, вытащив несколько карт из колоды, поинтересовался, не против ли они твоей компании.\nЭх, не знал ты, что это были наемники, держащие в ужасе всю округу. Твоя смерть была лишь вопросом времени, она была молниеносной и безболезненной."
                +"\n(1) Завершить игру"
                +"\n(2) Начать заново", variants);

        variants[0] = 6;
        variants[1] = 0;
        Situations[5]= new Situation(" ", "Не долго ты стоял у входа. Бедный шериф все никак не может простить неизвестному, убившему его любимую собачку.\nКонечно, мы-то знаем, что ты не способен убить беззащитное животное, но шериф ненавидит всех чужестранцев с того рокового дня. Поэтому в данный момент твое\nбездыханное тело уже уносят из небольшого трактира с коротким названием 'Saloon'. "
                +"\n(1) Завершить игру"
                +"\n(2) Начать заново", variants);

        variants[0] = 0;
        variants[1] = 0;
        variants[2] = 0;
        Situations[6]= new Situation("Северная Докота, 1865 год", "Последний год твоей жизни", variants);

        variants[0] = 8;
        variants[1] = 11;
        Situations[7]= new Situation("","Ты легонечко открываешь пендельтюр и просачиваешься внутрь, похоже, пока на тебя всем пофиг. Ты удачно достиг барной стойки,\nне привлекая лишнего внимания, и просишь налить себе выпить, но, судя по всему, трактирщику тоже на тебя до лампочки."
                +"\n(1) Прокашливаешься, и довольно громко, пытаясь обратить внимание трактирщика, просишь налить себе виски. "
                +"\n(2) Терпеливо ждешь, пока трактирщик обратит на тебя внимание, и сам предложит хлестнуть чего-нибудь. ", variants);

        variants[0] = 9;
        variants[1] = 10;
        Situations[8]= new Situation("", "Пока ты пытался обратить на себя внимание трактирщика, что получилось только с пятого раза, ты так же ненароком обратил на себя\nвнимание всех находившихся возле барной стойки. Поначалу вокруг тебя были только тихие смешки, а затем уже раздался и полноценный смех,\nчто привлекло внимание остальных посетителей трактира. Излишнее внимание, в такой глупой и обидной ситуации вынудило тебя. "
                +"\n(1) Напиться до беспамятства. "
                +"\n(2) Сбежать в неизвестном направлении, покраснев до кончика ушей. ", variants);

        variants[0] = 6;
        variants[1] = 0;
        Situations[9]= new Situation("","Напившись до беспамятства под всеобщее издевательское веселье, ты не заметил, как перешел свой край, и к тебе пришла белочка.\nПосле непродолжительной битвы с этим страшным зверем ты так и не пришел в себя. Покойся с миром. "
                +"\n- (1) Завершить игру."
                +"\n- (2) Начать заново",variants);

        variants[0] = 6;
        variants[1] = 0;
        Situations[10]= new Situation("", "К сожалению, ты так быстро сбежал, что нам не удалось определить твое нынешнее положение. Если ты это читаешь,\nто, пожалуйста, забери своего коня, он скучает! \n"
                +"\n- (1) Завершить игру."
                +"\n- (2) Начать заново",variants);

        variants[0] = 6;
        variants[1] = 0;
        Situations[11]= new Situation("","Мог бы и позвать трактирщика. Пока ты ждал, что на тебя обратят внимание, все уже давно покинули трактир, и хозяин заметил тебя\nтолько тогда, когда закрывал свою забегаловку. Прикрикнув, он велел убираться тебе вон. После этого случая ты начинаешь заниматься самокопанием, пытаясь понять,\nчто с тобой не так. В конце концов ты вогнал себя в депрессию и ушел из жизни, повесившись возле входа в трактир с коротким названием 'Saloon'.\nПервые посетители скинули твое бренное тело в ближайшую канаву. Даже посмертно на тебя никто не обратил внимания."
                +"\n- (1) Завершить игру."
                +"\n- (2) Начать заново",variants);

    }
    public void go(int num) {
        if (num > 0 && num <= Situations[currentSituation].choices.length)
            currentSituation = Situations[currentSituation].choices[num-1];
        else System.out.println("Вы можете выбирать из" + current_situation.choices.length + "вариантов");
    }


    public boolean isEnd() {
        if (currentSituation == 6)
            return true;
        return false;
    }
}