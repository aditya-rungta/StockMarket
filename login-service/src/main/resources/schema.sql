CREATE TABLE user_details (
  userId VARCHAR(255)  PRIMARY KEY,
  userName VARCHAR(255),
  password VARCHAR(250),
  userType VARCHAR(250) NOT NULL,
  email VARCHAR(250) NOT NULL,
  mobileNumber VARCHAR(250) NOT NULL,
  confirmed VARCHAR(250) NOT NULL
);