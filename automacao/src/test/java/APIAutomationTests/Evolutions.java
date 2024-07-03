package APIAutomationTests;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
public class Evolutions {
    //Evolution Chains
    @Test
    public void testEvolutionChains200() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/evolution-chain";

        given()
                .when()
                .get("/4")
                .then()
                .statusCode(200)
                .body("chain.is_baby", equalTo(false))
                .body("chain.species.name", equalTo("caterpie"));
    }
    @Test
    public void testEvolutionChains404() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/evolution-chain";

        given()
                .when()
                .get("/0")
                .then()
                .statusCode(404);
    }
    //Evolution Triggers
    @Test
    public void testEvolutionTriggers200() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/evolution-trigger";

        given()
                .when()
                .get("/4")
                .then()
                .statusCode(200)
                .body("id", equalTo(4))
                .body("name", equalTo("shed"));
    }
    @Test
    public void testEvolutionTriggers404() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/evolution-trigger";

        given()
                .when()
                .get("/0")
                .then()
                .statusCode(404);
    }
}
