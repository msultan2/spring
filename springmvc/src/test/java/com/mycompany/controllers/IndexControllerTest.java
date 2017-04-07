package com.mycompany.controllers;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * Created by mohamedsultan on 06/04/2017.
 */
public class IndexControllerTest {

    private MockMvc mockMvc;

//    @InjectMocks
    private IndexController indexController;

    @Before
    public void init()
    {
        indexController = new IndexController();
        this.mockMvc = MockMvcBuilders.standaloneSetup(indexController)
                .build();
    }

    @Test
    public void testIndex() throws Exception {
        this.mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("index"));
    }
}