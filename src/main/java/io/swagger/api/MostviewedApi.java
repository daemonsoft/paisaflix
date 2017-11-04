package io.swagger.api;

import io.swagger.model.Program;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-11-04T15:34:22.218Z")

@Api(value = "mostviewed", description = "the mostviewed API")
public interface MostviewedApi {

    @ApiOperation(value = "popular programs by genre", notes = "Get most popular programs by genre", response = Program.class, responseContainer = "List", tags={ "admins","developers","users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "history results matching genre", response = Program.class),
        @ApiResponse(code = 400, message = "bad input parameter", response = Program.class) })
    @RequestMapping(value = "/mostviewed/{genre}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Program>> mostviewedGenreGet(@ApiParam(value = "pass an genre id for looking up popular programs",required=true ) @PathVariable("genre") String genre);

}
