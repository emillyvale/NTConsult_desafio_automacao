package APIAutomationTests;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;

public class Pokemon {
    //Abilities
    @Test
    public void testAbilities200() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/ability";

        given()
                .when()
                .get("/2")
                .then()
                .statusCode(200)
                .body("effect_entries.short_effect", hasItem("Summons rain that lasts indefinitely upon entering battle."))
                .body("flavor_text_entries.flavor_text", hasItem("Summons rain in battle."));
    }
    @Test
    public void testAbilities404() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/ability";

        given()
                .when()
                .get("/0")
                .then()
                .statusCode(404);
    }
    //Characteristics
    @Test
    public void testCharacteristics200() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/characteristic";

        given()
                .when()
                .get("/3")
                .then()
                .statusCode(200)
                .body("id", equalTo(3))
                .body("highest_stat.name", equalTo("defense"))
                .body("descriptions.description", hasItem("Sturdy body"));
    }
    @Test
    public void testCharacteristics404() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/characteristic";

        given()
                .when()
                .get("/0")
                .then()
                .statusCode(404);
    }
    //Egg Groups
    @Test
    public void testEggGroups200() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/egg-group";

        given()
                .when()
                .get("/4")
                .then()
                .statusCode(200)
                .body("id", equalTo(4))
                .body("name", equalTo("flying"))
                .body("pokemon_species.name", hasItem( "pidgey"));
    }
    @Test
    public void testEggGroups404() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/egg-group";

        given()
                .when()
                .get("/0")
                .then()
                .statusCode(404);
    }
    //Genders
    @Test
    public void testGenders200() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/gender";

        given()
                .when()
                .get("/female")
                .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("pokemon_species_details.pokemon_species.name", hasItem( "charmander"));
    }
    @Test
    public void testGenders404() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/gender";

        given()
                .when()
                .get("/dinossauro")
                .then()
                .statusCode(404);
    }
    //Growth Rates
    @Test
    public void testGrowthRates200() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/growth-rate";

        given()
                .when()
                .get("/1")
                .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("descriptions.description", hasItem( "slow"));
    }
    @Test
    public void testGrowthRates404() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/growth-rate";

        given()
                .when()
                .get("/0")
                .then()
                .statusCode(404);
    }
    //Natures
    @Test
    public void testNatures200() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/nature";

        given()
                .when()
                .get("/2")
                .then()
                .statusCode(200)
                .body("id", equalTo(2))
                .body("increased_stat.name", equalTo( "defense"))
                .body("likes_flavor.name", equalTo( "sour"))
                .body("hates_flavor.name", equalTo( "spicy"));
    }
    @Test
    public void testNatures404() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/nature";

        given()
                .when()
                .get("/0")
                .then()
                .statusCode(404);
    }
    //Pokeathlon Stats
    @Test
    public void testPokeathlonStats200() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/pokeathlon-stat";

        given()
                .when()
                .get("/speed")
                .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("affecting_natures.decrease.nature.name", hasItem( "hardy"));
    }
    @Test
    public void testPokeathlonStats404() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/pokeathlon-stat";

        given()
                .when()
                .get("/0")
                .then()
                .statusCode(404);
    }
    //APIAutomationTests.Pokemon
    @Test
    public void testPokemon200() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/pokemon";

        given()
                .when()
                .get("/pikachu")
                .then()
                .statusCode(200)
                .body("abilities.ability.name", hasItem( "static"));
    }
    @Test
    public void testPokemon404() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/pokemon";

        given()
                .when()
                .get("/emilly")
                .then()
                .statusCode(404);
    }
    //APIAutomationTests.Pokemon Location Areas
    @Test
    public void testLocationAreas200() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/encounter-method";

        given()
                .when()
                .get("/1")
                .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("name", equalTo( "walk"));
    }
    @Test
    public void testLocationAreas404() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/encounter-method";

        given()
                .when()
                .get("/0")
                .then()
                .statusCode(404);
    }
    //APIAutomationTests.Pokemon Colors
    @Test
    public void testPokemonColors200() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/pokemon-color";

        given()
                .when()
                .get("/yellow")
                .then()
                .statusCode(200)
                .body("id", equalTo(10))
                .body("pokemon_species.name", hasItem( "pikachu"));
    }
    @Test
    public void testPokemonColors404() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/pokemon-color";

        given()
                .when()
                .get("/invisible")
                .then()
                .statusCode(404);
    }
    //APIAutomationTests.Pokemon Forms
    @Test
    public void testPokemonForms200() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/pokemon-form";

        given()
                .when()
                .get("/pikachu")
                .then()
                .statusCode(200)
                .body("id", equalTo(25))
                .body("pokemon.name", equalTo( "pikachu"));
    }
    @Test
    public void testPokemonForms404() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/pokemon-form";

        given()
                .when()
                .get("/emilly")
                .then()
                .statusCode(404);
    }
    //APIAutomationTests.Pokemon Habitats
    @Test
    public void testPokemonHabitats200() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/pokemon-habitat";

        given()
                .when()
                .get("/1")
                .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("pokemon_species.name", hasItem("zubat"))
                .body("name", equalTo( "cave"));
    }
    @Test
    public void testPokemonHabitats404() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/pokemon-habitat";

        given()
                .when()
                .get("/0")
                .then()
                .statusCode(404);
    }
    //APIAutomationTests.Pokemon Shapes
    @Test
    public void testPokemonShapes200() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/pokemon-shape";

        given()
                .when()
                .get("/3")
                .then()
                .statusCode(200)
                .body("id", equalTo(3))
                .body("pokemon_species.name", hasItem("seel"))
                .body("name", equalTo( "fish"));
    }
    @Test
    public void testPokemonShapes404() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/pokemon-shape";

        given()
                .when()
                .get("/big")
                .then()
                .statusCode(404);
    }
    //APIAutomationTests.Pokemon Species
    @Test
    public void testPokemonSpecies200() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/pokemon-species";

        given()
                .when()
                .get("/pikachu")
                .then()
                .statusCode(200)
                .body("base_happiness", equalTo(50))
                .body("color.name", equalTo("yellow"))
                .body("capture_rate", equalTo( 190));
    }
    @Test
    public void testPokemonSpecies404() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/pokemon-species";

        given()
                .when()
                .get("/emilly")
                .then()
                .statusCode(404);
    }
    //Stats
    @Test
    public void testStats200() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/pokemon-species";

        given()
                .when()
                .get("/pikachu")
                .then()
                .statusCode(200)
                .body("base_happiness", equalTo(50))
                .body("color.name", equalTo("yellow"))
                .body("capture_rate", equalTo( 190));
    }
    @Test
    public void testStats404() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/stat";

        given()
                .when()
                .get("/emilly")
                .then()
                .statusCode(404);
    }
    //Types
    @Test
    public void testTypes200() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/type";

        given()
                .when()
                .get("/5")
                .then()
                .statusCode(200)
                .body("damage_relations.double_damage_from.name", hasItem("water"))
                .body("pokemon.pokemon.name", hasItem("sandshrew"));
    }
    @Test
    public void testTypes404() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/type";

        given()
                .when()
                .get("/0")
                .then()
                .statusCode(404);
    }
}
