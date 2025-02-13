package capetown.festival.eventmanagementsystem.communications;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class EmailService {
    private final JavaMailSender javaMailSender;

    public ResponseEntity<String> sendEmailUponSignUp(String email) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("masolakabelo@gmail.com");
        simpleMailMessage.setSubject("User Registration");
        simpleMailMessage.setText("Welcome");

        javaMailSender.send(simpleMailMessage);
        return ResponseEntity.ok("Email sent");
    }
}
