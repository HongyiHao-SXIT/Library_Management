-- 创建数据库
CREATE DATABASE IF NOT EXISTS library_management;
USE library_management;

-- 创建用户表
CREATE TABLE IF NOT EXISTS user (
    uid INT AUTO_INCREMENT PRIMARY KEY,
    account VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    name VARCHAR(255),
    address VARCHAR(255),
    phoneNumber VARCHAR(20)
);

CREATE TABLE IF NOT EXISTS book (
    id_book VARCHAR AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    author VARCHAR(255) NOT NULL,
    intro VARCHAR(255),
    deposit INT,
    isborrow BOOLEAN DEFAULT false
);
