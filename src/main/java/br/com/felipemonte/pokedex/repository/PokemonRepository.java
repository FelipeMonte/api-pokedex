package br.com.felipemonte.pokedex.repository;

import br.com.felipemonte.pokedex.model.BaseStats;
import br.com.felipemonte.pokedex.model.Move;
import br.com.felipemonte.pokedex.model.Pokemon;
import br.com.felipemonte.pokedex.model.PokemonDetails;

import java.util.List;

public class PokemonRepository {

    private final List<Pokemon> POKEMONS = List.of(
            new Pokemon(0, 1, "bulbasaur", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/1.png", List.of("grass", "poison")),
            new Pokemon(1, 2, "ivysaur", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/2.png", List.of("grass", "poison")),
            new Pokemon(2, 3, "venusaur", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/3.png", List.of("grass", "poison")),
            new Pokemon(3, 4, "charmander", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/4.png", List.of("fire")),
            new Pokemon(4, 5, "charmeleon", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/5.png", List.of("fire")),
            new Pokemon(5, 6, "charizard", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/6.png", List.of("fire", "flying")),
            new Pokemon(6, 7, "squirtle", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/7.png", List.of("water")),
            new Pokemon(7, 8, "wartortle", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/8.png", List.of("water")),
            new Pokemon(8, 9, "blastoise", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/9.png", List.of("water")),
            new Pokemon(9, 10, "caterpie", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10.png", List.of("bug")),
            new Pokemon(10, 11, "metapod", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/11.png", List.of("bug")),
            new Pokemon(11, 12, "butterfree", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/12.png", List.of("bug", "flying")),
            new Pokemon(12, 13, "weedle", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/13.png", List.of("bug", "poison")),
            new Pokemon(13, 14, "kakuna", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/14.png", List.of("bug", "poison")),
            new Pokemon(14, 15, "beedrill", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/15.png", List.of("bug", "poison")),
            new Pokemon(15, 16, "pidgey", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/16.png", List.of("normal", "flying")),
            new Pokemon(16, 17, "pidgeotto", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/17.png", List.of("normal", "flying")),
            new Pokemon(17, 18, "pidgeot", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/18.png", List.of("normal", "flying")),
            new Pokemon(18, 19, "rattata", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/19.png", List.of("normal")),
            new Pokemon(19, 20, "raticate", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/20.png", List.of("normal")),
            new Pokemon(20, 21, "spearow", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/21.png", List.of("normal", "flying")),
            new Pokemon(21, 22, "fearow", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/22.png", List.of("normal", "flying")),
            new Pokemon(22, 23, "ekans", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/23.png", List.of("poison")),
            new Pokemon(23, 24, "arbok", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/24.png", List.of("poison")),
            new Pokemon(24, 25, "pikachu", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/25.png", List.of("electric")),
            new Pokemon(25, 26, "raichu", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/26.png", List.of("electric")),
            new Pokemon(26, 27, "sandshrew", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/27.png", List.of("ground")),
            new Pokemon(27, 28, "sandslash", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/28.png", List.of("ground")),
            new Pokemon(28, 29, "nidoran-f", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/29.png", List.of("poison")),
            new Pokemon(29, 30, "nidorina", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/30.png", List.of("poison")),
            new Pokemon(30, 31, "nidoqueen", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/31.png", List.of("poison", "ground")),
            new Pokemon(31, 32, "nidoran-m", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/32.png", List.of("poison")),
            new Pokemon(32, 33, "nidorino", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/33.png", List.of("poison")),
            new Pokemon(33, 34, "nidoking", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/34.png", List.of("poison", "ground")),
            new Pokemon(34, 35, "clefairy", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/35.png", List.of("fairy")),
            new Pokemon(35, 36, "clefable", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/36.png", List.of("fairy")),
            new Pokemon(36, 37, "vulpix", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/37.png", List.of("fire")),
            new Pokemon(37, 38, "ninetales", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/38.png", List.of("fire")),
            new Pokemon(38, 39, "jigglypuff", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/39.png", List.of("normal", "fairy")),
            new Pokemon(39, 40, "wigglytuff", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/40.png", List.of("normal", "fairy")),
            new Pokemon(40, 41, "zubat", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/41.png", List.of("poison", "flying")),
            new Pokemon(41, 42, "golbat", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/42.png", List.of("poison", "flying")),
            new Pokemon(42, 43, "oddish", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/43.png", List.of("grass", "poison")),
            new Pokemon(43, 44, "gloom", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/44.png", List.of("grass", "poison")),
            new Pokemon(44, 45, "vileplume", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/45.png", List.of("grass", "poison")),
            new Pokemon(45, 46, "paras", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/46.png", List.of("bug", "grass")),
            new Pokemon(46, 47, "parasect", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/47.png", List.of("bug", "grass")),
            new Pokemon(47, 48, "venonat", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/48.png", List.of("bug", "poison")),
            new Pokemon(48, 49, "venomoth", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/49.png", List.of("bug", "poison")),
            new Pokemon(49, 50, "diglett", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/50.png", List.of("ground")),
            new Pokemon(50, 51, "dugtrio", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/51.png", List.of("ground")),
            new Pokemon(51, 52, "meowth", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/52.png", List.of("normal")),
            new Pokemon(52, 53, "persian", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/53.png", List.of("normal")),
            new Pokemon(53, 54, "psyduck", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/54.png", List.of("water")),
            new Pokemon(54, 55, "golduck", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/55.png", List.of("water")),
            new Pokemon(55, 56, "mankey", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/56.png", List.of("fighting")),
            new Pokemon(56, 57, "primeape", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/57.png", List.of("fighting")),
            new Pokemon(57, 58, "growlithe", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/58.png", List.of("fire")),
            new Pokemon(58, 59, "arcanine", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/59.png", List.of("fire")),
            new Pokemon(59, 60, "poliwag", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/60.png", List.of("water")),
            new Pokemon(60, 61, "poliwhirl", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/61.png", List.of("water")),
            new Pokemon(61, 62, "poliwrath", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/62.png", List.of("water", "fighting")),
            new Pokemon(62, 63, "abra", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/63.png", List.of("psychic")),
            new Pokemon(63, 64, "kadabra", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/64.png", List.of("psychic")),
            new Pokemon(64, 65, "alakazam", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/65.png", List.of("psychic")),
            new Pokemon(65, 66, "machop", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/66.png", List.of("fighting")),
            new Pokemon(66, 67, "machoke", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/67.png", List.of("fighting")),
            new Pokemon(67, 68, "machamp", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/68.png", List.of("fighting")),
            new Pokemon(68, 69, "bellsprout", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/69.png", List.of("grass", "poison")),
            new Pokemon(69, 70, "weepinbell", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/70.png", List.of("grass", "poison")),
            new Pokemon(70, 71, "victreebel", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/71.png", List.of("grass", "poison")),
            new Pokemon(71, 72, "tentacool", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/72.png", List.of("water", "poison")),
            new Pokemon(72, 73, "tentacruel", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/73.png", List.of("water", "poison")),
            new Pokemon(73, 74, "geodude", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/74.png", List.of("rock", "ground")),
            new Pokemon(74, 75, "graveler", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/75.png", List.of("rock", "ground")),
            new Pokemon(75, 76, "golem", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/76.png", List.of("rock", "ground")),
            new Pokemon(76, 77, "ponyta", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/77.png", List.of("fire")),
            new Pokemon(77, 78, "rapidash", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/78.png", List.of("fire")),
            new Pokemon(78, 79, "slowpoke", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/79.png", List.of("water", "psychic")),
            new Pokemon(79, 80, "slowbro", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/80.png", List.of("water", "psychic")),
            new Pokemon(80, 81, "magnemite", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/81.png", List.of("electric", "steel")),
            new Pokemon(81, 82, "magneton", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/82.png", List.of("electric", "steel")),
            new Pokemon(82, 83, "farfetchd", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/83.png", List.of("normal", "flying")),
            new Pokemon(83, 84, "doduo", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/84.png", List.of("normal", "flying")),
            new Pokemon(84, 85, "dodrio", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/85.png", List.of("normal", "flying")),
            new Pokemon(85, 86, "seel", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/86.png", List.of("water")),
            new Pokemon(86, 87, "dewgong", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/87.png", List.of("water", "ice")),
            new Pokemon(87, 88, "grimer", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/88.png", List.of("poison")),
            new Pokemon(88, 89, "muk", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/89.png", List.of("poison")),
            new Pokemon(89, 90, "shellder", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/90.png", List.of("water")),
            new Pokemon(90, 91, "cloyster", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/91.png", List.of("water", "ice")),
            new Pokemon(91, 92, "gastly", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/92.png", List.of("ghost", "poison")),
            new Pokemon(92, 93, "haunter", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/93.png", List.of("ghost", "poison")),
            new Pokemon(93, 94, "gengar", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/94.png", List.of("ghost", "poison")),
            new Pokemon(94, 95, "onix", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/95.png", List.of("rock", "ground")),
            new Pokemon(95, 96, "drowzee", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/96.png", List.of("psychic")),
            new Pokemon(96, 97, "hypno", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/97.png", List.of("psychic")),
            new Pokemon(97, 98, "krabby", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/98.png", List.of("water")),
            new Pokemon(98, 99, "kingler", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/99.png", List.of("water")),
            new Pokemon(99, 100, "voltorb", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/100.png", List.of("electric")),
            new Pokemon(100, 101, "electrode", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/101.png", List.of("electric")),
            new Pokemon(101, 102, "exeggcute", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/102.png", List.of("grass", "psychic")),
            new Pokemon(102, 103, "exeggutor", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/103.png", List.of("grass", "psychic")),
            new Pokemon(103, 104, "cubone", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/104.png", List.of("ground")),
            new Pokemon(104, 105, "marowak", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/105.png", List.of("ground")),
            new Pokemon(105, 106, "hitmonlee", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/106.png", List.of("fighting")),
            new Pokemon(106, 107, "hitmonchan", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/107.png", List.of("fighting")),
            new Pokemon(107, 108, "lickitung", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/108.png", List.of("normal")),
            new Pokemon(108, 109, "koffing", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/109.png", List.of("poison")),
            new Pokemon(109, 110, "weezing", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/110.png", List.of("poison")),
            new Pokemon(110, 111, "rhyhorn", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/111.png", List.of("ground", "rock")),
            new Pokemon(111, 112, "rhydon", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/112.png", List.of("ground", "rock")),
            new Pokemon(112, 113, "chansey", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/113.png", List.of("normal")),
            new Pokemon(113, 114, "tangela", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/114.png", List.of("grass")),
            new Pokemon(114, 115, "kangaskhan", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/115.png", List.of("normal")),
            new Pokemon(115, 116, "horsea", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/116.png", List.of("water")),
            new Pokemon(116, 117, "seadra", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/117.png", List.of("water")),
            new Pokemon(117, 118, "goldeen", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/118.png", List.of("water")),
            new Pokemon(118, 119, "seaking", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/119.png", List.of("water")),
            new Pokemon(119, 120, "staryu", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/120.png", List.of("water")),
            new Pokemon(120, 121, "starmie", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/121.png", List.of("water", "psychic")),
            new Pokemon(121, 122, "mr-mime", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/122.png", List.of("psychic", "fairy")),
            new Pokemon(122, 123, "scyther", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/123.png", List.of("bug", "flying")),
            new Pokemon(123, 124, "jynx", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/124.png", List.of("ice", "psychic")),
            new Pokemon(124, 125, "electabuzz", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/125.png", List.of("electric")),
            new Pokemon(125, 126, "magmar", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/126.png", List.of("fire")),
            new Pokemon(126, 127, "pinsir", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/127.png", List.of("bug")),
            new Pokemon(127, 128, "tauros", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/128.png", List.of("normal")),
            new Pokemon(128, 129, "magikarp", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/129.png", List.of("water")),
            new Pokemon(129, 130, "gyarados", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/130.png", List.of("water", "flying")),
            new Pokemon(130, 131, "lapras", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/131.png", List.of("water", "ice")),
            new Pokemon(131, 132, "ditto", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/132.png", List.of("normal")),
            new Pokemon(132, 133, "eevee", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/133.png", List.of("normal")),
            new Pokemon(133, 134, "vaporeon", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/134.png", List.of("water")),
            new Pokemon(134, 135, "jolteon", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/135.png", List.of("electric")),
            new Pokemon(135, 136, "flareon", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/136.png", List.of("fire")),
            new Pokemon(136, 137, "porygon", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/137.png", List.of("normal")),
            new Pokemon(137, 138, "omanyte", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/138.png", List.of("rock", "water")),
            new Pokemon(138, 139, "omastar", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/139.png", List.of("rock", "water")),
            new Pokemon(139, 140, "kabuto", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/140.png", List.of("rock", "water")),
            new Pokemon(140, 141, "kabutops", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/141.png", List.of("rock", "water")),
            new Pokemon(141, 142, "aerodactyl", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/142.png", List.of("rock", "flying")),
            new Pokemon(142, 143, "snorlax", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/143.png", List.of("normal")),
            new Pokemon(143, 144, "articuno", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/144.png", List.of("ice", "flying")),
            new Pokemon(144, 145, "zapdos", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/145.png", List.of("electric", "flying")),
            new Pokemon(145, 146, "moltres", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/146.png", List.of("fire", "flying")),
            new Pokemon(146, 147, "dratini", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/147.png", List.of("dragon")),
            new Pokemon(147, 148, "dragonair", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/148.png", List.of("dragon")),
            new Pokemon(148, 149, "dragonite", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/149.png", List.of("dragon", "flying")),
            new Pokemon(149, 150, "mewtwo", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/150.png", List.of("psychic")),
            new Pokemon(150, 151, "mew", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/151.png", List.of("psychic"))
    );

    Move absorb = new Move("Absorb", "grass", 20);
    Move acid = new Move("acid", "poison", 40);
    Move acidSpray = new Move("acid spray", "poison", 40);
    Move airCutter = new Move("Air Cutter", "flying", 60);
    Move airSlash = new Move("air slash", "flying", 75);
    Move ancientPower = new Move("Ancient Power", "rock", 60);
    Move aquaJet = new Move("Aqua Jet", "water", 40);
    Move aquaTail = new Move("aqua tail", "water", 90);
    Move auroraBeam = new Move("Aurora Beam", "ice", 65);
    Move blizzard = new Move("Blizzard", "ice", 110);
    Move bodySlam = new Move("Body Slam", "normal", 85);
    Move bonemerang = new Move("Bonemerang", "ground", 50);
    Move brickBreak = new Move("Brick Break", "fighting", 75);
    Move bubbleBeam = new Move("Bubble Beam", "water", 65);
    Move bugBite = new Move("bug bite", "bug", 60);
    Move bugBuzz = new Move("bug buzz", "bug", 90);
    Move bulldoze = new Move("Bulldoze", "ground", 60);
    Move chargeBeam = new Move("Charge Beam", "electic", 50);
    Move closeCombat = new Move("Close Combat", "fighting", 120);
    Move confusion = new Move("Confusion", "psychic", 50);
    Move crossChop = new Move("Cross Chop", "fighting", 100);
    Move cut = new Move("cut", "normal", 50);
    Move dazzlingGleam = new Move("Dazzling Gleam", "fairy", 80);
    Move dig = new Move("dig", "ground", 80);
    Move disarmingVoice = new Move("Disarming Voice", "fairy", 40);
    Move discharge = new Move("discharge", "electric", 40);
    Move doubleEdge = new Move("double-edge", "normal", 120);
    Move dragonTail = new Move("Dragon Tail", "dragon", 60);
    Move dragonRush = new Move("Dragon Rush", "dragon", 100);
    Move drainingKiss = new Move("Draining Kiss", "fairy", 50);
    Move drillPeck = new Move("drill peck", "flying", 80);
    Move dynamicPunch = new Move("Dynamic Punch", "fighting", 100);
    Move earthPower = new Move("Earth Power", "ground", 90);
    Move earthquake = new Move("Earthquake", "ground", 100);
    Move ember = new Move("ember", "fire", 40);
    Move fireBlast = new Move("Fire Blast", "fire", 110);
    Move fireFang = new Move("fire fang", "fire", 65);
    Move flamethrower = new Move("flamethrower", "fire", 90);
    Move flameWheel = new Move("Flame Wheel", "fire", 60);
    Move flashCannon = new Move("Flash Cannon", "steel", 80);
    Move fly = new Move("Fly", "flying", 90);
    Move furyCutter = new Move("Fury Cutter", "bug", 40);
    Move futureSight = new Move("Future Sight", "psychic", 120);
    Move gigaDrain = new Move("Giga Drain", "grass", 75);
    Move gigaImpact = new Move("Giga Impact", "normal", 150);
    Move gunkShot = new Move("Gunk Shot", "poison", 120);
    Move gust = new Move("gust", "flying", 40);
    Move harden = new Move("harden", "normal", 0);
    Move hex = new Move("hex", "ghost", 65);
    Move hurricane = new Move("hurricane", "flying", 110);
    Move hydroPump = new Move("Hydro Pump", "water", 110);
    Move iceBeam = new Move("Ice Beam", "ice", 90);
    Move icePunch = new Move("Ice Punch", "ice", 75);
    Move inferno = new Move("inferno", "fire", 100);
    Move lastResort = new Move("Last Resort", "normal", 140);
    Move lick = new Move("lick", "ghost", 30);
    Move lowSweep = new Move("Low Sweep", "fighting", 65);
    Move machPunch = new Move("Mach Punch", "fighting", 40);
    Move megaDrain = new Move("Mega Drain", "grass", 40);
    Move moonblast = new Move("Moonblast", "fairy", 95);
    Move mudSlap = new Move("Mud-Slap", "ground", 20);
    Move outrage = new Move("Outrage", "dragon", 120);
    Move peck = new Move("peck", "flying", 35);
    Move petalDance = new Move("Petal Dance", "grass", 120);
    Move poisonFang = new Move("poison fang", "poison", 50);
    Move poisonJab = new Move("Poison Jab", "poison", 80);
    Move poisonSting = new Move("poison sting", "poison", 15);
    Move powerWhip = new Move("Power Whip", "grass", 120);
    Move psybeam = new Move("psybeam", "psychic", 65);
    Move psychic = new Move("psychic", "psychic", 90);
    Move psyshock = new Move("psyshock", "psychic", 80);
    Move psystrike = new Move("Psystrike", "psychic", 100);
    Move quickAttack = new Move("quick attack", "normal", 40);
    Move razorLeaf = new Move("razor leaf", "grass", 55);
    Move revenge = new Move("revenge", "fighting", 60);
    Move rockBlast = new Move("Rock Blast", "rock", 25);
    Move rockThrow = new Move("Rock Throw", "rock", 50);
    Move rollout = new Move("Rollout", "rock", 30);
    Move sludgeBomb = new Move("Sludge Bomb", "poison", 90);
    Move scratch = new Move("Scratch", "normal", 40);
    Move shadowBall = new Move("Shadow Ball", "ghost", 80);
    Move slash = new Move("Slash", "normal", 70);
    Move sludgeWave = new Move("Sludge Wave", "poison", 95);
    Move smog = new Move("Smog", "poison", 30);
    Move solarBeam = new Move("solar beam", "grass", 120);
    Move spark = new Move("Spark", "electric", 65);
    Move splash = new Move("Splash", "normal", 0);
    Move stomp = new Move("Stomp", "normal", 65);
    Move surf = new Move("Surf", "water", 90);
    Move stoneEdge = new Move("Stone Edge", "rock", 100);
    Move takeDown = new Move("take down", "normal", 90);
    Move tackle = new Move("tackle", "normal", 40);
    Move teleport = new Move("Teleport", "psychic", 40);
    Move thrash =  new Move("Thrash", "normal", 120);
    Move thunder =  new Move("Thunder", "electric", 110);
    Move thunderbolt = new Move("Thunderbolt", "electric", 90);
    Move thunderShock = new Move("Thunder Shock", "electric", 40);
    Move transform = new Move("Transform", "normal", 0);
    Move venoshock = new Move("venoshock", "poison", 65);
    Move vineWhip = new Move("vine whip", "grass", 45);
    Move waterfall = new Move("waterfall", "water", 80);
    Move waterGun = new Move("water gun", "water", 40);
    Move waterPulse = new Move("water pulse", "water", 60);
    Move waveCrash = new Move("wave crash", "water", 120);
    Move wingAttack = new Move("wing attack", "flying", 60);
    Move xScissor = new Move("X-Scissor", "bug", 80);

    private final List<PokemonDetails> POKEMONS_DETAILS = List.of(
            new PokemonDetails(0, 1, "bulbasaur", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/1.png", List.of("grass", "poison"), 6.9, 0.7, List.of(vineWhip, acidSpray), "A strange seed was planted on its back at birth. The plant sprouts and grows with this POKéMON.", new BaseStats(45, 49, 49, 65, 65, 45)),
            new PokemonDetails(1, 2, "ivysaur", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/2.png", List.of("grass", "poison"), 13.0, 1.0, List.of(razorLeaf, acidSpray), "When the bulb on its back grows large, it appears to lose the ability to stand on its hind legs.", new BaseStats(60, 62, 63, 80, 80, 60)),
            new PokemonDetails(2, 3, "venusaur", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/3.png", List.of("grass", "poison"), 100.0, 2.0, List.of(solarBeam, venoshock), "The plant blooms when it is absorbing solar energy. It stays on the move to seek sunlight.", new BaseStats(80, 82, 83, 100, 100, 80)),
            new PokemonDetails(3, 4, "charmander", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/4.png", List.of("fire"), 8.5, 0.6, List.of(ember, fireFang), "Obviously prefers hot places. When it rains, steam is said to spout from the tip of its tail.", new BaseStats(39, 52, 43, 60, 50, 65)),
            new PokemonDetails(4, 5, "charmeleon", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/5.png", List.of("fire"), 19.0, 1.1, List.of(fireFang, flamethrower), "When it swings its burning tail, it elevates the temperature to unbearably high levels.", new BaseStats(58, 64, 58, 80, 65, 80)),
            new PokemonDetails(5, 6, "charizard", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/6.png", List.of("fire", "flying"), 90.5, 1.7, List.of(inferno, airSlash), "Spits fire that is hot enough to melt boulders. Known to cause forest fires unintentionally.", new BaseStats(78, 84, 78, 109, 85, 100)),
            new PokemonDetails(6, 7, "squirtle", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/7.png", List.of("water"), 9.0, 0.5, List.of(waterGun, waterPulse), " After birth, its back swells and hardens into a shell. Powerfully sprays foam from its mouth.", new BaseStats(44, 48, 65, 50, 64, 43)),
            new PokemonDetails(7, 8, "wartortle", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/8.png", List.of("water"), 22.5, 1.0, List.of(waterPulse, aquaTail), "Often hides in water to stalk unwary prey. For swimming fast, it moves its ears to maintain balance.", new BaseStats(59, 63, 80, 65, 80, 58)),
            new PokemonDetails(8, 9, "blastoise", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/9.png", List.of("water"), 85.5, 1.6, List.of(aquaTail, waveCrash), "A brutal POKéMON with pressurized water jets on its shell. They are used for high speed tackles.", new BaseStats(79, 83, 100, 85, 105, 78)),
            new PokemonDetails(9, 10, "caterpie", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10.png", List.of("bug"), 2.3, 0.3, List.of(tackle, bugBite), "Its short feet are tipped with suction pads that enable it to tirelessly climb slopes and walls.", new BaseStats(45, 30, 35, 20, 20, 45)),
            new PokemonDetails(10, 11, "metapod", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/11.png", List.of("bug"), 9.9, 0.7, List.of(harden), "This POKéMON is vulnerable to attack while its shell is soft, exposing its weak and tender body.", new BaseStats(50, 20, 55, 25, 25, 30)),
            new PokemonDetails(11, 12, "butterfree", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/12.png", List.of("bug", "flying"), 32.0, 1.1, List.of(bugBuzz, airSlash), "In battle, it flaps its wings at high speed to release highly toxic dust into the air.", new BaseStats(60, 45, 50, 90, 80, 70)),
            new PokemonDetails(12, 13, "weedle", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/13.png", List.of("bug", "poison"), 3.2, 0.3, List.of(poisonSting, bugBite), "Often found in forests, eating leaves. It has a sharp venomous stinger on its head.", new BaseStats(40, 35, 30, 20, 20, 50)),
            new PokemonDetails(13, 14, "kakuna", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/14.png", List.of("bug", "poison"), 10.0, 0.6, List.of(harden), "Almost incapable of moving, this POKéMON can only harden its shell to protect itself from predators.", new BaseStats(45, 25, 50, 25, 25, 35)),
            new PokemonDetails(14, 15, "beedrill", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/15.png", List.of("bug", "poison"), 29.5, 1.0, List.of(bugBite, venoshock), "Flies at high speed and attacks using its large venomous stingers on its forelegs and tail.", new BaseStats(65, 90, 40, 45, 80, 75)),
            new PokemonDetails(15, 16, "pidgey", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/16.png", List.of("normal", "flying"), 1.8, 0.3, List.of(tackle, gust), "A common sight in forests and woods. It flaps its wings at ground level to kick up blinding sand.", new BaseStats(40, 45, 40, 35, 35, 56)),
            new PokemonDetails(16, 17, "pidgeotto", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/17.png", List.of("normal", "flying"), 30.0, 1.1, List.of(tackle, wingAttack), "Very protective of its sprawling territorial area, this POKéMON will fiercely peck at any intruder.", new BaseStats(63, 60, 55, 50, 50, 71)),
            new PokemonDetails(17, 18, "pidgeot", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/18.png", List.of("normal", "flying"), 39.5, 1.5, List.of(hurricane, quickAttack), "When hunting, it skims the surface of water at high speed to pick off unwary prey such as MAGIKARP.", new BaseStats(83, 80, 75, 70, 70, 101)),
            new PokemonDetails(18, 19, "rattata", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/19.png", List.of("normal"), 3.5, 0.3, List.of(tackle, takeDown), "Bites anything when it attacks. Small and very quick, it is a common sight in many places.", new BaseStats(30, 56, 35, 25, 35, 72)),
            new PokemonDetails(19, 20, "raticate", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/20.png", List.of("normal"), 18.5, 0.7, List.of(tackle, doubleEdge), "It uses its whiskers to maintain its balance. It apparently slows down if they are cut off.", new BaseStats(55, 81, 60, 50, 70, 97)),
            new PokemonDetails(20, 21, "spearow", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/21.png", List.of("normal", "flying"), 2.0, 0.3, List.of(peck, takeDown), "Eats bugs in grassy areas. It has to flap its short wings at high speed to stay airborne.", new BaseStats(40, 60, 30, 31, 31, 70)),
            new PokemonDetails(21, 22, "fearow", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/22.png", List.of("normal", "flying"), 38.0, 1.2, List.of(takeDown, drillPeck), "With its huge and magnificent wings, it can keep aloft without ever having to land for rest.", new BaseStats(65, 90, 65, 61, 61, 100)),
            new PokemonDetails(22, 23, "ekans", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/23.png", List.of("poison"), 6.9, 2.0, List.of(poisonSting, acidSpray), "Moves silently and stealthily. Eats the eggs of birds, such as PIDGEY and SPEAROW, whole.", new BaseStats(35, 60, 44, 40, 54, 55)),
            new PokemonDetails(23, 24, "arbok", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/24.png", List.of("poison"), 65.0, 3.5, List.of(acidSpray, sludgeBomb), "It is rumored that the ferocious warning markings on its belly differ from area to area.", new BaseStats(60, 95, 69, 65, 79, 80)),
            new PokemonDetails(24, 25, "pikachu", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/25.png", List.of("electric"), 6.0, 0.4, List.of(thunderShock, spark), "When several of these POKéMON gather, their electricity could build and cause lightning storms.", new BaseStats(35, 55, 40, 50 , 50, 90)),
            new PokemonDetails(25, 26, "raichu", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/26.png", List.of("electric"), 30.0, 0.8, List.of(spark, thunder), "Its long tail serves as a ground to protect itself from its own high voltage power.", new BaseStats(60, 90, 55, 90, 80, 110)),
            new PokemonDetails(26, 27, "sandshrew", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/27.png", List.of("ground"), 12.0, 0.6, List.of(bulldoze, dig), "Burrows deep underground in arid locations far from water. It only emerges to hunt for food.", new BaseStats(50, 75, 85, 20, 30, 40)),
            new PokemonDetails(27, 28, "sandslash", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/28.png", List.of("ground"), 29.5, 1.0, List.of(dig, earthquake), "Curls up into a spiny ball when threatened. It can roll while curled up to attack or escape.", new BaseStats(75, 100, 110, 45, 55, 65)),
            new PokemonDetails(28, 29, "nidoran-f", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/29.png", List.of("poison"), 7.0, 0.4, List.of(poisonSting, sludgeBomb), "Although small, its venomous barbs render this POKéMON dangerous. The female has smaller horns.", new BaseStats(55, 47, 52, 40, 40, 41)),
            new PokemonDetails(29, 30, "nidorina", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/30.png", List.of("poison"), 20.0, 0.8, List.of(poisonFang, sludgeBomb), "The female’s horn develops slowly. Prefers physical attacks such as clawing and biting.", new BaseStats(70, 62, 67, 55, 55, 56)),
            new PokemonDetails(30, 31, "nidoqueen", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/31.png", List.of("poison", "ground"), 60.0, 1.3, List.of(earthPower, sludgeWave), "Its hard scales provide strong protection. It uses its hefty bulk to execute powerful moves.", new BaseStats(90, 92, 87, 75, 85, 76)),
            new PokemonDetails(31, 32, "nidoran-m", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/32.png", List.of("poison"), 9.0, 0.5, List.of(poisonSting, poisonJab), "Stiffens its ears to sense danger. The larger its horns, the more powerful its secreted venom.", new BaseStats(46, 57, 40, 40, 40, 50)),
            new PokemonDetails(32, 33, "nidorino", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/33.png", List.of("poison"), 19.5, 0.9, List.of(poisonSting, poisonJab), "An aggressive POKéMON that is quick to attack. The horn on its head secretes a powerful venom.", new BaseStats(61, 72, 57, 55, 55, 65)),
            new PokemonDetails(33, 34, "nidoking", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/34.png", List.of("poison", "ground"), 62.0, 1.4, List.of(earthPower, sludgeWave), "It uses its powerful tail in battle to smash, constrict, then break the prey’s bones.", new BaseStats(81, 102, 77, 85, 75, 85)),
            new PokemonDetails(34, 35, "clefairy", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/35.png", List.of("fairy"), 7.5, 0.6, List.of(disarmingVoice, drainingKiss), "Its magical and cute appeal has many admirers. It is rare and found only in certain areas.", new BaseStats(70, 45, 48, 60, 65, 35)),
            new PokemonDetails(35, 36, "clefable", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/36.png", List.of("fairy"), 40.0, 1.3, List.of(disarmingVoice, moonblast), "A timid fairy POKéMON that is rarely seen. It will run and hide the moment it senses people.", new BaseStats(95, 70, 73, 95, 90, 60)),
            new PokemonDetails(36, 37, "vulpix", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/37.png", List.of("fire"), 9.9, 0.6, List.of(ember, flamethrower), "At the time of birth, it has just one tail. The tail splits from its tip as it grows older.", new BaseStats(38, 41, 40, 50, 65, 65)),
            new PokemonDetails(37, 38, "ninetales", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/38.png", List.of("fire"), 19.9, 1.1, List.of(flamethrower, inferno), "Very smart and very vengeful. Grabbing one of its many tails could result in a 1000-year curse.", new BaseStats(73, 76, 75, 81, 100, 100)),
            new PokemonDetails(38, 39, "jigglypuff", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/39.png", List.of("normal", "fairy"), 5.5, 0.5, List.of(disarmingVoice, bodySlam), "When its huge eyes light up, it sings a mysteriously soothing melody that lulls its enemies to sleep.", new BaseStats(115, 45, 20, 45, 25, 20)),
            new PokemonDetails(39, 40, "wigglytuff", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/40.png", List.of("normal", "fairy"), 12.0, 1.0, List.of(disarmingVoice, doubleEdge), "The body is soft and rubbery. When angered, it will suck in air and inflate itself to an enormous size.", new BaseStats(140, 70, 45, 85, 50, 45)),
            new PokemonDetails(40, 41, "zubat", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/41.png", List.of("poison", "flying"), 7.5, 0.8, List.of(poisonFang, airCutter), "Forms colonies in perpetually dark places. Uses ultrasonic waves to identify and approach targets.", new BaseStats(40, 45, 35, 30, 40, 55)),
            new PokemonDetails(41, 42, "golbat", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/42.png", List.of("poison", "flying"), 55.0, 1.6, List.of(poisonFang, airSlash), "Once it strikes, it will not stop draining energy from the victim even if it gets too heavy to fly.", new BaseStats(75, 80, 70, 65, 75, 90)),
            new PokemonDetails(42, 43, "oddish", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/43.png", List.of("grass", "poison"), 5.4, 0.5, List.of(acid, megaDrain), "During the day, it keeps its face buried in the ground. At night, it wanders around sowing its seeds.", new BaseStats(45, 50, 55, 75, 65, 30)),
            new PokemonDetails(43, 44, "gloom", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/44.png", List.of("grass", "poison"), 8.6, 0.8, List.of(gigaDrain, venoshock), "The fluid that oozes from its mouth isn’t drool. It is a nectar that is used to attract prey.", new BaseStats(60, 65, 70, 85, 75, 40)),
            new PokemonDetails(44, 45, "vileplume", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/45.png", List.of("grass", "poison"), 18.6, 1.2, List.of(petalDance, sludgeBomb), "The larger its petals, the more toxic pollen it contains. Its big head is heavy and hard to hold up.", new BaseStats(75, 80, 85, 110, 90, 50)),
            new PokemonDetails(45, 46, "paras", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/46.png", List.of("bug", "grass"), 5.4, 0.3, List.of(absorb, furyCutter), "Burrows to suck tree roots. The mushrooms on its back grow by drawing nutrients from the bug host.", new BaseStats(35, 70, 55, 45, 55, 25)),
            new PokemonDetails(46, 47, "parasect", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/47.png", List.of("bug", "grass"), 29.5, 1.0, List.of(furyCutter, gigaDrain), "A host-parasite pair in which the parasite mushroom has taken over the host bug. Prefers damp places.", new BaseStats(60, 95, 80, 60,80, 30)),
            new PokemonDetails(47, 48, "venonat", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/48.png", List.of("bug", "poison"), 30.0, 1.0, List.of(bugBuzz, poisonFang), "Lives in the shadows of tall trees where it eats insects. It is attracted by light at night.", new BaseStats(60, 55, 50, 40, 55, 45)),
            new PokemonDetails(48, 49, "venomoth", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/49.png", List.of("bug", "poison"), 12.5, 1.5, List.of(bugBuzz, poisonFang), "The dust-like scales covering its wings are color coded to indicate the kinds of poison it has.", new BaseStats(70, 65, 60, 90, 75, 90)),
            new PokemonDetails(49, 50, "diglett", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/50.png", List.of("ground"), 0.8, 0.2, List.of(bulldoze, dig), "Lives about one yard underground where it feeds on plant roots. It sometimes appears above ground.", new BaseStats(10, 55, 25, 35, 45, 95)),
            new PokemonDetails(50, 51, "dugtrio", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/51.png", List.of("ground"), 33.3, 0.7, List.of(dig, earthPower), "A team of DIGLETT triplets. It triggers huge earthquakes by burrowing 60 miles underground.", new BaseStats(35, 100, 50, 50, 70, 120)),
            new PokemonDetails(51, 52, "meowth", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/52.png", List.of("normal"), 4.2, 0.4, List.of(scratch, slash), "Adores circular objects. Wanders the streets on a nightly basis to look for dropped loose change.", new BaseStats(40, 45, 35, 40, 40, 90)),
            new PokemonDetails(52, 53, "persian", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/53.png", List.of("normal"), 32.0, 1.0, List.of(scratch, slash), "Although its fur has many admirers, it is tough to raise as a pet because of its fickle meanness.", new BaseStats(65, 70, 60, 65, 65, 115)),
            new PokemonDetails(53, 54, "psyduck", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/54.png", List.of("water"), 19.6 , 0.8, List.of(waterGun, waterPulse), "While lulling its enemies with its vacant look, this wily POKéMON will use psychokinetic powers.", new BaseStats(50, 52, 48, 65, 50, 55)),
            new PokemonDetails(54, 55, "golduck", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/55.png", List.of("water"), 76.6, 1.7, List.of(waterPulse, aquaTail), "Often seen swimming elegantly by lake shores. It is often mistaken for the Japanese monster, Kappa.", new BaseStats(80, 82, 78, 95, 80, 85)),
            new PokemonDetails(55, 56, "mankey", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/56.png", List.of("fighting"), 28.0, 0.5, List.of(brickBreak, crossChop), "Extremely quick to anger. It could be docile one moment then thrashing away the next instant.", new BaseStats(40, 80, 35, 35, 45, 70)),
            new PokemonDetails(56, 57, "primeape", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/57.png", List.of("fighting"), 32.0, 1.0, List.of(crossChop, closeCombat), "Always furious and tenacious to boot. It will not abandon chasing its quarry until it is caught.", new BaseStats(65, 105, 60, 60, 70, 95)),
            new PokemonDetails(57, 58, "growlithe", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/58.png", List.of("fire"), 19.0, 0.7, List.of(ember, flamethrower), "Very protective of its territory. It will bark and bite to repel intruders from its space.", new BaseStats(55, 70, 45, 70, 50, 60)),
            new PokemonDetails(58, 59, "arcanine", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/59.png", List.of("fire"), 155.0, 1.9, List.of(ember, flamethrower), "A POKéMON that has been admired since the past for its beauty. It runs agilely as if on wings.", new BaseStats(90, 110, 80, 100, 80, 95)),
            new PokemonDetails(59, 60, "poliwag", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/60.png", List.of("water"), 12.4, 0.6, List.of(waterGun, bubbleBeam), "Its newly grown legs prevent it from running. It appears to prefer swimming than trying to stand.", new BaseStats(40, 50, 40, 40, 40, 90)),
            new PokemonDetails(60, 61, "poliwhirl", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/61.png", List.of("water"), 20.0, 1.0, List.of(bubbleBeam, hydroPump), "Capable of living in or out of water. When out of water, it sweats to keep its body slimy.", new BaseStats(65, 65, 65, 50, 50, 90)),
            new PokemonDetails(61, 62, "poliwrath", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/62.png", List.of("water", "fighting"), 54.0, 1.3, List.of(hydroPump, dynamicPunch), "An adept swimmer at both the front crawl and breast stroke. Easily overtakes the best human swimmers.", new BaseStats(90, 95, 95, 70, 90, 70)),
            new PokemonDetails(62, 63, "abra", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/63.png", List.of("psychic"), 19.5, 0.9, List.of(teleport, confusion), "Using its ability to read minds, it will identify impending danger and TELEPORT to safety.", new BaseStats(25, 20, 15, 105, 55, 90)),
            new PokemonDetails(63, 64, "kadabra", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/64.png", List.of("psychic"), 56.5, 1.3, List.of(confusion, psybeam), "It emits special alpha waves from its body that induce headaches just by being close by.", new BaseStats(40, 35, 30, 120, 70, 105)),
            new PokemonDetails(64, 65, "alakazam", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/65.png", List.of("psychic"), 48.0, 1.5, List.of(psybeam, psychic), "Its brain can outperform a supercomputer. Its intelligence quotient is said to be 5,000.", new BaseStats(55, 50, 45, 135, 95, 120)),
            new PokemonDetails(65, 66, "machop", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/66.png", List.of("fighting"), 19.5, 0.8, List.of(revenge, dynamicPunch), "Loves to build its muscles. It trains in all styles of martial arts to become even stronger.", new BaseStats(70, 80, 50, 35, 35, 35)),
            new PokemonDetails(66, 67, "machoke", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/67.png", List.of("fighting"), 70.5, 1.5, List.of(revenge, dynamicPunch), "Its muscular body is so powerful, it must wear a power save belt to be able to regulate its motions.", new BaseStats(80, 100, 70, 50, 60, 45)),
            new PokemonDetails(67, 68, "machamp", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/68.png", List.of("fighting"), 130.0, 1.6, List.of(dynamicPunch, crossChop), "Using its heavy muscles, it throws powerful punches that can send the victim clear over the horizon.", new BaseStats(90, 130, 80, 65, 85, 55)),
            new PokemonDetails(68, 69, "bellsprout", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/69.png", List.of("grass", "poison"), 4.0, 0.7, List.of(vineWhip, acid), "A carnivorous POKéMON that traps and eats bugs. It uses its root feet to soak up needed moisture.", new BaseStats(50, 75, 35, 70, 30, 40)),
            new PokemonDetails(69, 70, "weepinbell", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/70.png", List.of("grass", "poison"), 6.4, 1.0, List.of(razorLeaf, poisonJab), "It spits out POISONPOWDER to immobilize the enemy and then finishes it with a spray of ACID.", new BaseStats(65, 90, 50, 85, 45, 55)),
            new PokemonDetails(70, 71, "victreebel", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/71.png", List.of("grass", "poison"), 15.5, 1.7, List.of(powerWhip, poisonJab), "Said to live in huge colonies deep in jungles, although no one has ever returned from there.", new BaseStats(80, 105, 65, 100, 70, 70)),
            new PokemonDetails(71, 72, "tentacool", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/72.png", List.of("water", "poison"), 45.5, 0.9, List.of(poisonSting, waterGun), "Drifts in shallow seas. Anglers who hook them by accident are often punished by its stinging acid.", new BaseStats(40, 40, 35, 50, 100, 70)),
            new PokemonDetails(72, 73, "tentacruel", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/73.png", List.of("water", "poison"), 55.0, 1.6, List.of(acid, bubbleBeam), "The tentacles are normally kept short. On hunts, they are extended to ensnare and immobilize prey.", new BaseStats(80, 70, 65, 80, 120, 100)),
            new PokemonDetails(73, 74, "geodude", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/74.png", List.of("rock", "ground"), 20.0, 0.4, List.of(bulldoze, rockBlast), "Found in fields and mountains. Mistaking them for boulders, people often step or trip on them.", new BaseStats(40, 80, 100, 30, 30, 20)),
            new PokemonDetails(74, 75, "graveler", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/75.png", List.of("rock", "ground"), 105.0, 1.0, List.of(bulldoze, rockThrow), "Rolls down slopes to move. It rolls over any obstacle without slowing or changing its direction.", new BaseStats(55, 95, 115, 45, 45, 35)),
            new PokemonDetails(75, 76, "golem", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/76.png", List.of("rock", "ground"), 300.0, 1.4, List.of(earthquake, stoneEdge), "Its boulder-like body is extremely hard. It can easily withstand dynamite blasts without damage.", new BaseStats(80, 120, 130, 55, 65, 45)),
            new PokemonDetails(76, 77, "ponyta", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/77.png", List.of("fire"), 30.0, 1.0, List.of(ember, flameWheel), "Its hooves are 10 times harder than diamonds. It can trample anything completely flat in little time.", new BaseStats(50, 85, 55, 65, 65, 90)),
            new PokemonDetails(77, 78, "rapidash", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/78.png", List.of("fire"), 95.0, 1.7, List.of(flameWheel, inferno), "Very competitive, this POKéMON will chase anything that moves fast in the hopes of racing it.", new BaseStats(65, 100, 70, 80, 80, 105)),
            new PokemonDetails(78, 79, "slowpoke", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/79.png", List.of("water", "psychic"), 36.0, 1.2, List.of(confusion, waterGun), "Incredibly slow and dopey. It takes 5 seconds for it to feel pain when under attack.", new BaseStats(90, 65, 65, 40, 40, 15)),
            new PokemonDetails(79, 80, "slowbro", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/80.png", List.of("water", "psychic"), 78.5, 1.6, List.of(psychic, waterPulse), "The SHELLDER that is latched onto SLOWPOKE’s tail is said to feed on the host’s left over scraps.", new BaseStats(95, 75, 110, 100, 80, 30)),
            new PokemonDetails(80, 81, "magnemite", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/81.png", List.of("electric", "steel"), 6.0, 0.3, List.of(thunderShock, flashCannon), "Uses anti-gravity to stay suspended. Appears without warning and uses THUNDER WAVE and similar moves.", new BaseStats(25, 35, 70, 95, 55, 45)),
            new PokemonDetails(81, 82, "magneton", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/82.png", List.of("electric", "steel"), 60.0, 1.0, List.of(discharge, flashCannon), "Formed by several MAGNEMITEs linked together. They frequently appear when sunspots flare up.", new BaseStats(50, 60, 95, 120, 70, 70)),
            new PokemonDetails(82, 83, "farfetchd", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/83.png", List.of("normal", "flying"), 15.0, 0.8, List.of(cut, airCutter), "The sprig of green onions it holds is its weapon. It is used much like a metal sword.", new BaseStats(52, 90, 55, 58, 62, 60)),
            new PokemonDetails(83, 84, "doduo", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/84.png", List.of("normal", "flying"), 39.2, 1.4, List.of(peck, quickAttack), "A bird that makes up for its poor flying with its fast foot speed. Leaves giant footprints.", new BaseStats(35, 85, 45, 35, 35, 75)),
            new PokemonDetails(84, 85, "dodrio", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/85.png", List.of("normal", "flying"), 85.2, 1.8, List.of(quickAttack, drillPeck), "Uses its three brains to execute complex plans. While two heads sleep, one head stays awake.", new BaseStats(60, 110, 70, 60, 60, 110)),
            new PokemonDetails(85, 86, "seel", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/86.png", List.of("water"), 90.0, 1.1, List.of(aquaJet, aquaTail), "The protruding horn on its head is very hard. It is used for bashing through thick ice.", new BaseStats(65, 45, 55, 45, 70, 45)),
            new PokemonDetails(86, 87, "dewgong", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/87.png", List.of("water", "ice"), 120.0, 1.7, List.of(auroraBeam, aquaTail), "Stores thermal energy in its body. Swims at a steady 8 knots even in intensely cold waters.", new BaseStats(90, 70, 80, 70, 95, 70)),
            new PokemonDetails(87, 88, "grimer", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/88.png", List.of("poison"), 30.0, 0.9, List.of(sludgeBomb, sludgeWave), "Appears in filthy areas. Thrives by sucking up polluted sludge that is pumped out of factories.", new BaseStats(80, 80, 50, 40, 50, 25)),
            new PokemonDetails(88, 89, "muk", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/89.png", List.of("poison"), 30.0, 1.2, List.of(sludgeWave, gunkShot), "Thickly covered with a filthy, vile sludge. It is so toxic, even its footprints contain poison.", new BaseStats(105, 105, 75, 65, 100, 50)),
            new PokemonDetails(89, 90, "shellder", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/90.png", List.of("water"), 4.0, 0.3, List.of(waterGun, hydroPump), "Its hard shell repels any kind of attack. It is vulnerable only when its shell is open.", new BaseStats(30, 65, 100, 45, 25, 40)),
            new PokemonDetails(90, 91, "cloyster", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/91.png", List.of("water", "ice"), 132.5, 1.5, List.of(hydroPump, iceBeam), "When attacked, it launches its horns in quick volleys. Its innards have never been seen.", new BaseStats(50, 95, 180, 85, 45, 70)),
            new PokemonDetails(91, 92, "gastly", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/92.png", List.of("ghost", "poison"), 0.1, 1.3, List.of(lick, venoshock), "Almost invisible, this gaseous POKéMON cloaks the target and puts it to sleep without notice.", new BaseStats(30, 35, 30, 100, 35, 80)),
            new PokemonDetails(92, 93, "haunter", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/93.png", List.of("ghost", "poison"), 0.1, 1.6, List.of(hex, poisonJab), "Because of its ability to slip through block walls, it is said to be from another dimension.", new BaseStats(45, 50, 45, 115, 55, 95)),
            new PokemonDetails(93, 94, "gengar", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/94.png", List.of("ghost", "poison"), 40.5, 1.5, List.of(shadowBall, gunkShot), "Under a full moon, this POKéMON likes to mimic the shadows of people and laugh at their fright.", new BaseStats(60, 65, 60, 130, 75, 110)),
            new PokemonDetails(94, 95, "onix", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/95.png", List.of("rock", "ground"), 210.0, 8.0, List.of(dig, stoneEdge), "As it grows, the stone portions of its body harden to become similar to a diamond, but colored black.", new BaseStats(35, 45, 160, 30, 45, 70)),
            new PokemonDetails(95, 96, "drowzee", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/96.png", List.of("psychic"), 32.4, 1.0, List.of(confusion, psybeam), "Puts enemies to sleep then eats their dreams. Occasionally gets sick from eating bad dreams.", new BaseStats(60, 48, 45, 43, 90, 42)),
            new PokemonDetails(96, 97, "hypno", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/97.png", List.of("psychic"), 75.6, 1.6, List.of(psybeam, psychic), "When it locks eyes with an enemy, it will use a mix of PSI moves such as HYPNOSIS and CONFUSION.", new BaseStats(85, 73, 70, 73, 115, 67)),
            new PokemonDetails(97, 98, "krabby", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/98.png", List.of("water"), 6.5, 0.4, List.of(waterGun, bubbleBeam), "Its pincers are not only powerful weapons, they are used for balance when walking sideways.", new BaseStats(30, 105, 90, 25, 25, 50)),
            new PokemonDetails(98, 99, "kingler", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/99.png", List.of("water"), 60.0, 1.3, List.of(bubbleBeam, surf), "The large pincer has 10000 hp of crushing power. However, its huge size makes it unwieldy to use.", new BaseStats(55, 130, 115, 50, 50, 75)),
            new PokemonDetails(99, 100, "voltorb", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/100.png", List.of("electric"), 10.4, 0.5, List.of(thunderShock, spark), "Usually found in power plants. Easily mistaken for a POKé BALL, they have zapped many people.", new BaseStats(40, 30, 50, 55, 55, 100)),
            new PokemonDetails(100, 101, "electrode", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/101.png", List.of("electric"), 66.6, 1.2, List.of(spark, chargeBeam), "It stores electric energy under very high pressure. It often explodes with little or no provocation.", new BaseStats(60, 50, 70, 80, 80, 150)),
            new PokemonDetails(101, 102, "exeggcute", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/102.png", List.of("grass", "psychic"), 2.5, 0.4, List.of(absorb, confusion), "Often mistaken for eggs. When disturbed, they quickly gather and attack in swarms.", new BaseStats(60, 40, 80, 60, 45, 40)),
            new PokemonDetails(102, 103, "exeggutor", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/103.png", List.of("grass", "psychic"), 120.0, 2.0, List.of(gigaDrain, psyshock), "Legend has it that on rare occasions, one of its heads will drop off and continue on as an EXEGGCUTE.", new BaseStats(95, 95, 85, 125, 75, 55)),
            new PokemonDetails(103, 104, "cubone", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/104.png", List.of("ground"), 6.5, 0.4, List.of(mudSlap, bonemerang), "Because it never removes its skull helmet, no one has ever seen this POKéMON’s real face.", new BaseStats(50, 50, 95, 40, 50, 35)),
            new PokemonDetails(104, 105, "marowak", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/105.png", List.of("ground"), 45.0, 1.0, List.of(bonemerang, earthquake), "The bone it holds is its key weapon. It throws the bone skillfully like a boomerang to KO targets.", new BaseStats(60, 80, 110, 50, 80, 45)),
            new PokemonDetails(105, 106, "hitmonlee", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/106.png", List.of("fighting"), 49.8, 1.5, List.of(lowSweep, closeCombat), "When in a hurry, its legs lengthen progressively. It runs smoothly with extra long, loping strides.", new BaseStats(50, 120, 53, 35, 110, 87)),
            new PokemonDetails(106, 107, "hitmonchan", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/107.png", List.of("fighting"), 50.2, 1.4, List.of(machPunch, closeCombat), "While apparently doing nothing, it fires punches in lightning fast volleys that are impossible to see.", new BaseStats(50, 105, 79, 35, 110, 76)),
            new PokemonDetails(107, 108, "lickitung", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/108.png", List.of("normal"), 65.5, 1.2, List.of(bodySlam, thrash), "Its tongue can be extended like a chameleon’s. It leaves a tingling sensation when it licks enemies.", new BaseStats(90, 55, 75, 60, 75, 30)),
            new PokemonDetails(108, 109, "koffing", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/109.png", List.of("poison"), 1.0, 0.6, List.of(smog, sludgeBomb), "Because it stores several kinds of toxic gases in its body, it is prone to exploding without warning.", new BaseStats(40, 65, 95, 60, 45, 35)),
            new PokemonDetails(109, 110, "weezing", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/110.png", List.of("poison"), 9.5, 1.2, List.of(venoshock, sludgeBomb), "Where two kinds of poison gases meet, 2 KOFFINGs can fuse into a WEEZING over many years.", new BaseStats(65, 90, 120, 85, 70, 60)),
            new PokemonDetails(110, 111, "rhyhorn", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/111.png", List.of("ground", "rock"), 115.0, 1.0, List.of(bulldoze, stoneEdge), "Its massive bones are 1000 times harder than human bones. It can easily knock a trailer flying.", new BaseStats(80, 85, 95, 30, 30, 25)),
            new PokemonDetails(111, 112, "rhydon", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/112.png", List.of("ground", "rock"), 120.0, 1.9, List.of(earthquake, stoneEdge), "Protected by an armor-like hide, it is capable of living in molten lava of 3,600 degrees.", new BaseStats(105, 130, 120, 45, 45, 40)),
            new PokemonDetails(112, 113, "chansey", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/113.png", List.of("normal"), 34.6, 1.1, List.of(takeDown, doubleEdge), "A rare and elusive POKéMON that is said to bring happiness to those who manage to get it.", new BaseStats(250, 5, 5, 35, 105, 50)),
            new PokemonDetails(113, 114, "tangela", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/114.png", List.of("grass"), 35.0, 1.0, List.of(absorb, vineWhip), "The whole body is swathed with wide vines that are similar to seaweed. Its vines shake as it walks.", new BaseStats(65, 55, 115, 100, 40, 60)),
            new PokemonDetails(114, 115, "kangaskhan", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/115.png", List.of("normal"), 80.0, 2.2, List.of(stomp, lastResort), "The infant rarely ventures out of its mother’s protective pouch until it is 3 years old.", new BaseStats(105, 95, 80, 40, 80, 90)),
            new PokemonDetails(115, 116, "horsea", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/116.png", List.of("water"), 8.0, 0.4, List.of(waterGun, bubbleBeam), "Known to shoot down flying bugs with precision blasts of ink from the surface of the water.", new BaseStats(30, 40, 70, 70, 25, 60)),
            new PokemonDetails(116, 117, "seadra", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/117.png", List.of("water"), 25.0, 1.2, List.of(bubbleBeam, waterPulse), "Capable of swimming backwards by rapidly flapping its wing-like pectoral fins and stout tail.", new BaseStats(55, 65, 95, 95, 45, 85)),
            new PokemonDetails(117, 118, "goldeen", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/118.png", List.of("water"), 15.0, 0.6, List.of(waterPulse, waterfall), "Its tail fin billows like an elegant ballroom dress, giving it the nickname of the Water Queen.", new BaseStats(45, 67, 60, 35, 50, 63)),
            new PokemonDetails(118, 119, "seaking", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/119.png", List.of("water"), 39.0, 1.3, List.of(waterfall, hydroPump), "In the autumn spawning season, they can be seen swimming powerfully up rivers and creeks.", new BaseStats(80, 92, 65, 65, 80, 68)),
            new PokemonDetails(119, 120, "staryu", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/120.png", List.of("water"), 34.5, 0.8, List.of(waterGun, surf), "An enigmatic POKéMON that can effortlessly regenerate any appendage it loses in battle.", new BaseStats(30, 45, 55, 70, 55, 85)),
            new PokemonDetails(120, 121, "starmie", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/121.png", List.of("water", "psychic"), 80.0, 1.1, List.of(surf, psybeam), "Its central core glows with the seven colors of the rainbow. Some people value the core as a gem.", new BaseStats(60, 75, 85, 100, 85, 115)),
            new PokemonDetails(121, 122, "mr-mime", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/122.png", List.of("psychic", "fairy"), 54.5, 1.3, List.of(psybeam, dazzlingGleam), "If interrupted while it is miming, it will slap around the offender with its broad hands.", new BaseStats(40, 45, 65, 100, 120, 90)),
            new PokemonDetails(122, 123, "scyther", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/123.png", List.of("bug", "flying"), 56.0, 1.5, List.of(bugBuzz, airSlash), "With ninja-like agility and speed, it can create the illusion that there is more than one.", new BaseStats(70, 110, 80, 55, 80, 105)),
            new PokemonDetails(123, 124, "jynx", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/124.png", List.of("ice", "psychic"), 40.6, 1.4, List.of(icePunch, psychic), "It seductively wiggles its hips as it walks. It can cause people to dance in unison with it.", new BaseStats(65, 50, 35, 115, 95, 95)),
            new PokemonDetails(124, 125, "electabuzz", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/125.png", List.of("electric"), 30.0, 1.1, List.of(discharge, thunderbolt), "Normally found near power plants, they can wander away and cause major blackouts in cities.", new BaseStats(65, 83, 57, 95, 85, 105)),
            new PokemonDetails(125, 126, "magmar", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/126.png", List.of("fire"), 44.5, 1.3, List.of(flamethrower, fireBlast), "Its body always burns with an orange glow that enables it to hide perfectly among flames.", new BaseStats(65, 95, 57, 100, 85, 93)),
            new PokemonDetails(126, 127, "pinsir", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/127.png", List.of("bug"), 55.0, 1.5, List.of(bugBite, xScissor), "If it fails to crush the victim in its pincers, it will swing it around and toss it hard.", new BaseStats(65, 125, 100, 55, 70, 85)),
            new PokemonDetails(127, 128, "tauros", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/128.png", List.of("normal"), 88.4, 1.4, List.of(tackle, doubleEdge), "When it targets an enemy, it charges furiously while whipping its body with its long tails.", new BaseStats(75, 100, 95, 40, 70, 110)),
            new PokemonDetails(128, 129, "magikarp", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/129.png", List.of("water"), 10.0, 0.9, List.of(splash, tackle), "In the distant past, it was somewhat stronger than the horribly weak descendants that exist today.", new BaseStats(20, 10, 55, 15, 20, 80)),
            new PokemonDetails(129, 130, "gyarados", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/130.png", List.of("water", "flying"), 235.0, 6.5, List.of(hydroPump, hurricane), "Rarely seen in the wild. Huge and vicious, it is capable of destroying entire cities in a rage.", new BaseStats(95, 125, 79, 60, 100, 81)),
            new PokemonDetails(130, 131, "lapras", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/131.png", List.of("water", "ice"), 220.0, 2.5, List.of(waterPulse, iceBeam), "A POKéMON that has been overhunted almost to extinction. It can ferry people across the water.", new BaseStats(130, 85, 80, 85, 95, 60)),
            new PokemonDetails(131, 132, "ditto", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/132.png", List.of("normal"), 4.0, 0.3, List.of(transform), "Capable of copying an enemy’s genetic code to instantly transform itself into a duplicate of the enemy.", new BaseStats(48, 48, 48, 48, 48, 48)),
            new PokemonDetails(132, 133, "eevee", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/133.png", List.of("normal"), 6.5, 0.3, List.of(tackle, takeDown), "Its genetic code is irregular. It may mutate if it is exposed to radiation from element STONEs.", new BaseStats(55, 55, 50, 45, 65, 55)),
            new PokemonDetails(133, 134, "vaporeon", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/134.png", List.of("water"), 29.0, 1.0, List.of(waterPulse, hydroPump), "Lives close to water. Its long tail is ridged with a fin which is often mistaken for a mermaid’s.", new BaseStats(130, 65, 60, 110, 95, 65)),
            new PokemonDetails(134, 135, "jolteon", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/135.png", List.of("electric"), 24.5, 0.8, List.of(thunderShock, discharge), "It accumulates negative ions in the atmosphere to blast out 10000-volt lightning bolts.", new BaseStats(65, 65, 60, 110, 95, 130)),
            new PokemonDetails(135, 136, "flareon", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/136.png", List.of("fire"), 25.0, 0.9, List.of(ember, flamethrower), "When storing thermal energy in its body, its temperature could soar to over 1600 degrees.", new BaseStats(65, 130, 60, 95, 110, 65)),
            new PokemonDetails(136, 137, "porygon", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/137.png", List.of("normal"), 36.5, 0.8, List.of(tackle, doubleEdge), "A POKéMON that consists entirely of programming code. Capable of moving freely in cyberspace.", new BaseStats(65, 60, 70, 85, 75, 40)),
            new PokemonDetails(137, 138, "omanyte", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/138.png", List.of("rock", "water"), 7.5, 0.4, List.of(rollout, waterGun), "Although long extinct, in rare cases, it can be genetically resurrected from fossils.", new BaseStats(35, 40, 100, 90, 55, 35)),
            new PokemonDetails(138, 139, "omastar", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/139.png", List.of("rock", "water"), 35.0, 1.0, List.of(ancientPower, surf), "A prehistoric POKéMON that died out when its heavy shell made it impossible to catch prey.", new BaseStats(70, 60, 125, 115, 70, 55)),
            new PokemonDetails(139, 140, "kabuto", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/140.png", List.of("rock", "water"), 11.5, 0.5, List.of(ancientPower, bubbleBeam), "A POKéMON that was resurrected from a fossil found in what was once the ocean floor eons ago.", new BaseStats(30, 80, 90, 55, 45, 55)),
            new PokemonDetails(140, 141, "kabutops", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/141.png", List.of("rock", "water"), 40.5, 1.3, List.of(stoneEdge, bubbleBeam), "Its sleek shape is perfect for swimming. It slashes prey with its claws and drains the body fluids.", new BaseStats(60, 115, 105, 65, 70, 80)),
            new PokemonDetails(141, 142, "aerodactyl", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/142.png", List.of("rock", "flying"), 59.0, 1.8, List.of(stoneEdge, fly), "A ferocious, prehistoric POKéMON that goes for the enemy’s throat with its serrated saw-like fangs.", new BaseStats(80, 105, 65, 60, 75, 130)),
            new PokemonDetails(142, 143, "snorlax", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/143.png", List.of("normal"), 460.0, 2.1, List.of(lastResort, gigaImpact), "Very lazy. Just eats and sleeps. As its rotund bulk builds, it becomes steadily more slothful.", new BaseStats(160, 110, 65, 65, 110, 30)),
            new PokemonDetails(143, 144, "articuno", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/144.png", List.of("ice", "flying"), 55.4, 1.7, List.of(blizzard, hurricane), "A legendary bird POKéMON that is said to appear to doomed people who are lost in icy mountains.", new BaseStats(90, 85, 100, 95, 125, 85)),
            new PokemonDetails(144, 145, "zapdos", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/145.png", List.of("electric", "flying"), 52.6, 1.6, List.of(thunder, hurricane), "A legendary bird POKéMON that is said to appear from clouds while dropping enormous lightning bolts.", new BaseStats(90, 90, 85, 125, 90, 100)),
            new PokemonDetails(145, 146, "moltres", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/146.png", List.of("fire", "flying"), 60.0, 2.0, List.of(fireBlast, hurricane), "Known as the legendary bird of fire. Every flap of its wings creates a dazzling flash of flames.", new BaseStats(90, 100, 90, 125, 85, 90)),
            new PokemonDetails(146, 147, "dratini", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/147.png", List.of("dragon"), 3.3, 1.8, List.of(dragonTail, dragonRush), "Long considered a mythical POKéMON until recently when a small colony was found living underwater.", new BaseStats(41, 64, 45, 50, 50, 50)),
            new PokemonDetails(147, 148, "dragonair", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/148.png", List.of("dragon"), 16.5, 4.0, List.of(dragonRush, outrage), "A mystical POKéMON that exudes a gentle aura. Has the ability to change climate conditions.", new BaseStats(61, 84, 65, 70, 70, 70)),
            new PokemonDetails(148, 149, "dragonite", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/149.png", List.of("dragon", "flying"), 210.0, 2.2, List.of(outrage, hurricane), "An extremely rarely seen marine POKéMON. Its intelligence is said to match that of humans.", new BaseStats(91, 134, 95, 100, 100, 80)),
            new PokemonDetails(149, 150, "mewtwo", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/150.png", List.of("psychic"), 122.0, 2.0, List.of(psystrike, futureSight), "It was created by a scientist after years of horrific gene splicing and DNA engineering experiments.", new BaseStats(106, 110, 90, 154, 90, 130)),
            new PokemonDetails(150, 151, "mew", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/151.png", List.of("psychic"), 4.0, 0.4, List.of(psyshock, psychic), "So rare that it is still said to be a mirage by many experts. Only a few people have seen it worldwide.", new BaseStats(100, 100, 100, 100, 100, 100))
    );

    public List<Pokemon> findAll() {
        return POKEMONS;
    }

    public PokemonDetails findById(int number) {
        return POKEMONS_DETAILS.get(number-1);
    }
    public int getPokemonMaxStatValue() {
        return 250;
    }
}
