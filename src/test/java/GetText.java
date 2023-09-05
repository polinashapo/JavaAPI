import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class GetText {

    @Test
    public void testGetText(){
        Response responce = RestAssured
                .get("https://playground.learnqa.ru/api/get_text")
                .andReturn();
        responce.prettyPrint();
    }
}
