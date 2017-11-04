package io.swagger.api;

import io.swagger.model.History;
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

@Api(value = "history", description = "the history API")
public interface HistoryApi {

    @ApiOperation(value = "adds a watched program", notes = "Adds a program to the history", response = Void.class, tags = {"admins", "developers", "users",})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "program added", response = Void.class),
            @ApiResponse(code = 400, message = "invalid input, object invalid", response = Void.class)})
    @RequestMapping(value = "/history/{user}",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.POST)
    ResponseEntity<Void> addProgram(@ApiParam(value = "Program to add") @RequestBody Program program);

    @ApiOperation(value = "get program", notes = "By passing in the program id, you can get a program", response = Program.class, responseContainer = "List", tags = {"developers", "guests", "users"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "program matching criteria", response = Program.class),
            @ApiResponse(code = 400, message = "bad input parameter", response = Program.class)})
    @RequestMapping(value = "/program/{id}",
            produces = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<List<Program>> searchProgram(@ApiParam(value = "pass an id for looking up program", required = true) @PathVariable("id") String id);

    @ApiOperation(value = "history from all users", notes = "You can obtain all programs watched ", response = History.class, responseContainer = "List", tags = {"developers", "admins", "users",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "history results matching criteria", response = History.class),
            @ApiResponse(code = 400, message = "bad input parameter", response = History.class)})
    @RequestMapping(value = "/history/{user}",
            produces = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<List<History>> getHistory(@ApiParam(value = "pass an optional user id for looking up user history", required = true) @PathVariable("user") String user,
                                             @ApiParam(value = "pass an optional genre id for looking up user history by genre") @RequestParam(value = "genre", required = false) String genre);


    @ApiOperation(value = "adds a watched program", notes = "Update status as deleted to user history", response = Void.class, tags = {"admins", "developers", "users",})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "program updated", response = Void.class),
            @ApiResponse(code = 400, message = "invalid input, object invalid", response = Void.class)})
    @RequestMapping(value = "/history/{user}/{program}",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.PUT)
    ResponseEntity<Void> updateProgram(@ApiParam(value = "pass an optional user id for looking up user history", required = true) @PathVariable("user") String user,
                                       @ApiParam(value = "Program to update", required = true) @PathVariable("program") String program);

}
