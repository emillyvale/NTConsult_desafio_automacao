package APIAutomationTests;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;
public class Games {
    //Generations
    @Test
    public void testGenerations200() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/generation";

        given()
                .when()
                .get("/1")
                .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("main_region.name", equalTo("kanto"))
                .body("moves.name", hasItem("karate-chop"));
    }
    @Test
    public void testGenerations404() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/generation";

        given()
                .when()
                .get("/0")
                .then()
                .statusCode(404);
    }

    //Pokedexes
    @Test
    public void testPokedexes200() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/pokedex";

        given()
                .when()
                .get("/1")
                .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("is_main_series", equalTo(true))
                .body("descriptions.description", hasItem("Entire National dex"));
    }
    @Test
    public void testPokedexes404() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/pokedex";

        given()
                .when()
                .get("/00")
                .then()
                .statusCode(404);
    }

    //Version
    @Test
    public void testVersion200() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/version";

        given()
                .when()
                .get("/1")
                .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("version_group.name", equalTo("red-blue"))
                .body("name", equalTo("red"));
    }
    @Test
    public void testVersion404() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/version";

        given()
                .when()
                .get("/0")
                .then()
                .statusCode(404);
    }

    //Version Groups
    @Test
    public void testVersionGroups200() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/version-group";

        given()
                .when()
                .get("/1")
                .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("generation.name", equalTo("generation-i"))
                .body("move_learn_methods.name", hasItem("level-up"));
    }
    @Test
    public void testVersionGroups404() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/version-group";

        given()
                .when()
                .get("/0")
                .then()
                .statusCode(404);
    }
}
