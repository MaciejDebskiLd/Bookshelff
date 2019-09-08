package com.example.bookshelff;

import io.restassured.RestAssured;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class BookshelfAppTest {

    private static final String BOOK_1 = "{\"title\":\"Java. Kompendium programisty\",\"author\":\"Herbert Shildt\","+
            "\"pagesSum\":1152,\"yearOfPublished\":2019,\"publishingHouse\"\"Helion\"}";

    private static final String BOOK_2 = "{\"title\":\"Python. Wprowadzenie.\",\"author\":\"Mark Lutz\","+
            "\"pagesSum\":1184,\"yearOfPublished\":2017,\"publishingHouse\"\"Helion\"}";

    private static final int APP_PORT = 8090;

    private BookshelfApp bookshelfApp;

    @BeforeAll
    public static void beforeAll(){
        RestAssured.port = APP_PORT;
    }

    @BeforeEach
    public void beforeEach() throws Exception{
        bookshelfApp = new BookshelfApp(APP_PORT);
    }

    @AfterEach
    public void afterEach(){
        bookshelfApp.stop();
    }

}
