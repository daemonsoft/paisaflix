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

import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-11-04T15:34:22.218Z")

@Controller
public class MostviewedApiController implements MostviewedApi {

    public ResponseEntity<List<Program>> mostviewedGenreGet(@ApiParam(value = "pass an genre id for looking up popular programs",required=true ) @PathVariable("genre") String genre) {
        // do some magic!
        Utils util = new Utils();
        List<Program> programList = util.getPrograms();
        for (Program program : programList) {
            Link selfLink = linkTo(methodOn(MostviewedApiController.class).mostviewedGenreGet(program.getIdProgram())).withSelfRel();
            program.add(selfLink);
        }

        return new ResponseEntity<List<Program>>(programList, HttpStatus.OK);
    }

}
