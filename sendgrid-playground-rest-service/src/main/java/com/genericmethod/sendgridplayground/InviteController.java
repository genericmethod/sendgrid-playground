package com.genericmethod.sendgridplayground;

import com.sendgrid.SendGrid;
import com.sendgrid.SendGridException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author cfarrugia
 */
@RestController
public class InviteController {

    @RequestMapping("/invite/{username}")
    public String invite(@PathVariable(value = "username") String username){

        AtomicInteger count = new AtomicInteger();

        SendGrid sendgrid = new SendGrid("app42067956@heroku.com", "5sjhit2l7548");

        SendGrid.Email invite = new SendGrid.Email();
        invite.addTo(username+"@gmail.com");
        invite.setFrom("cfarrugia@gmail.com");
        invite.setSubject("It's your turn!");
        invite.setText("Here's your invite mate! You are in position #" + count.incrementAndGet());

        SendGrid.Response response = null;
        try {
            response = sendgrid.send(invite);
        }
        catch (SendGridException e) {
            System.out.println(e);
        }

        return response.getMessage();
    }

}
