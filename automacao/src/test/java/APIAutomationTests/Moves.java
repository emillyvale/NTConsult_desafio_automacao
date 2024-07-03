package APIAutomationTests;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;
public class Moves {
    //APIAutomationTests.Moves
    @Test
    public void testMoves200() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/move";

        given()
                .when()
                .get("/1")
                .then()
                .statusCode(200)
                .body("accuracy", equalTo(100))
                .body("id", equalTo(1));
    }
    @Test
    public void testMoves404() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/move";

        given()
                .when()
                .get("/0")
                .then()
                .statusCode(404);
    }
    //Move Ailments
    @Test
    public void testMovesAilments200() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/move-ailment";

        given()
                .when()
                .get("/2")
                .then()
                .statusCode(200)
                .body("id", equalTo(2))
                .body("moves.name", hasItem("sing"));
    }
    @Test
    public void testMovesAilments404() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/move-ailment";

        given()
                .when()
                .get("/00")
                .then()
                .statusCode(404);
    }
    //Move Battle Styles
    @Test
    public void testMoveBattleStyles200() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/move-battle-style";

        given()
                .when()
                .get("/1")
                .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("name", equalTo("attack"));
    }
    @Test
    public void testMoveBattleStyles404() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/move-battle-style";

        given()
                .when()
                .get("/0")
                .then()
                .statusCode(404);
    }
    //Move Categories
    @Test
    public void testMoveCategories200() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/move-category";

        given()
                .when()
                .get("/1")
                .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("name", equalTo("ailment"))
                .body("descriptions.description", hasItem("No damage; inflicts status ailment"));
    }
    @Test
    public void testMoveCategories404() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/move-category";

        given()
                .when()
                .get("/00")
                .then()
                .statusCode(404);
    }
    //Move Damage Classes
    @Test
    public void testMoveDamageClasses200() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/move-damage-class";

        given()
                .when()
                .get("/1")
                .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("name", equalTo("status"))
                .body("moves.name", hasItem("swords-dance"));
    }
    @Test
    public void testMoveDamageClasses404() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/move-damage-class";

        given()
                .when()
                .get("/00")
                .then()
                .statusCode(404);
    }
    //Move Learn Methods
    @Test
    public void testMoveLearnMethods200() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/move-learn-method";

        given()
                .when()
                .get("/1")
                .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("names.name", hasItem("Level up"))
                .body("descriptions.description", hasItem("Wird gelernt, wenn ein Pokémon ein bestimmtes Level erreicht."));
    }
    @Test
    public void testMoveLearnMethods404() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/move-learn-method";

        given()
                .when()
                .get("/00")
                .then()
                .statusCode(404);
    }
    //Move Targets
    @Test
    public void testMoveTargets200() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/move-target";

        given()
                .when()
                .get("/1")
                .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("name", equalTo("specific-move"))
                .body("descriptions.description", hasItem("One specific move.  How this move is chosen depends upon on the move being used."));
    }
    @Test
    public void testMoveTargets404() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/move-target";

        given()
                .when()
                .get("/00")
                .then()
                .statusCode(404);
    }
}
