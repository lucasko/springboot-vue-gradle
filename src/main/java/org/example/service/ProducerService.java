package org.example.service;

import org.springframework.stereotype.Service;

/**
 * Created by jt on 1/10/17.
 */
@Service
public class ProducerService {

//    private static final Logger log = LoggerFactory.getLogger(ProducerService.class);
//
//    private final RabbitTemplate rabbitTemplate;
//
//    @Autowired
//    public ProducerService( RabbitTemplate rabbitTemplate) {
//
//        this.rabbitTemplate = rabbitTemplate;
//    }
//
//    public void sendProductMessage(String id) {
//        Map<String, String> actionmap = new HashMap<>();
//        actionmap.put("id", id);
//        log.info("Sending the index request through queue message");
//        rabbitTemplate.convertAndSend(SpringBootApplication.SFG_MESSAGE_QUEUE, actionmap);
//    }
}
