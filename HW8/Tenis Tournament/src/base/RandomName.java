package base;

import java.util.Random;

public class RandomName {
    private String[] names = new String[]{
            "Roy Macke",
            "Hal Keep",
            "Cedrick Stowe",
            "Sam Flippin",
            "Adolph Sowell",
            "Ricky Deshotel",
            "Boyce Effinger",
            "Eddie Lattimer",
            "Pierre Effler",
            "Chauncey Acosta",
            "Ward Truax",
            "Stephen Lasiter",
            "Darrel Shelman",
            "Dario Cao",
            "Hosea Bickel",
            "Teddy Faul",
            "Francesco Done",
            "Kory Hummer",
            "Andrew Skeens",
            "Percy Heitman",
            "Kirby Blocher",
            "Lance Clairmont",
            "Bryant Biermann",
            "Odell Palko",
            "Dan Grijalva",
            "Levi Briones",
            "Paul Treadway",
            "Alfred Hollis",
            "Miles Regnier",
            "Leslie Badeaux"
    };

    Random random = new Random();
    public String getRandomName(){
        int randomName = random.nextInt(names.length);
        return names[randomName];
    }


}
