package generic;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import static io.restassured.RestAssured.given;
public class Spec_builders {
	public static RequestSpecification req_builder()
	{
	RequestSpecBuilder req_bui=new RequestSpecBuilder();
	RequestSpecification req=req_bui.setBaseUri("https://reqres.in/").setContentType(ContentType.JSON).build();
	return req;
	}
	public static ResponseSpecification res_builder() 
	{
		ResponseSpecBuilder res_bui=new ResponseSpecBuilder();
		ResponseSpecification res=res_bui.expectContentType(ContentType.JSON).expectStatusCode(200).expectStatusLine("HTTP/1.1 200 ok")
				.build();
		return res;
		
		
	}	
		
		
	}
	
	
	

}
