import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import { User } from './user.model';
import { Observable } from 'rxjs';
import 'rxjs/add/operator/map'

@Injectable()
export class UserService {

  constructor(private http: Http) {
  }

  findAllUsers(): Observable<Array<User>> {
    return this.http.get('/api/users')
      .map((response: Response) => response.json())
      .map((data: Array<User>) => {
        return data;
      });
  }
}
