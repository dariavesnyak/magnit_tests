# Демо-проект по автоматизации тестирования для компании [Magnit Tech](https://magnit.tech/)
<p align="center">  
<img title="Suites cases" src="media/picture/main_page.png" width="850">  
</p>  
____

## *Содержание*

* <a href="#tools">Технологии и инструменты</a>

* <a href="#cases">Примеры автоматизированных тест-кейсов</a>

* <a href="#jenkins">Сборка в Jenkins</a>

* <a href="#console">Запуск из терминала</a>

* <a href="#allure">Allure отчет</a>

* <a href="#allure-testops">Интеграция с Allure TestOps</a>

* <a href="#jira">Интеграция с Jira</a>

* <a href="#telegram">Уведомление в Telegram при помощи бота</a>

* <a href="#video">Примеры видео выполнения тестов на Selenoid</a>

_____

<a id="tools"></a>
## <a name="Технологии и инструменты">**Технологии и инструменты:**</a>
<p align="center">
<img width="6%" title="IntelliJ IDEA" src="media/logo/Intelij_IDEA.svg">
<img width="6%" title="Java" src="media/logo/Java.svg">
<img width="6%" title="Selenide" src="media/logo/Selenide.svg">
<img width="6%" title="Selenoid" src="media/logo/Selenoid.svg">
<img width="6%" title="Allure Report" src="media/logo/Allure_Report.svg">
<img width="5%" title="Allure TestOps" src="media/logo/AllureTestOps.svg">
<img width="6%" title="Gradle" src="media/logo/Gradle.svg">
<img width="6%" title="JUnit5" src="media/logo/JUnit5.svg">
<img width="6%" title="GitHub" src="media/logo/GitHub.svg">
<img width="6%" title="Jenkins" src="media/logo/Jenkins.svg">
<img width="6%" title="Telegram" src="media/logo/Telegram.svg">
<img width="5%" title="Jira" src="media/logo/Jira.svg">
</p>

_____

<a id="cases"></a>
## <a name="Примеры автоматизированных тест-кейсов">**Примеры автоматизированных тест-кейсов:**</a>

Страница "Мероприятия":
- проверка перехода по карточке мероприятия;
- проверка работы фильтра по городам;
- проверка работы фильтра по теме мероприятия;

Страница "Медиа":
- проверка работы переключения вкладок.

Страница "Вакансии":
- Параметризованный тест для проверки работы поиска по вакансиям.

____

<a id="jenkins"></a>
## <a name="Сборка"></a>Сборка в [Jenkins](https://jenkins.autotests.cloud/job/student_vesnyak_qa_guru_38_magnit_tests)</a>

<p align="center">  
<img title="Jenkins" src="media/picture/jenkins.png" width="850">  
</p>    

### **Параметры сборки в Jenkins:**
- task (выбор команды для запуска тестов, можно запускать отдельно по страницами, можно сразу все)
- browser (выбор браузера, по умолчанию chrome)
- browserVersion (выбор версии браузера, по умолчанию 127.0)
- browserSize (выбор размера окна браузера, по умолчанию 1920x1080)

____

<a id="console"></a>
## Команды для запуска из терминала
Локальный запуск:
```bash  
gradle clean test
```

Удаленный запуск через Jenkins:
```bash  
clean test
"-Dbrowser=${browser}"
"-DbrowserVersion=${browserVersion}"
"-DbrowserSize=${browserSize}"
"-DbaseUrl=${baseUrl}"
"-DremoteUrl=${remoteUrl}
```
____

<a id="allure"></a>
## <a name="Allure"></a>Allure [отчет](https://jenkins.autotests.cloud/job/student_vesnyak_qa_guru_38_magnit_tests/6/allure)</a>

### Основная страница отчёте
<p align="center">  
<img title="Main page Allure" src="media/picture/main_allure.png" width="850">  
</p>  

### Тест-кейсы
<p align="center">  
<img title="Suites cases" src="media/picture/suites_allure.png" width="850">  
</p>  

### Графики

<p align="center">  
<img title="Jenkins" src="media/picture/graphs_part1.png" width="850">  
</p>  
<p align="center">  
<img title="Jenkins" src="media/picture/graphs_part2.png" width="850">  
</p>  

____

<a id="allure-testops"></a>
## Интеграция с <a target="_blank" href="https://allure.autotests.cloud/project/5092/dashboards">Allure TestOps</a>

### Allure TestOps Dashboard
<p align="center">  
<img title="TestOps Dashboard" src="media/picture/testops_dashboard.png" width="850">  
</p>  

### Тест-кейсы
<p align="center">  
<img title="TestOps Suites" src="media/picture/testops.png" width="850">  
</p>  

____

<a id="telegram"></a>
##  Уведомление в Telegram при помощи бота

<p align="center">  
<img title="Jenkins" src="media/picture/telegram.png" width="850">  
</p>  

____

<a id="video"></a>
## Примеры видео выполнения тестов на Selenoid

<p align="center">  
<img title="Jenkins" src="media/picture/test_cases_video_1.gif" width="850">  
</p>  

