package io.swagger.api;

import io.swagger.model.History;
import io.swagger.model.Program;

import io.swagger.annotations.*;

import io.swagger.model.Utils;
import org.springframework.hateoas.Link;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-11-04T15:34:22.218Z")

@Controller
public class HistoryApiController implements HistoryApi {

    public ResponseEntity<Void> addProgram(@ApiParam(value = "Program to add") @RequestBody Program program) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
    public ResponseEntity<List<Program>> searchProgram(@ApiParam(value = "pass an optional program id for looking up programt", required = true) @PathVariable("id") String id) {
        List<Program> programList = new ArrayList<>();
        Utils utils = new Utils();
        programList.add(utils.getProgram());
        return new ResponseEntity<List<Program>>(programList, HttpStatus.OK);
    }


    public ResponseEntity<List<History>> getHistory(@ApiParam(value = "pass an optional user id for looking up user history", required = true) @PathVariable("user") String user,
                                                    @ApiParam(value = "pass an optional genre id for looking up user history by genre") @RequestParam(value = "genre", required = false) String genre) {
        // do some magic!
        Utils util = new Utils();
        List<History> historyList = util.getHistory();

        for (int i = 0; i < historyList.size(); i++) {
            Link selfLink = linkTo(methodOn(MostviewedApiController.class).mostviewedGenreGet(historyList.get(i).getIdHistory())).withSelfRel();
            historyList.get(i).add(selfLink);
            if (!historyList.get(i).getUsername().equals(user)) {
                historyList.remove(historyList.get(i));
                i = i - 1;
            }

        }
        for (History h: historyList) {
            Link selfLinkProgram = linkTo(methodOn(HistoryApiController.class).searchProgram(h.getProgram().getIdProgram())).withSelfRel();
            h.getProgram().add(selfLinkProgram);
        }
        return new ResponseEntity<List<History>>(historyList, HttpStatus.OK);
    }

    public ResponseEntity<Void> updateProgram(@ApiParam(value = "pass an optional user id for looking up user history", required = true) @PathVariable("user") String user,
                                              @ApiParam(value = "Program to update", required = true) @PathVariable("program") String program) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
