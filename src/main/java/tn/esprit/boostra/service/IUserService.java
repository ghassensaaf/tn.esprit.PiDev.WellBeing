package tn.esprit.boostra.service;

import java.util.List;

import tn.esprit.boostra.entity.Event;
import tn.esprit.boostra.entity.User;

public interface IUserService {
 User saveUser(User U);
 User findUserByUserName(String uName);
 int joinEvent(String uname, long eventId);
 boolean unjoinEvent(String uname, long eventId);
 int joinActivity(String uname, long activityId);
 boolean unjoinActivity(String uname, long activityId);
 List<Event> suggestEvent(String uname);
}
