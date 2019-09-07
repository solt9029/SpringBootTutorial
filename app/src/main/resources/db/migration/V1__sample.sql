CREATE TABLE post (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  title varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE comment (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  content varchar(255) DEFAULT NULL,
  post_id bigint(20) DEFAULT NULL,
  PRIMARY KEY (id),
  CONSTRAINT fk_post_id
    FOREIGN KEY (post_id)
    REFERENCES post (id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
