/**
 * @Hamza (your name)
 */
public class PhraseOMatic
{
    public static void main (String[] args){
        // Sets of words
        String[] wordListOne = {"abundant","delightful","high","nutritious","square","adorable","dirty","hollow","obedient","steep",
                "agreeable","drab","hot","obnoxious","sticky","alive","dry","hot","odd","straight","angry","dusty","huge","old-fashioned",
                "strong","beautiful","eager","icy","orange","substantial","better","early","immense","panicky","sweet","bewildered","easy",
                "important","petite","swift","big","elegant","inexpensive","plain","tall","bitter","embarrassed","itchy","powerful","tart",
                "black","empty","jealous","prickly","tasteless","blue","faint","jolly","proud","teeny","boiling","faithful","juicy","puny",
                "teeny-tiny","brave","famous","kind","purple","tender","breeze","fancy","large","purring","thankful","broad","fast","late",
                "quaint","thoughtless","broken","fat","lazy","quick","tiny","bumpy","few","light","quiet","ugliest","calm","fierce","little",
                "rainy","ugly","careful","filthy","lively","rapid","uneven","chilly","flaky","long","red","uninterested","chubby","flat",
                "loose","relieved","unsightly","clean","fluffy","loud","repulsive","uptight","clever","freezing","low","rich","vast","clumsy","fresh","lumpy","rotten","victorious","cold","full","magnificent","round",
                "warm","colossal","gentle","mammoth","salty","weak","cool","gifted","many","scary","wet","creepy","gigantic","massive",
                "scrawny","west","crooked","glamorous","melted","screeching","whispering","cuddly","gray","messy","shallow","white","curly",
                "greasy","miniature","short","wide","curved","great","modern","shy","wide-eyed","damaged","green","mushy","silly","witty",
                "damp","grumpy","mysterious","skinny","wooden","dead","handsome","narrow","slow","worried","deafening","happy","nervous",
                "small","wrong","deep","heavy","nice","soft","yellow","defeated","helpful","noisy","sparkling","young","delicious","helpless",
                "numerous","sparse","yummy"};

        String[] wordListTwo = {"apple","fifth","scale","arithmetic","finger","seashore","badge","flock","sidewalk","basket","frame",
                "sleet","basketball","furniture","smoke","battle","geese","bathtub","beast","ghost","nose","beetle","giraffe","sidewalk",
                "beggar","governor","son","boybrain","honey","stage","bubble","hope","station","bucket","income","throat","cactus","island",
                "throne","cannon","jeans","title","cattle","cow","judge","toothbrush","celery","lamp","turkey","cellar","lettuce","umbrella",
                "cloth","marble","underwear","coach","month","vacation","coast","north","south","east","west","vegetable","crate","ocean",
                "poison","cream","patch","riddle","daughter","girl","plane","scale","donkey","playground","visitor","earthquake","poison",
                "voyage","feast","riddle","year"};
                
        String[] wordListThree = {"question","add","itch","reach","allow","jog","rinse","bake","jump","run","bang","scatter","call","kick",
                "stay","chase","knit","swim","damage","land","talk","drop","lock","turn","end","march","untie","escape","mix","use","fasten",
                "name","vanish","fix","notice","visit","gather","obey","walk","grab","open","work","hang","pass","yawn","hug","pitch","yell",
                "imagine","promise"};        

        // How many words are in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        // Generate three random numbers
        int rand1 = (int) (Math.random() * oneLength); // Order of operations is used here, see what happens when you remove the brackets around "Math.random() * oneLength"
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        // Now build a phrase
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        // Print out the phrase
        System.out.println("What we need is a(n) " + phrase);
    }
}
