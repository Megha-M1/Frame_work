package generic;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class runnerclass {
	public static void main(String[]args)
	{
	 Response res= given().spec(Spec_builders.req_builder()).when().get("/api/users?page=2").then().spec(Spec_builders.res_builder()).extract().response();
	System.out.println(res.asString());
}
}
