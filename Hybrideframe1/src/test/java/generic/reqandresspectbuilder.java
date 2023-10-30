package generic;

import Test_script.RequestSpecBuilder;
import Test_script.RequestSpecification;
import Test_script.Response;
import Test_script.ResponseSpecBuilder;
import Test_script.ResponseSpecification;

public class reqandresspectbuilder {
public static RequestSpecification req_builder()
{
	RequestSpecBuilder req_bui=new RequestSpecBuilder();
	RequestSpecification res1 = req_bui.setBaseUri("https://reqres.in").setContentType(ContentType.JSON).build();
	ResponseSpecBuilder res_bui=new ResponseSpecBuilder();	
	return req;
}
public static RequestSpecification res_builder()
{
	ResponseSpecification res2 = res_bui.expectContentType(ContentType.JSON).expectStatusCode(200).expectStatusLine("HTTP/1.1 200 OK").build();
	Response res = given().spec(res1).when().get("/api/users?page=2").then().assertThat().statusCode(200).
	and().contentType(ContentType.JSON). spec(res2). extract().response();
	return res;
}

}

