CREATE TABLE IF NOT EXISTS user (
  no int NOT NULL AUTO_INCREMENT PRIMARY KEY ,
  name VARCHAR(256) UNIQUE NOT NULL ,
  password VARCHAR(256) NOT NULL
);

-- INSERT INTO user (name, password) VALUES ("foo", "fcde2b2edba56bf408601fb721fe9b5c338d10ee429ea04fae5511b68fbf8fb9");


CREATE TABLE IF NOT EXISTS oauth_access_token (
  token_id VARCHAR(256),
  token BLOB,
  member_no VARCHAR(256),
  refresh_token VARCHAR(256)
);
