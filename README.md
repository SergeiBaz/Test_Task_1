# Test_Task_1
Задача:

Сделать приложение с возможностью авторизации пользователя и вывода списка его платежей после успешной авторизации. 
Сделанный проект надо выгрузить в репозиторий на Github. Оценивается как выполнение указанных требований, так и качество 
проработки отдельных деталей.

Требования к функционалу:
- если логин/пароль неправильные - выводим ошибку
- надо предусмотреть возможность logout'а
- корректный вывод списка платежей при ошибочных данных (пропущенные поля, несоответствие типу)

Требования к коду:
- Kotlin, Retrofit, Coroutines
- простая архитектура и логика

API:

Базовый URL, в заголовках надо передавать app-key и v

POST /login - логин, передаем параметры в json , при корректном запросе в ответ 
приходит токен.

GET /payments - список платежей, для корректного запроса в заголовках передаем ранее полученный токен token='...'
