package com.qubitai.casestudy.youtubedataapimongodb.scheduling;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class ScheduledTasks {


    @Value("${server.port}")
    private String server_port;

    @Value("${server.address}")
    private String server_address;

//    my.search.profile.name

    @Value("${my.search.profile.name}")
    private String profile_name;

    @Value("${my.search.pageToCrawl}")
    private String pageToCrawl;

    @Value("${my.search.uri}")
    private String uri_name;


    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    @Scheduled(cron = "${cron.expression}")
    public void scheduleDynamicTaskWithCronExpression() throws URISyntaxException {
        System.out.println("Cron Dynamic Task: Current Time - {}"+ formatter.format(LocalDateTime.now()));
        RestTemplate restTemplate = new RestTemplate();
        final String baseUrl = "http://"+server_address+":" + server_port + "/"+ uri_name +"/"+ profile_name +"/"+pageToCrawl;
        URI uri = new URI(baseUrl);
        ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
    }
}
