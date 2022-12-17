package com.plandell.repository

import com.plandell.model.ApiResponse
import com.plandell.model.Movie

class MovieImplem : IMovieRepository {

    override val movies: Map<String, List<Movie>> by lazy {
        mapOf(
            "allMovies" to allMovies,
           // "lasted" to lastedSession,
            "top" to topSession,
            "favorite" to favoriteSession
        )
    }

  //  override val lastedSession: List<Movie> = movies["allMovies"]!!

    override val topSession: List<Movie> = listOf(
        Movie(
            id = 19,
            title = "Halloween Ends",
            image = "/images/halloween.jpg",
            description = "Four years after the events of Halloween in 2018, Laurie has decided to liberate herself from fear and rage and embrace life. But when a young man is accused of killing a boy he was babysitting, it ignites a cascade of violence and terror that will force Laurie to finally confront the evil she can’t control, once and for all.",
            categories = listOf("Thriller", "Horror"),
            rating = 4.2,
            year = 2022
        ),
        Movie(
            id = 20,
            title = "Lyle, Lyle, Crocodile",
            image = "/images/lyle.jpg",
            description = "Based on the best-selling book series by Bernard Waber, Lyle, Lyle, Crocodile is a live-action/CGI musical comedy that brings this beloved character to a new, global audience.",
            categories = listOf("Comedy", "Family", "Music"),
            rating = 4.7,
            year = 2022
        ),
        Movie(
            id = 21,
            title = "It's a Wonderful Binge",
            image = "/images/wonderful.jpg",
            description = "Like the original film, the sequel is set in a near future where all drinking and drugs are banned except for on one glorious day known as The Binge. This year, that day happens to miraculously land on Christmas.\n",
            categories = listOf("Comedy"),
            rating = 4.2,
            year = 2022
        ),
        Movie(
            id = 22,
            title = "Disenchanted ",
            image = "/images/disenchanted.jpg",
            description = "Disillusioned with life in the city, feeling out of place in suburbia, and frustrated that her happily ever after hasn’t been so easy to find, Giselle turns to the magic of Andalasia for help. Accidentally transforming the entire town into a real-life fairy tale and placing her family’s future happiness in jeopardy, she must race against time to reverse the spell and determine what happily ever after truly means to her and her family.\n",
            categories = listOf("Comedy", "Fantasy", "Family"),
            rating = 4.2,
            year = 2022
        ),
        Movie(
            id = 23,
            title = "Hocus Pocus 2",
            image = "/images/hocuspocus.jpg",
            description = "Three young women accidentally bring back the Sanderson Sisters to modern day Salem and must figure out how to stop the child-hungry witches from wreaking havoc on the world.\n",
            categories = listOf("Family", "Comedy", "Fantasy"),
            rating = 4.2,
            year = 2022
        ),
        Movie(
            id = 24,
            title = "Black Adam",
            image = "/images/blackadam.jpg",
            description = "Nearly 5,000 years after he was bestowed with the almighty powers of the Egyptian gods—and imprisoned just as quickly—Black Adam is freed from his earthly tomb, ready to unleash his unique form of justice on the modern world.\n",
            categories = listOf("Action", "Fantasy", "Science", "Fiction"),
            rating = 4.9,
            year = 2022
        ),
        Movie(
            id = 25,
            title = "Bullet Proof",
            image = "/images/bullet.jpg",
            description = "The Thief pulls off the robbery of a lifetime when he robs the psychotic drug lord, Temple. The plan goes off without a hitch until the Thief discovers a stowaway in his getaway car - Temple's pregnant wife, Mia.\n",
            categories = listOf("Action", "Crime"),
            rating = 4.2,
            year = 2022
        ),
        Movie(
            id = 26,
            title = "Thor: Love and Thunder ",
            image = "/images/thor.jpg",
            description = "After his retirement is interrupted by Gorr the God Butcher, a galactic killer who seeks the extinction of the gods, Thor Odinson enlists the help of King Valkyrie, Korg, and ex-girlfriend Jane Foster, who now wields Mjolnir as the Mighty Thor. Together they embark upon a harrowing cosmic adventure to uncover the mystery of the God Butcher’s vengeance and stop him before it’s too late.\n",
            categories = listOf("Action", "Fantasy", "Comedy"),
            rating = 4.7,
            year = 2022
        ),
        Movie(
            id = 27,
            title = "Shang-Chi and the Legend of the Ten Rings",
            image = "/images/shangchiposter.jpg",
            description = "Shang-Chi must confront the past he thought he left behind when he is drawn into the web of the mysterious Ten Rings organization.\n",
            categories = listOf("Action", "Adventure", "Fantasy"),
            rating = 3.9,
            year = 2022
        ),
        Movie(
            id = 28,
            title = "Troll",
            image = "/images/troll.jpg",
            description = "Deep inside the mountain of Dovre, something gigantic awakens after being trapped for a thousand years. Destroying everything in its path, the creature is fast approaching the capital of Norway. But how do you stop something you thought only existed in Norwegian folklore?\n",
            categories = listOf("Fantasy", "Adventure", "Action"),
            rating = 4.6,
            year = 2022
        ),
        Movie(
            id = 29,
            title = "The Guardians of the Galaxy Holiday Special ",
            image = "/images/holidayspecial.jpg",
            description = "On a mission to make Christmas unforgettable for Quill, the Guardians head to Earth in search of the perfect present.\n",
            categories = listOf("Adventure", "Science", "Fiction", "Comedy"),
            rating = 4.8,
            year = 2022
        ),
        Movie(
            id = 30,
            title = "Black Panther: Wakanda Forever",
            image = "/images/wakandaforever.jpg",
            description = "Queen Ramonda, Shuri, M’Baku, Okoye and the Dora Milaje fight to protect their nation from intervening world powers in the wake of King T’Challa’s death. As the Wakandans strive to embrace their next chapter, the heroes must band together with the help of War Dog Nakia and Everett Ross and forge a new path for the kingdom of Wakanda.\n",
            categories = listOf("Action", "Science", "Fiction", "Adventure"),
            rating = 4.3,
            year = 2022
        )
    )

    override val favoriteSession: List<Movie> = listOf(
        Movie(
            id = 7,
            title = "Stowaway",
            image = "/images/stowaway.jpg",
            description = "A tenacious party girl fights to survive after three thieves commandeer her luxury yacht. Unable to escape and trapped on the yacht at high seas, the prey becomes the hunter as she turns the tables on the intruders and takes matters into her own hands.\n",
            categories = listOf("Thriller", "Action"),
            rating = 4.2,
            year = 2022
        ),
        Movie(
            id = 8,
            title = "Titanic 666",
            image = "/titanic/jpg.png",
            description = "After a mammoth cruise ship sails over the site of the Titanic’s disaster, dark and deadly events start to occur on board. As the ship’s captain investigates the tragic occurrences, it becomes clear that the passengers and crew from the original Titanic have returned.\n",
            categories = listOf("Thriller", "Horror"),
            rating = 3.8,
            year = 2022
        ),
        Movie(
            id = 9,
            title = "Catch the Fair One",
            image = "/images/catch.jpg",
            description = "A Native American boxer embarks on the fight of her life when she goes in search of her missing sister.\n",
            categories = listOf("Drama", "Thriller", "Crime"),
            rating = 4.3,
            year = 2022
        ),
        Movie(
            id = 10,
            title = "The Ledge",
            image = "/images/theledge.jpg",
            description = "A rock climbing adventure between two friends turns into a terrifying nightmare. After Kelly captures the murder of her best friend on camera, she becomes the next target of a tight-knit group of friends who will stop at nothing to destroy the evidence and anyone in their way. Desperate for her safety, she begins a treacherous climb up a mountain cliff and her survival instincts are put to the test when she becomes trapped with the killers just 20 feet away.\n",
            categories = listOf("Horror", "Action"),
            rating = 4.3,
            year = 2022
        ),
        Movie(
            id = 11,
            title = "The Lost City",
            image = "/images/thelostcity.jpg",
            description = "Brilliant, but reclusive author Loretta Sage (Sandra Bullock) has spent her career writing about exotic places in her popular romance-adventure novels featuring handsome cover model Alan (Channing Tatum), who has dedicated his life to embodying the hero character, “Dash.” While on tour promoting her new book with Alan, Loretta is kidnapped by an eccentric billionaire (Daniel Radcliffe) who hopes that she can lead him to the ancient lost city’s treasure from her latest story. Wanting to prove that he can be a hero in real life and not just on the pages of her books, Alan sets off to rescue her. Thrust into an epic jungle adventure, the unlikely pair will need to work together to survive the elements and find the ancient treasure before it’s lost forever.\n",
            categories = listOf("Adventure", "Action", "Comedy"),
            rating = 4.9,
            year = 2022
        ),
        Movie(
            id = 12,
            title = "DC League of Super-Pets",
            image = "/images/super-pets.jpg",
            description = "Dwayne Johnson stars as the voice of Krypto the Super-Dog in Warner Bros. Pictures' animated action adventure feature film \"DC League of Super-Pets,\" from director Jared Stern. The film also stars the voices of Kevin Hart (the \"Jumanji\" and \"Secret Life of Pets\" films), Kate McKinnon (\"Saturday Night Live,\" the \"Magic School Bus Rides Again\" films, \"Ferdinand\"), John Krasinski (the \"Quiet Place\" films, \"Free Guy\"), Vanessa Bayer (\"Saturday Night Live,\" \"Office Christmas Party,\" \"Trainwreck\"), Natasha Lyonne (\"Show Dogs,\" \"Ballmastrz 9009\"), Diego Luna (\"Rogue One: A Star Wars Story,\" \"Maya and the Three\"), Marc Maron (\"Joker,\" \"GLOW\"), Thomas Middleditch (\"Godzilla: King of the Monsters,\" \"Captain Underpants: The First Epic Movie\"), Ben Schwartz (\"Sonic the Hedgehog,\" \"Duck Tales\"), and Keanu Reeves (the \"Matrix\" and \"John Wick\" films). In \"DC League of Super-Pets,\" Krypto the Super-Dog and Superman are inseparable best friends, sharing the same superpowers and fighting crime in Metropolis side by side. When Superman and the rest of the Justice League are kidnapped, Krypto must convince a rag-tag shelter pack—Ace the hound, PB the potbellied pig, Merton the turtle and Chip the squirrel—to master their own newfound powers and help him rescue the superheroes. Stern, a veteran writer/consultant on the \"LEGO®\" movies, makes his animated feature film directorial debut, directing from a screenplay he wrote with frequent collaborator John Whittington, based on characters from DC, Superman created by Jerry Siegel and Joe Shuster. The film is produced by Patricia Hicks, Dwayne Johnson, Dany Garcia, Hiram Garcia and Jared Stern. The executive producers are John Requa, Glenn Ficarra, Nicholas Stoller, Allison Abbate, Chris Leahy, Sharon Taylor and Courtenay Valenti. Stern's creative team includes production designer Kim Taylor (\"The LEGO® Ninjago Movie\") and editors David Egan (\"Game Night,\" \"Vacation\") and Jhoanne Reyes (\"Teen Titans GO!\" \"Young Justice\"). The music is by Steve Jablonsky (the \"Transformers\" films). Warner Bros. Pictures Presents A Seven Bucks Production, \"DC League of Super-Pets.\" The film will be released by Warner Bros. Pictures in theaters on May 20, 2022.\n",
            categories = listOf("Comedy", "Family", "Science", "Fiction", "Action", "Animation"),
            rating = 3.7,
            year = 2022
        ),
        Movie(
            id = 13,
            title = "Nope ",
            image = "/images/nope.jpg",
            description = "Residents in a lonely gulch of inland California bear witness to an uncanny, chilling discovery",
            categories = listOf("Mystery", "Thriller", "Horror", "Science", "Fiction"),
            rating = 4.7,
            year = 2022
        ),
        Movie(
            id = 14,
            title = "Fall ",
            image = "/images/fall.jpg",
            description = "For best friends Becky and Hunter, life is all about conquering fears and pushing limits. But after they climb 2,000 feet to the top of a remote, abandoned radio tower, they find themselves stranded with no way down. Now Becky and Hunter’s expert climbing skills will be put to the ultimate test as they desperately fight to survive the elements, a lack of supplies, and vertigo-inducing heights\n",
            categories = listOf("Horror"),
            rating = 3.8,
            year = 2022
        ),
        Movie(
            id = 15,
            title = "Sniper: Rogue Mission",
            image = "/images/sniper.jpg",
            description = "When a crooked federal agent is involved in a human sex trafficking ring, Sniper and CIA Rookie Brandon Beckett goes rogue, teaming up with his former allies Homeland Security Agent Zero and assassin Lady Death to uncover the corrupt agent and take down the criminal organization.\n",
            categories = listOf("Thriller", "Mystery", "Action"),
            rating = 4.2,
            year = 2022
        ),
        Movie(
            id = 16,
            title = "Bones and All",
            image = "/images/bonesandall.jpg",
            description = "BONES AND ALL is a story of first love between Maren, a young woman learning how to survive on the margins of society, and Lee, an intense and disenfranchised drifter; a liberating road odyssey of two young people coming into their own, searching for identity and chasing beauty in a perilous world that cannot abide who they are.\n",
            categories = listOf("Horror", "Romance", "Drama"),
            rating = 4.5,
            year = 2022
        )
    )

    override val allMovies: List<Movie> = listOf(
        Movie(
            id = 0,
            title = "Avatar\nThe Way of Water",
            image = "/images/avatar.png",
            description = "Set more than a decade after the events of the first film, learn the story of the Sully family (Jake, Neytiri, and their kids), the trouble that follows them, the lengths they go to keep each other safe, the battles they fight to stay alive, and the tragedies they endure.",
            categories = listOf("Science Fiction", "Drama", "Action", "Adventure"),
            rating = 4.5,
            year = 2022
        ),
        Movie(
            id = 2,
            title = "Empire of Light",
            image = "/images/empireoflight.jpg",
            description = "A love story set in and around an old cinema on the South Coast of England in the 1980s.",
            categories = listOf("Drama", "Romance"),
            rating = 4.5,
            year = 2022
        ),

        Movie(
            id = 3,
            title = "Guillermo del Toro's Pinocchio",
            image = "/images/pinocchio.jpg",
            description = "Academy Award®-winning filmmaker Guillermo del Toro reinvents Carlo Collodi's classic tale of the wooden marionette who is magically brought to life in order to mend the heart of a grieving woodcarver named Geppetto. This whimsical, stop-motion film directed by Guillermo del Toro and Mark Gustafson follows the mischievous and disobedient adventures of Pinocchio in his pursuit of a place in the world.\n",
            categories = listOf("Animation", "Drama", "Fantasy"),
            rating = 4.5,
            year = 2022
        ),


        Movie(
            id = 4,
            title = "Lesson Plan",
            image = "/images/lessonplan.jpg",
            description = "After a teacher dies, his best friend — a former cop — takes a job at the school where he worked to confront the gang he thinks was responsible.",
            categories = listOf("Thriller", "Crime", "Action"),
            rating = 4.2,
            year = 2022
        ),
        Movie(
            id = 5,
            title = "Hex ",
            image = "/images/hex.jpg",
            description = "Following a mysterious disappearance on a jump, a group of skydivers experiences paranormal occurrences that leave them fighting for their lives.\n",
            categories = listOf("Action", "Thriller", "Horror"),
            rating = 4.8,
            year = 2022
        ),
        Movie(
            id = 6,
            title = "Fullmetal Alchemist",
            image = "/images/fullmetal.jpg",
            description = "The Elric brothers’ long and winding journey comes to a close in this epic finale, where they must face off against an unworldly, nationwide threat.\n",
            categories = listOf("Action", "Fantasy", "Adventure"),
            rating = 3.7,
            year = 2022
        ),
        Movie(
            id = 7,
            title = "Stowaway",
            image = "/images/stowaway.jpg",
            description = "A tenacious party girl fights to survive after three thieves commandeer her luxury yacht. Unable to escape and trapped on the yacht at high seas, the prey becomes the hunter as she turns the tables on the intruders and takes matters into her own hands.\n",
            categories = listOf("Thriller", "Action"),
            rating = 4.2,
            year = 2022
        ),
        Movie(
            id = 8,
            title = "Titanic 666",
            image = "/titanic/jpg",
            description = "After a mammoth cruise ship sails over the site of the Titanic’s disaster, dark and deadly events start to occur on board. As the ship’s captain investigates the tragic occurrences, it becomes clear that the passengers and crew from the original Titanic have returned.\n",
            categories = listOf("Thriller", "Horror"),
            rating = 3.8,
            year = 2022
        ),
        Movie(
            id = 9,
            title = "Catch the Fair One",
            image = "/images/catch.jpg",
            description = "A Native American boxer embarks on the fight of her life when she goes in search of her missing sister.\n",
            categories = listOf("Drama", "Thriller", "Crime"),
            rating = 4.3,
            year = 2022
        ),
        Movie(
            id = 10,
            title = "The Ledge",
            image = "/images/theledge.jpg",
            description = "A rock climbing adventure between two friends turns into a terrifying nightmare. After Kelly captures the murder of her best friend on camera, she becomes the next target of a tight-knit group of friends who will stop at nothing to destroy the evidence and anyone in their way. Desperate for her safety, she begins a treacherous climb up a mountain cliff and her survival instincts are put to the test when she becomes trapped with the killers just 20 feet away.\n",
            categories = listOf("Horror", "Action"),
            rating = 4.3,
            year = 2022
        ),
        Movie(
            id = 11,
            title = "The Lost City",
            image = "/images/thelostcity.jpg",
            description = "Brilliant, but reclusive author Loretta Sage (Sandra Bullock) has spent her career writing about exotic places in her popular romance-adventure novels featuring handsome cover model Alan (Channing Tatum), who has dedicated his life to embodying the hero character, “Dash.” While on tour promoting her new book with Alan, Loretta is kidnapped by an eccentric billionaire (Daniel Radcliffe) who hopes that she can lead him to the ancient lost city’s treasure from her latest story. Wanting to prove that he can be a hero in real life and not just on the pages of her books, Alan sets off to rescue her. Thrust into an epic jungle adventure, the unlikely pair will need to work together to survive the elements and find the ancient treasure before it’s lost forever.\n",
            categories = listOf("Adventure", "Action", "Comedy"),
            rating = 4.9,
            year = 2022
        ),
        Movie(
            id = 12,
            title = "DC League of Super-Pets",
            image = "/images/super-pets.jpg",
            description = "Dwayne Johnson stars as the voice of Krypto the Super-Dog in Warner Bros. Pictures' animated action adventure feature film \"DC League of Super-Pets,\" from director Jared Stern. The film also stars the voices of Kevin Hart (the \"Jumanji\" and \"Secret Life of Pets\" films), Kate McKinnon (\"Saturday Night Live,\" the \"Magic School Bus Rides Again\" films, \"Ferdinand\"), John Krasinski (the \"Quiet Place\" films, \"Free Guy\"), Vanessa Bayer (\"Saturday Night Live,\" \"Office Christmas Party,\" \"Trainwreck\"), Natasha Lyonne (\"Show Dogs,\" \"Ballmastrz 9009\"), Diego Luna (\"Rogue One: A Star Wars Story,\" \"Maya and the Three\"), Marc Maron (\"Joker,\" \"GLOW\"), Thomas Middleditch (\"Godzilla: King of the Monsters,\" \"Captain Underpants: The First Epic Movie\"), Ben Schwartz (\"Sonic the Hedgehog,\" \"Duck Tales\"), and Keanu Reeves (the \"Matrix\" and \"John Wick\" films). In \"DC League of Super-Pets,\" Krypto the Super-Dog and Superman are inseparable best friends, sharing the same superpowers and fighting crime in Metropolis side by side. When Superman and the rest of the Justice League are kidnapped, Krypto must convince a rag-tag shelter pack—Ace the hound, PB the potbellied pig, Merton the turtle and Chip the squirrel—to master their own newfound powers and help him rescue the superheroes. Stern, a veteran writer/consultant on the \"LEGO®\" movies, makes his animated feature film directorial debut, directing from a screenplay he wrote with frequent collaborator John Whittington, based on characters from DC, Superman created by Jerry Siegel and Joe Shuster. The film is produced by Patricia Hicks, Dwayne Johnson, Dany Garcia, Hiram Garcia and Jared Stern. The executive producers are John Requa, Glenn Ficarra, Nicholas Stoller, Allison Abbate, Chris Leahy, Sharon Taylor and Courtenay Valenti. Stern's creative team includes production designer Kim Taylor (\"The LEGO® Ninjago Movie\") and editors David Egan (\"Game Night,\" \"Vacation\") and Jhoanne Reyes (\"Teen Titans GO!\" \"Young Justice\"). The music is by Steve Jablonsky (the \"Transformers\" films). Warner Bros. Pictures Presents A Seven Bucks Production, \"DC League of Super-Pets.\" The film will be released by Warner Bros. Pictures in theaters on May 20, 2022.\n",
            categories = listOf("Comedy", "Family", "Science", "Fiction", "Action", "Animation"),
            rating = 3.7,
            year = 2022
        ),
        Movie(
            id = 13,
            title = "Nope ",
            image = "/images/nope.jpg",
            description = "Residents in a lonely gulch of inland California bear witness to an uncanny, chilling discovery",
            categories = listOf("Mystery", "Thriller", "Horror", "Science", "Fiction"),
            rating = 4.7,
            year = 2022
        ),
        Movie(
            id = 14,
            title = "Fall ",
            image = "/images/fall.jpg",
            description = "For best friends Becky and Hunter, life is all about conquering fears and pushing limits. But after they climb 2,000 feet to the top of a remote, abandoned radio tower, they find themselves stranded with no way down. Now Becky and Hunter’s expert climbing skills will be put to the ultimate test as they desperately fight to survive the elements, a lack of supplies, and vertigo-inducing heights\n",
            categories = listOf("Horror"),
            rating = 3.8,
            year = 2022
        ),
        Movie(
            id = 15,
            title = "Sniper: Rogue Mission",
            image = "/images/sniper.jpg",
            description = "When a crooked federal agent is involved in a human sex trafficking ring, Sniper and CIA Rookie Brandon Beckett goes rogue, teaming up with his former allies Homeland Security Agent Zero and assassin Lady Death to uncover the corrupt agent and take down the criminal organization.\n",
            categories = listOf("Thriller", "Mystery", "Action"),
            rating = 4.2,
            year = 2022
        ),
        Movie(
            id = 16,
            title = "Bones and All",
            image = "/images/bonesandall.jpg",
            description = "BONES AND ALL is a story of first love between Maren, a young woman learning how to survive on the margins of society, and Lee, an intense and disenfranchised drifter; a liberating road odyssey of two young people coming into their own, searching for identity and chasing beauty in a perilous world that cannot abide who they are.\n",
            categories = listOf("Horror", "Romance", "Drama"),
            rating = 4.5,
            year = 2022
        ),
        Movie(
            id = 17,
            title = "Jeepers Creepers: Reborn",
            image = "/images/jeepers.jpg",
            description = "Forced to travel with her boyfriend to a horror festival, Laine begins to experience disturbing visions associated with the urban legend of The Creeper. As the festival arrives and the blood-soaked entertainment builds to a frenzy, she becomes the center of it while something unearthly has been summoned.\n",
            categories = listOf("Horror", "Thriller", "Mystery"),
            rating = 3.2,
            year = 2022
        ),
        Movie(
            id = 18,
            title = "Prey for the Devil",
            image = "/images/preyfor.jpg",
            description = "In response to a global rise in demonic possessions, the Catholic Church reopens exorcism schools to train priests in the Rite of Exorcism. On this spiritual battlefield, an unlikely warrior rises: a young nun, Sister Ann. Thrust onto the spiritual frontline with fellow student Father Dante, Sister Ann finds herself in a battle for the soul of a young girl and soon realizes the Devil has her right where he wants her.\n",
            categories = listOf("Thriller", "Horror"),
            rating = 4.6,
            year = 2022
        ),
        Movie(
            id = 19,
            title = "Halloween Ends",
            image = "/images/halloween.jpg",
            description = "Four years after the events of Halloween in 2018, Laurie has decided to liberate herself from fear and rage and embrace life. But when a young man is accused of killing a boy he was babysitting, it ignites a cascade of violence and terror that will force Laurie to finally confront the evil she can’t control, once and for all.",
            categories = listOf("Thriller", "Horror"),
            rating = 4.2,
            year = 2022
        ),
        Movie(
            id = 20,
            title = "Lyle, Lyle, Crocodile",
            image = "/images/lyle.jpg",
            description = "Based on the best-selling book series by Bernard Waber, Lyle, Lyle, Crocodile is a live-action/CGI musical comedy that brings this beloved character to a new, global audience.",
            categories = listOf("Comedy", "Family", "Music"),
            rating = 4.7,
            year = 2022
        ),
        Movie(
            id = 21,
            title = "It's a Wonderful Binge",
            image = "/images/wonderful.jpg",
            description = "Like the original film, the sequel is set in a near future where all drinking and drugs are banned except for on one glorious day known as The Binge. This year, that day happens to miraculously land on Christmas.\n",
            categories = listOf("Comedy"),
            rating = 4.2,
            year = 2022
        ),
        Movie(
            id = 22,
            title = "Disenchanted ",
            image = "/images/disenchanted.jpg",
            description = "Disillusioned with life in the city, feeling out of place in suburbia, and frustrated that her happily ever after hasn’t been so easy to find, Giselle turns to the magic of Andalasia for help. Accidentally transforming the entire town into a real-life fairy tale and placing her family’s future happiness in jeopardy, she must race against time to reverse the spell and determine what happily ever after truly means to her and her family.\n",
            categories = listOf("Comedy", "Fantasy", "Family"),
            rating = 4.2,
            year = 2022
        ),
        Movie(
            id = 23,
            title = "Hocus Pocus 2",
            image = "/images/hocuspocus.jpg",
            description = "Three young women accidentally bring back the Sanderson Sisters to modern day Salem and must figure out how to stop the child-hungry witches from wreaking havoc on the world.\n",
            categories = listOf("Family", "Comedy", "Fantasy"),
            rating = 4.2,
            year = 2022
        ),
        Movie(
            id = 24,
            title = "Black Adam",
            image = "/images/blackadam.jpg",
            description = "Nearly 5,000 years after he was bestowed with the almighty powers of the Egyptian gods—and imprisoned just as quickly—Black Adam is freed from his earthly tomb, ready to unleash his unique form of justice on the modern world.\n",
            categories = listOf("Action", "Fantasy", "Science", "Fiction"),
            rating = 4.9,
            year = 2022
        ),
        Movie(
            id = 25,
            title = "Bullet Proof",
            image = "/images/bullet.jpg",
            description = "The Thief pulls off the robbery of a lifetime when he robs the psychotic drug lord, Temple. The plan goes off without a hitch until the Thief discovers a stowaway in his getaway car - Temple's pregnant wife, Mia.\n",
            categories = listOf("Action", "Crime"),
            rating = 4.2,
            year = 2022
        ),
        Movie(
            id = 26,
            title = "Thor: Love and Thunder ",
            image = "/images/thor.jpg",
            description = "After his retirement is interrupted by Gorr the God Butcher, a galactic killer who seeks the extinction of the gods, Thor Odinson enlists the help of King Valkyrie, Korg, and ex-girlfriend Jane Foster, who now wields Mjolnir as the Mighty Thor. Together they embark upon a harrowing cosmic adventure to uncover the mystery of the God Butcher’s vengeance and stop him before it’s too late.\n",
            categories = listOf("Action", "Fantasy", "Comedy"),
            rating = 4.7,
            year = 2022
        ),
        Movie(
            id = 27,
            title = "Shang-Chi and the Legend of the Ten Rings",
            image = "/images/shangchiposter.jpg",
            description = "Shang-Chi must confront the past he thought he left behind when he is drawn into the web of the mysterious Ten Rings organization.\n",
            categories = listOf("Action", "Adventure", "Fantasy"),
            rating = 3.9,
            year = 2022
        ),
        Movie(
            id = 28,
            title = "Troll",
            image = "/images/troll.jpg",
            description = "Deep inside the mountain of Dovre, something gigantic awakens after being trapped for a thousand years. Destroying everything in its path, the creature is fast approaching the capital of Norway. But how do you stop something you thought only existed in Norwegian folklore?\n",
            categories = listOf("Fantasy", "Adventure", "Action"),
            rating = 4.6,
            year = 2022
        ),
        Movie(
            id = 29,
            title = "The Guardians of the Galaxy Holiday Special ",
            image = "/images/holidayspecial.jpg",
            description = "On a mission to make Christmas unforgettable for Quill, the Guardians head to Earth in search of the perfect present.\n",
            categories = listOf("Adventure", "Science", "Fiction", "Comedy"),
            rating = 4.8,
            year = 2022
        ),
        Movie(
            id = 30,
            title = "Black Panther: Wakanda Forever",
            image = "/images/wakandaforever.jpg",
            description = "Queen Ramonda, Shuri, M’Baku, Okoye and the Dora Milaje fight to protect their nation from intervening world powers in the wake of King T’Challa’s death. As the Wakandans strive to embrace their next chapter, the heroes must band together with the help of War Dog Nakia and Everett Ross and forge a new path for the kingdom of Wakanda.\n",
            categories = listOf("Action", "Science", "Fiction", "Adventure"),
            rating = 4.3,
            year = 2022
        )
    )

    override fun getAllMovies(): ApiResponse {
        return ApiResponse(
            success = true,
            message = "Ok",
            movies = movies["allMovies"]!!
        )
    }

    override fun getMovieById(id: Int): ApiResponse {
        return ApiResponse(
            success = true,
            message = "Ok",
            movies = searchForId(id)
        )
    }

    override fun getMovieByName(name: String): ApiResponse {
        return ApiResponse(
            message = "Ok",
            success = true,
            movies = searchForName(name = name)
        )
    }

    fun searchForId(id: Int): List<Movie> {
        val movies = getAllMovies()
        val listMovies = mutableListOf<Movie>()
        for (movie in movies.movies) {
            if (movie.id == id) {
                listMovies.add(movie)
            }
        }
        return listMovies
    }

    fun searchForName(name: String): List<Movie> {
        val movies = getAllMovies()
        val listMovies = mutableListOf<Movie>()
        for (movie in movies.movies) {
            if (movie.title.lowercase().contains(name.lowercase())) {
                listMovies.add(movie)
            }
        }
        return listMovies
    }

}
