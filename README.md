# ShareYourWorkout
A simple application that lets users create workouts and share with others.

## Table of Contents
1.[Overview](#Overview)  
2.[Product Spec](#Product-Spec)  
3.[Wireframes](#Wireframes)  
4.[Schema](#Schema)

## Overview
### Description
This app allows users to create and account and then login. Logged in user can create a workout and share it with others.

### App Evaluation
- **Category:** Fitness
- **Mobile:** This app will primarily be used from mobile device in android os.
- **Story:** Users can create workouts and other users can view and follow the workouts.
- **Market:** Any one can use this app after creating an account.
- **Habit:** People who like to discover new workouts can find this app useful.
- **Scope:** This app is mostly targeted towards people who like to workout and try different workouts.

## Product Spec

### 1. User Stories
**Required Stories**
 [x] User can register for an account.
 [x] User can login.
 [x] User can create a new workout.
 [x] User can add a workout to their profile and view all the added workouts.
 [x] Users can view workouts created by all other users.

**Optional Nice-to-have Stories**
 * User can comment on the workout.
 * User can Like or Dislike a workout.
 
### 2. Screen Archetypes
* Login
  * User can login
* Register
  * User can register for an account
* Stream
  * Users can view workouts created by all other users  
* Create
  * User can create a new workout
* Profile
  * User can add a workout to their profile and view all the added workouts  

### 3. Navigation
**Tab Navigation** (Tab to Screen)
* Home
  - Displays all the workouts.
* Create
  - Allows user to create a workout.
* Profile
 -Allows the user to create a profile

**Flow Navigation** (Screen to screen)
* Login/Register Screen
   * Once  user login/Rgister shall navigate to Home screen
* Home Screen
   * User shall view the bottom navigation of home, create, profile
* Create Screen
   * User shall create the workout description with the image
 * Profile Screen
   * User shall create the profile or view profile with

## Wireframes
[Add picture of your hand sketched wireframs in this section]
[insert image here]
![image](https://user-images.githubusercontent.com/66568997/139555078-25321394-f81c-402c-81f9-6d475c523f12.png)




### [Bonus] Digital Wireframes & Mockups

### [Bonus] Interactive prototype

## Schema
[This section will be completed in unit 9]
### Models
####Post 
 | Property      | Type     | Description |
   | ------------- | -------- | ------------|
   | objectId      | String   | unique id for the user post (default field) |
   | author        | Pointer to User| image author |
   | image         | File     | image that user posts |
   | caption       | String   | image caption by author |
   | comments | Array of Comments  | comments that have been posted to an image |
   | likesCount    | Number   | number of likes for the post |
   | createdAt     | DateTime | date when post is created (default field) |
   | updatedAt     | DateTime | date when post is last updated (default field) |

####User
 | Property      | Type     | Description |
   | ------------- | -------- | ------------|
   | objectId      | String   | unique id for the user post (default field) |
   | username       | String  | unique username to each user |
   | password        | String     |  unique password to each user |
   | createdAt     | DateTime | date when post is created (default field) |
   | updatedAt     | DateTime | date when post is last updated (default field) |
	
####Workout
  | Property      | Type     | Description |
   | ------------- | -------- | ------------|
   | objectId      | String   | unique id for the user post (default field) |
   | Title       | String  | title written by author |
   | Image        | File     |  image that user posts |
   | description       | String     |  brief desciption about workout written by user |
   | createdAt     | DateTime | date when post is created (default field) |
   | updatedAt     | DateTime | date when post is last updated (default field) |

####Profile
 | Property      | Type     | Description |
   | ------------- | -------- | ------------|
   | objectId      | String   | unique id for the user post (default field) |
   | userId	   | Pointer | user id |
   | Image        | File     |  image of user profile |
   | Duration       | String     |  users timeperiod since started |
   | Experience     | String     |  user experience |
   | Gender       | String     |  user gender |
   | createdAt     | DateTime | date when post is created (default field) |
   | updatedAt     | DateTime | date when post is last updated (default field) |


### Networking 
-Home Feed screen  
 -(Read/GET) Query all posts of the user  
  -let query = PFQuery(className:"Post")  
    query.whereKey("author", equalTo: currentUser)  
    query.findObjectsInBackground { (posts: [PFObject]?, error: Error?) in  
     if let error = error {   
       print(error.localizedDescription)  
      } else if let posts = posts {  
         print("Successfully retrieved \(posts.count) posts.")  
	 // TODO: Do something with posts...  
	  }  
	}

-[Create Post Screen] 
 - (Create/POST) Create a new Workout post object

-[Profile Screen]
 -(Read/GET) Query logged in user object
 -(Update/OUT) Updates on the field like profile image and so on

- [Create basic snippets for ech parse network request]
- [Optional; List endpoints if using existing api such as yelp]
