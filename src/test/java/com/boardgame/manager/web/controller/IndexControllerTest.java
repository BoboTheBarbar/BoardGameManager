package com.boardgame.manager.web.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@SpringBootTest
@AutoConfigureMockMvc
class IndexControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void getIndexPage() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/index"))
                .andExpect(status().isOk())
                .andExpect(view().name("index"));
    }

    @Test
    void showResults() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/index").flashAttr("gamename","Exploding Kittens"))
                .andExpect(status().isOk())
                .andExpect(view().name("index"));
    }
}