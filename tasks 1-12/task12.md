Объединить все таблицы в одну, при этом сохраняя поля, указывающие на прошлую принадлежность к старым таблицам.

```sql
CREATE TABLE Все_животные AS
SELECT 'Собаки' AS Тип_животного, Имя, Команды, Дата_рождения FROM Собаки
UNION ALL
SELECT 'Кошки' AS Тип_животного, Имя, Команды, Дата_рождения FROM Кошки
UNION ALL
SELECT 'Хомяки' AS Тип_животного, Имя, Команды, Дата_рождения FROM Хомяки
UNION ALL
SELECT 'Лошади' AS Тип_животного, Имя, Команды, Дата_рождения FROM Лошади
UNION ALL
SELECT 'Ослы' AS Тип_животного, Имя, Команды, Дата_рождения FROM Ослы;
```