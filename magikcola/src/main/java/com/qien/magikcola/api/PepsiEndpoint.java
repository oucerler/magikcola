package com.qien.magikcola.api;

	import javax.ws.rs.Consumes;
	import javax.ws.rs.GET;
	import javax.ws.rs.POST;
	import javax.ws.rs.Path;
	import javax.ws.rs.Produces;
	import javax.ws.rs.core.MediaType;
	import javax.ws.rs.core.Response;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Component;

	import com.qien.magikcola.domein.Pepsi;
	import com.qien.magikcola.controller.PepsiService;

	@Path("pepsi")
	@Component
	public class PepsiEndpoint {
		
		@Autowired
		private PepsiService pepsiService;

		@GET
		@Produces(MediaType.APPLICATION_JSON)
		public Response listGroep(){
			Iterable <Pepsi> pepsi = pepsiService.maaktNietUit();
			return Response.ok(pepsi).build();
		}
		
	}