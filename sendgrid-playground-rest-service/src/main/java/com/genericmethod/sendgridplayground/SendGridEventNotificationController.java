package com.genericmethod.sendgridplayground;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @author cfarrugia
 */

@RestController
public class SendGridEventNotificationController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @ExceptionHandler(Throwable.class)
    public ResponseEntity<String> exception(HttpServletRequest req, Exception e){
        log.info("Error - " + e.getMessage());
        log.info("Content Type - " + req.getContentType());
        return new ResponseEntity<>("NOT OK - "+e.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @RequestMapping(name = "/events", method = RequestMethod.POST, consumes ="application/json")
    public ResponseEntity<String> event(@RequestBody List<SendGridEvent> sendGridEventNotification){
        log.info("Event received");
        log.info(sendGridEventNotification.get(0).toString());
        return new ResponseEntity<>("OK - "+ sendGridEventNotification, HttpStatus.OK);
    }

}
