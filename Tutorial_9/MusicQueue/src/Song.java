import java.util.Random;

public class Song {
    private String name;
    private String artist;

    public Song(String name, String artist) {
        this.name = name;
        this.artist = artist;
    }

    // Default constructor generates a random song name and artist
    public Song() {
        name = generateRandomSongName();
        artist = generateRandomArtistName();
    }

    @Override
    public String toString() {
        return '\"' + name + '\"'+ " by " + artist;
    }

    public static String generateRandomSongName() {
        Random randomGenerator = new Random();
        return randomSongNames[randomGenerator.nextInt(randomSongNames.length)];
    }

    public static String generateRandomArtistName() {
        Random randomGenerator = new Random();
        return randomArtistNames[randomGenerator.nextInt(randomArtistNames.length)];
    }

    // Got these from ChatGPT
    private static String[] randomSongNames = {
            "Starlight Echo",
            "Midnight Mirage",
            "Electric Moonbeam",
            "Velvet Dreams",
            "Echoes of the Past",
            "Neon Serenade",
            "Celestial Groove",
            "Crimson Skies",
            "Lunar Whispers",
            "Phoenix Rising",
            "Whispered Horizons",
            "Aurora's Embrace",
            "Lost in Infinity",
            "Radiant Pulse",
            "Mystic Cascade",
            "Urban Twilight",
            "Silver Lining Anthem",
            "Ethereal Journey",
            "Nebula Drift",
            "Infinite Melody",
            "Golden Horizon",
            "Mystic Rhythm",
            "Daydream Symphony",
            "Cosmic Dusk",
            "Enchanted Realm",
            "Sapphire Echo",
            "Nova Lights",
            "Twilight Reverie",
            "Galactic Serenade",
            "Opal Dreamscape",
            "Whispers in the Dark",
            "Echoes of Euphoria",
            "Starlit Voyage",
            "Celestial Drift",
            "Midnight Pulse",
            "Ethereal Radiance",
            "Mystic Glow",
            "Velvet Cascade",
            "Moonlit Journey",
            "Neon Nights",
            "Radiant Reverie",
            "Lost in Stardust",
            "Horizon Whispers",
            "Urban Mirage",
            "Aurora Drift",
            "Crimson Echo",
            "Silver Serenade",
            "Lunar Harmony",
            "Phoenix Dreams",
            "Ethereal Pulse",
            "Starlight Serenade"
    };

    // Got these from ChatGPT
    private static String[] randomArtistNames = {
            "Jaxon Rivers",
            "Luna Voss",
            "Theo Knight",
            "Aria Blaze",
            "Kai Turner",
            "Sienna Vale",
            "Eli Nova",
            "Mira Lane",
            "Zane Storm",
            "Riley Frost",
            "Diana Quinn",
            "Leo Sterling",
            "Aurora Hayes",
            "Jasper Cole",
            "Nina Solis",
            "Max Wilder",
            "Zara Quinn",
            "Finn Alexander",
            "Ivy Brooks",
            "Roman Chase",
            "Parker Lee",
            "Selena Drake",
            "Miles Hayes",
            "Tessa Grey",
            "Jude Monroe",
            "Lila Rae",
            "Owen Hart",
            "Chloe Summers",
            "Derek Fox",
            "Nadia Blake",
            "Cameron Pierce",
            "Sasha Lane",
            "Hunter Wells",
            "Elena Reed",
            "Gavin Scott",
            "Maya Frost",
            "Talon West",
            "Iris Cole",
            "Ethan Carter",
            "Lydia Quinn",
            "Blake Jordan",
            "Ruby Snow",
            "Theo Lane",
            "Violet Brooks",
            "Jackson Hayes",
            "Emma Sterling",
            "Aiden Ross",
            "Harper Quinn",
            "Finn Gallagher",
            "Luna Chase"
    };
}
