Создать таблицы с иерархией из диаграммы в БД

```sql
USE Друзья_человека;
```
```sql
CREATE TABLE Животные
(
	Id INT AUTO_INCREMENT PRIMARY KEY, 
	Class_name VARCHAR(20)
);

INSERT INTO Животные (Class_name) VALUES ('Домашние'), ('Вьючные'); 
```
```sql
CREATE TABLE Домашние
(
    Id INT AUTO_INCREMENT PRIMARY KEY,
    Type_name VARCHAR (20),
    FOREIGN KEY (id) REFERENCES Животные(Id)
);

INSERT INTO Домашние (Type_name) VALUES ('Кошки'), ('Собаки'), ('Хомяки');
```
```sql
CREATE TABLE Вьючные
(
	Id INT AUTO_INCREMENT PRIMARY KEY,
    Type_name VARCHAR (20),
    FOREIGN KEY (id) REFERENCES Животные(Id)
);

INSERT INTO Вьючные (Type_name) VALUES ('Лошади'), ('Верблюды'), ('Ослы');
```
```sql
CREATE TABLE Кошки
(       
    Id INT AUTO_INCREMENT PRIMARY KEY, 
    Имя VARCHAR(20), 
    Команды VARCHAR(50),
    Дата_рождения DATE,
    FOREIGN KEY (Type_id) REFERENCES Домашние(id)
);
```
```sql
CREATE TABLE Собаки
(       
    Id INT AUTO_INCREMENT PRIMARY KEY, 
    Имя VARCHAR(20), 
    Команды VARCHAR(50),
    Дата_рождения DATE,
    FOREIGN KEY (Type_id) REFERENCES Домашние(id)
);
```
```sql
CREATE TABLE Хомяки
(       
    Id INT AUTO_INCREMENT PRIMARY KEY, 
    Имя VARCHAR(20), 
    Команды VARCHAR(50),
    Дата_рождения DATE,
    FOREIGN KEY (id) REFERENCES Домашние(id)
);
```
```sql
CREATE TABLE Лошади
(       
    Id INT AUTO_INCREMENT PRIMARY KEY, 
    Имя VARCHAR(20), 
    Команды VARCHAR(50),
    Дата_рождения DATE,
    FOREIGN KEY (id) REFERENCES Вьючные(id)
);
```
```sql
CREATE TABLE Верблюды
(       
    Id INT AUTO_INCREMENT PRIMARY KEY, 
    Имя VARCHAR(20), 
    Команды VARCHAR(50),
    Дата_рождения DATE,
    FOREIGN KEY (id) REFERENCES Вьючные(id)
);
```
```sql
CREATE TABLE Ослы
(       
    Id INT AUTO_INCREMENT PRIMARY KEY, 
    Имя VARCHAR(20), 
    Команды VARCHAR(50),
    Дата_рождения DATE,
    FOREIGN KEY (id) REFERENCES Вьючные(id)
);
```