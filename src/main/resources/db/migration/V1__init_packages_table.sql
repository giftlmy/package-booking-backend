CREATE TABLE packages (
  numid VARCHAR(64) PRIMARY KEY,
  username VARCHAR(64) NOT NULL,
  tel  VARCHAR(64) NOT NULL,
  state VARCHAR(64) NOT NULL,
  time  VARCHAR(64) default null,
  weight VARCHAR(64) default null
);
