Создать новую таблицу “молодые животные” в которую попадут все животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью до месяца подсчитать возраст животных в новой таблице

```sql
CREATE TABLE Молодые_животные AS
SELECT *, TIMESTAMPDIFF(MONTH, Дата_рождения, CURDATE()) AS Возраст_в_месяцах
FROM (
    SELECT 'Собаки' AS Тип_животного, Имя, Команды, Дата_рождения FROM Собаки
    UNION ALL
    SELECT 'Кошки' AS Тип_животного, Имя, Команды, Дата_рождения FROM Кошки
    UNION ALL
    SELECT 'Хомяки' AS Тип_животного, Имя, Команды, Дата_рождения FROM Хомяки
    UNION ALL
    SELECT 'Лошади' AS Тип_животного, Имя, Команды, Дата_рождения FROM Лошади
    UNION ALL
    SELECT 'Ослы' AS Тип_животного, Имя, Команды, Дата_рождения FROM Ослы
) AS Животные
WHERE Дата_рождения >= DATE_SUB(CURDATE(), INTERVAL 3 YEAR)
AND Дата_рождения <= DATE_SUB(CURDATE(), INTERVAL 1 YEAR);
```