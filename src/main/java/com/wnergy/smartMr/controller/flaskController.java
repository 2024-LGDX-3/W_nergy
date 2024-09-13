package com.wnergy.smartMr.controller;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
public class flaskController {
    @PostMapping("/analyze-image")
    public String analyzeImage(@RequestParam("file") MultipartFile file, Model model) throws IOException {
        System.out.println("flaskcontroller act");


        // Flask API로 요청을 보내기 위한 준비
        String flaskApiUrl = "http://127.0.0.1:5000/analyze";

        // 요청 헤더 설정
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.MULTIPART_FORM_DATA);

        // MultipartFile을 Multipart 전송을 위한 FormData로 변환
        MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();
        body.add("file", new InputStreamResource(file.getInputStream()));

        // 요청 생성
        HttpEntity<MultiValueMap<String, Object>> requestEntity = new HttpEntity<>(body, headers);

        // Flask API로 POST 요청 전송
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.exchange(flaskApiUrl, HttpMethod.POST, requestEntity, String.class);

        // Flask에서 받은 응답을 모델에 추가하여 결과 페이지로 전달
        model.addAttribute("response", response.getBody());

        // 결과 페이지로 이동 (resultPage.html)
        return "resultPage";  // resultPage.html 파일을 렌더링
    }
}

//수분 , 다크서클, 피부타입 ,여드름

