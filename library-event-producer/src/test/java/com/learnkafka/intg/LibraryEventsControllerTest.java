package com.learnkafka.intg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import com.learnkafka.domain.Book;
import com.learnkafka.domain.LibraryEvent;

//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class LibraryEventsControllerTest {

//	@Autowired
//	private TestRestTemplate testRestTemplate;
//	
//	@Test
//	void postLibraryEvent() {
//		// Given
//		Book book = Book.builder().bookId(1001).bookName("Integration Testing").bookAuthor("Amit Malik").build();
//		LibraryEvent libraryEvent = LibraryEvent.builder().libraryEventId(999).book(book).build();
//		
//		HttpHeaders headers = new HttpHeaders();
//		headers.set("content-type", MediaType.APPLICATION_JSON.toString());
//		HttpEntity<LibraryEvent> requestBody = new HttpEntity<LibraryEvent>(libraryEvent, headers);
//
//		// When
//		ResponseEntity<LibraryEvent> response = testRestTemplate.exchange("/v1/libraryevent", HttpMethod.POST, requestBody, LibraryEvent.class);
//		
//		//Then
//		assertEquals(HttpStatus.CREATED, response.getStatusCode());
//	}

}
