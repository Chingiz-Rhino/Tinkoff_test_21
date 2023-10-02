<h1 >Проект по автоматизации тестирования сайта <a href="https://www.tinkoff.ru/ "> Tinkoff</a></h1>

<p align="center">  
<img src="imeges/header/Tinkoff_image.png" alt="MainLogo" width="950"/></a>  
</p>

# 🧾 Содержание:

- Технологии и инструменты
- Список проверок, реализованных в автоматизированных тест-кейсах
- Запуск тестов (Сборка в Jenkins)
- Запуск тестов (Из терминала)
- Allure-отчет
- Интеграция с Allure TestOps
- Интеграция с Jira
- Уведомление в Telegram о результатах выполнения автоматизированных тестов
- Видеопример прохождения тестов Selenoid

<a id="tools"></a>
## 🔨 Технологии и инструменты:

| Java                                                                                 | IntelliJ  <br>  Idea                                                                                               | GitHub                                                                                                     | JUnit 5                                                                                                           | Gradle                                                                                                     | Selenide                                                                                                         | Selenoid                                                                                                                  | Allure <br> Report                                                                                                         |  Jenkins                                                                                                        |   Jira                                                                                                              | Telegram                                                                                                            |Allure <br> TestOps                                                                                                          
|:-------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------:|
| <a href="https://www.java.com/"><img src="imeges/logo/java.svg" width="50" height="50"  alt="Java"/></a>  | <a href="https://www.jetbrains.com/idea/"><img src="imeges/logo/intellij.svg" width="50" height="50"  alt="IDEA"/></a> | <a href="https://github.com/"><img src="imeges/logo/github.svg" width="50" height="50"  alt="Github"/></a> | <a href="https://junit.org/junit5/"><img src="imeges/logo/junit5.svg.png" width="50" height="50"  alt="JUnit 5"/></a> | <a href="https://gradle.org/"><img src="imeges/logo/gradle.svg" width="50" height="50"  alt="Gradle"/></a> | <a href="https://selenide.org/"><img src="imeges/logo/selenide.svg.jpg" width="50" height="50"  alt="Selenide"/></a> | <a href="https://aerokube.com/selenoid/"><img src="imeges/logo/seleonoidsvg.png" width="50" height="50"  alt="Selenoid"/></a> | <a href="https://github.com/allure-framework"><img src="imeges/logo/allurereport.svg.png" width="50" height="50"  alt="Allure"/></a> |<a href="https://www.jenkins.io/"><img src="imeges/logo/jenkins.svg" width="50" height="50"  alt="Jenkins"/></a> | <a href="https://www.atlassian.com/software/jira/"><img src="imeges/logo/jira.svg" width="50" height="50" alt="Java" title="Java"/></a> | <a href="https://web.telegram.org/"><img src="imeges/logo/telegram.jpg" width="50" height="50" alt="Telegram"/></a> |<a href="https://qameta.io/"><img src="imeges/logo/alluretestops.svg" width="50" height="50" alt="Allure_TO"/></a> |


## <img alt="Jenkins" height="25" src="imeges/logo/jenkins.svg" width="25"/> Сборка в [Jenkins](https://jenkins.autotests.cloud/job/Tinkoff_test_guru_qa_21/)

<p align="center">  
<img src="imeges/logo/jenkins_page.png" alt="Jenkins" width="950"/></a>  
</p>

<a id="cases"></a>
## 🏁 Реализованные проверки:

- Переход в раздел "Дебетовые карты"
- Переход в раздел "Премиальные дебетовые карты"
- Переход в раздел "Дебетовые карты для путешествий"
- Переход в раздел "Дебетовые карты для автомобилистов"
- Переход в раздел "Дебетовые катры для геймеров"
- Переход в раздел "Дебетовые карты для покупок"


## 📋 Параметры сборки в Jenkins:

- 
- _SELENOID_BASE_URL (URL Selenoid, по умолчанию selenoid.autotests.cloud)_
- _ENVIRONMENT (Стенд проверка, по умолчанию IFT)_
- _BROWSER (Браузер, по умолчанию chrome)_
- _BROWSER_VERSION (Версия браузера, по умолчанию 100.0)_
- _BROWSER_SIZE (Размер окна браузера, по умолчанию 1920x1080)_
- _COMMENT (Имя инженера запустившего сборку, по умолчанию пусто)_

## 🚀 Команда для запуска автотестов из терминала

Удаленный запуск с использованием Jenkins и Selenoid (требуется логин и пароль):
```bash  
gradle clean test -Denv=debit
```

## <img alt="Allure" height="25" src="imeges/logo/allurereport.svg.png" width="25"/> </a>Интеграция с <a target="_blank" href="https://jenkins.autotests.cloud/job/Tinkoff_test_guru_qa_21/15/allure/">Allure Report</a>



## 🖨️ Основная страница отчёта

<p align="center">  
<img title="Allure Overview Dashboard" src="imeges/logo/allure_report.png" width="850">  
</p>  

## 📄 Тестовый прогон

<p align="center">  
<img title="Allure Tests" src="imeges/logo/suites.png" width="850">   
</p>

## 📊 Графики

<p align="center">   
<img title="Allure Graphics1" src="imeges/logo/graphs1.png" width="850">  
<img title="Allure Graphics2" src="imeges/logo/graphs2.png" width="850">  
<img title="Allure Graphics3" src="imeges/logo/graphs3.png" width="850"> 
</p>

____
## <img alt="Allure" height="25" src="imeges/logo/telegram.jpg" width="25"/></a> Уведомление в Telegram при помощи бота
____
<p align="center">  
<img title="Allure Overview Dashboard" src="imeges/logo/telegram_push.png" width="550">  
</p>

----
## <img alt="Selenoid" height="25" src="imeges/logo/seleonoidsvg.png" width="25"/></a> Видеопример выполнения теста на Selenoid
____
<p align="center">
<img title="Selenoid Video" src="imeges/header/selenoid_video.gif" width="550" height="350"  alt="video">   
</p>