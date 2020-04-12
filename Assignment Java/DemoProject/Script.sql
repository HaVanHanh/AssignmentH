--<ScriptOptions statementTerminator=";"/>

CREATE TABLE question_category (
	id SMALLINT UNSIGNED NOT NULL,
	name VARCHAR(50) NOT NULL,
	Testing_Category_ID SMALLINT UNSIGNED NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE user_group (
	group_id SMALLINT UNSIGNED NOT NULL,
	user_id SMALLINT UNSIGNED NOT NULL,
	join_time DATETIME DEFAULT 'CURRENT_TIMESTAMP' NOT NULL,
	PRIMARY KEY (group_id,user_id)
);

CREATE TABLE group (
	id SMALLINT UNSIGNED NOT NULL,
	name VARCHAR(50) NOT NULL,
	author_ID SMALLINT UNSIGNED NOT NULL,
	create_time DATETIME DEFAULT 'CURRENT_TIMESTAMP' NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE user (
	id SMALLINT UNSIGNED NOT NULL,
	account CHAR(50) NOT NULL,
	password VARCHAR(50) NOT NULL,
	firstName VARCHAR(50) NOT NULL,
	lastName VARCHAR(50) NOT NULL,
	email CHAR(50) NOT NULL,
	date_Of_Birth DATE NOT NULL,
	address CHAR(100) NOT NULL,
	phone CHAR(15) NOT NULL,
	gender ENUM NOT NULL,
	role ENUM NOT NULL,
	status BIT DEFAULT b'0',
	department_ID SMALLINT UNSIGNED,
	PRIMARY KEY (id)
);

CREATE TABLE question (
	id INTEGER UNSIGNED NOT NULL,
	title TEXT NOT NULL,
	Question_Category_ID SMALLINT UNSIGNED NOT NULL,
	author_ID SMALLINT UNSIGNED NOT NULL,
	status BIT DEFAULT b'0',
	level_ID TINYINT UNSIGNED NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE level_question (
	id TINYINT UNSIGNED NOT NULL,
	level CHAR(20) NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE testing_category (
	id SMALLINT UNSIGNED NOT NULL,
	name VARCHAR(50) NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE answer (
	id SMALLINT UNSIGNED NOT NULL,
	question_ID INTEGER UNSIGNED NOT NULL,
	key TEXT NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE department (
	id SMALLINT UNSIGNED NOT NULL,
	name VARCHAR(50) NOT NULL,
	PRIMARY KEY (id)
);

CREATE INDEX Question_Category_ID ON question (Question_Category_ID ASC);

CREATE INDEX author_ID ON question (author_ID ASC);

CREATE INDEX Testing_Category_ID ON question_category (Testing_Category_ID ASC);

CREATE INDEX department_ID ON user (department_ID ASC);

CREATE INDEX level_ID ON question (level_ID ASC);

CREATE UNIQUE INDEX account ON user (account ASC);

CREATE UNIQUE INDEX phone ON user (phone ASC);

CREATE INDEX user_id ON user_group (user_id ASC);

CREATE UNIQUE INDEX name ON department (name ASC);

CREATE UNIQUE INDEX name ON testing_category (name ASC);

CREATE INDEX question_ID ON answer (question_ID ASC);

CREATE UNIQUE INDEX email ON user (email ASC);

CREATE INDEX author_ID ON group (author_ID ASC);

CREATE UNIQUE INDEX name ON group (name ASC);

CREATE UNIQUE INDEX name ON question_category (name ASC);

