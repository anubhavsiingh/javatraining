import { TestBed,waitForAsync,inject } from '@angular/core/testing';

import { PostService } from './post.service';
/*HttpTestingController service are beneficial in mocking the HTTP requests, and this process can not be
 followed without taking the help of HttpClientTestingModule.*/
import {HttpClientTestingModule, HttpTestingController} from '@angular/common/http/testing';
import { HttpClient } from '@angular/common/http';

describe('PostService', () => {
  let postService: PostService;
  let httpMock: HttpTestingController;

/*Import the HttpClientTestingModule and HttpTestingController and inject inside
 the TestBed method and also set up the Angular service, which we are going to unit test.*/

 /*TestBed is a mock environment to run Angular component tests without the browser.*/
  beforeEach(() => {
    TestBed.configureTestingModule({
        imports: [HttpClientTestingModule],         //Added both Module and Service
        providers:[PostService]
    });
    postService = TestBed.inject(PostService);      //Injecting to the variables
    httpMock = TestBed.inject(HttpTestingController)
  });

  it('should be created', () => {
    expect(postService).toBeTruthy();
  });

  /*Unit test an Angular Service with HttpClient and HttpTestingController*/
  it('should fetch post as an observable',waitForAsync ( inject([HttpTestingController,PostService],
    (httpClient:HttpClient,postService:PostService) => {
      /*We defined the posts data in the postItem array*/
      const postItem = [
        {
          "userId": 1,
          "id": 1,
          "title": "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
          "body": "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"
        },
        {
          "userId": 1,
          "id": 2,
          "title": "qui est esse",
          "body": "est rerum tempore vitae\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\nqui aperiam non debitis possimus qui neque nisi nulla"
        },
        {
          "userId": 1,
          "id": 3,
          "title": "ea molestias quasi exercitationem repellat qui ipsa sit aut",
          "body": "et iusto sed quo iure\nvoluptatem occaecati omnis eligendi aut ad\nvoluptatem doloribus vel accusantium quis pariatur\nmolestiae porro eius odio et labore et velit aut"
        }];

        /*We subscribe to Observable returned from HTTP GET request
         and set up the expectations using the response.*/
        postService.getPost().subscribe((posts:any)=>{
          expect(posts.length).toBe(3);
        });

        /*Mocking the requests using the HttpTestingController*/
        let req = httpMock.expectOne('https://jsonplaceholder.typicode.com/posts');
        expect(req.request.method).toBe('GET');

        req.flush(postItem);
        httpMock.verify();
    
  })));

});
