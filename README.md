# SpringLab
Lab 1
1.	В чому полягає різниця між Spring Framework та Spring Boot?

Spring Framework — це програмний каркас (фреймворк) з відкритим кодом та контейнери з підтримкою інверсії управління для платформи Java.

Авторы Spring решили предоставить разработчикам некоторые утилиты, которые автоматизируют процедуру настройки и ускоряют процесс создания и развертывания Spring-приложений, под общим названием Spring Boot.
Spring Boot — это полезный проект, целью которого является упрощение создания приложений на основе Spring. Он позволяет наиболее простым способом создать web-приложение, требуя от разработчиков минимум усилий по его настройке и написанию кода.
Автоконфигурация — это особенность Spring Boot. При помощи аннотаций он автоматически настраивает специальные конфигурационные классы.

2.	Для чого в структурі проекту потрібен файл pom.xml?

POM (Project Object Model) является базовым модулем Maven. Это специальный XML-файл, который всегда хранится в базовой директории проекта и называется pom. xml. Файл POM содержит информацию о проекте и различных деталях конфигурации, которые используются Maven для создания проекта.

3.	Для чого потрібна анотація @SpringBootApplication? Що буде, якщо її прибрати?

Ми використовуємо анотацію @SpringBootApplication Spring для   нашого основного класу, щоб увімкнути автоматичне налаштування.
Мы используем аннотацию @SpringBootApplication в нашем классе Application или Main, чтобы включить множество функций, например настройку Spring на основе Java, сканирование компонентов и, в частности, для включения Spring Boot. auto-configuration характерная черта.
1.	@Configuration для включения конфигурации на основе Java
2.	@ComponentScan, чтобы включить сканирование компонентов.
3.	@EnableAutoConfiguration, чтобы включить функцию автоматической настройки Spring Boot.

4.	Для чого потрібен інтерфейс CommandLineRunner? 


 . CommandLineRunner — це простий інтерфейс Spring Boot із методом запуску . Spring Boot автоматично викличе метод запуску всіх bean-компонентів, що реалізують цей інтерфейс, після завантаження контексту програми.
Зауважте, що метод run викликається після завантаження контексту програми, але до завершення виконання основного методу.
Більшість консольних програм матимуть лише один клас, який реалізує  CommandLineRunner . Якщо наша програма має кілька класів, які реалізують CommandLineRunner , порядок виконання можна вказати за допомогою анотації Spring @Order .
 
 
5.	Чим інтерфейс CommandLineRunner відрізняється від ApplicationRunner?

CommandLineRunner і ApplicationRunner служать тій же меті. Різниця між CommandLineRunner і ApplicationRunner полягає в тому, що метод run() CommandLineRunner приймає масив String як аргумент, а метод run() ApplicationRunner приймає spring ApplicationArguments як аргумент.

Lab 2-3
1. Для чого потрібен шаблон проектування MVC.
2. 
Шаблон проектирования MVC предполагает разделение данных приложения, 
пользовательского интерфейса и управляющей логики на три отдельных компонента: 
Модель, Представление и Контроллер – таким образом, что модификация каждого 
компонента может осуществляться независимо.

2. В чому полягають переваги використання шаблону проектування Front 
Controller?

В сложных веб-сайтах есть много одинаковых действий, которые надо производить во 
время обработки запросов. Это, например, контроль безопасности, многоязычность и 
настройка интерфейса пользователя. Когда поведение входного контроллера 
разбросано между несколькими объектами, дублируется большое количество кода. 
Помимо прочего возникают сложности смены поведения в реальном времени.
Паттерн Front Controller объединяет всю обработку запросов, пропуская запросы через 
единственный объект-обработчик. Этот объект содержит общую логику поведения, 
которая может быть изменена в реальном времени при помощи декораторов. После 
обработки запроса контроллер обращается к конкретному объекту для отработки 
конкретного поведения
- Пользователь послал определенный запрос.
- Этот запрос будет переадресован на наш фронтконтроллер.
- Он является единой точкой входа, и он один на весь сайт.
Здесь мы проводим общие настройки, например, соединение с 
базой данных.
Так-же запрос пользователя здесь обрабатывает специальный 
компонент, который назовем - роутер.
Роутер определит: какой именно контроллер должен обработать 
запрос. После этого фронтконтроллер передает управление на 
нужный контроллер, например, на NewsController.
- Этот контроллер из запроса получит информацию о том, какие 
новости хочет пользователь,
- далее обратится к модели за нужными данными.
- После получения данных, контроллер использует 
представления для нужной визиулизации этих данных.
- После этих действий будет отправлен ответ пользователю, тоесть нужная ему страница.

3. Поясніть особливості використання шаблону проектування Front Controller при 
реалізації веб-застосунків та RESTful веб-сервісів.

Фронт-контроллер определяется как «контроллер, который обрабатывает все запросы 
к веб-сайту». Он стоит перед веб-приложением и делегирует запросы последующим 
ресурсам. Он также предоставляет интерфейс для общего поведения, такого как 
безопасность, интернационализация и представление конкретных представлений 
определенным пользователям.


4. В чому полягають відмінності методів GET та POST протоколу HTTP?
Основное отличие метода GET от POST в способе передачи данных. Запрос GET 
передает данные в URL в виде пар "имя-значение" (другими словами, через ссылку), а 
запрос POST передает данные в теле запроса

5. Що таке сервлет?

Сервлет — это класс, который умеет получать запросы от клиента и возвращать ему 
ответы. Да, сервлеты в Java — именно те элементы, с помощью которых строится 
клиент-серверная архитектура

6. Якими способами передаються данні HTML-форм з клієнта на сервер? В чому 
полягають їх переваги і недоліки?

Протокол HTTP предоставляет несколько способов выполнить запрос; Данные HTMLформы могут передаваться несколькими различными способами, наиболее 
распространёнными из которых являются метод GET и метод POST
Каждый раз, когда вы отправляете данные на сервер, вы должны учитывать 
безопасность. HTML-формы являются наиболее распространёнными векторами атак на 
серверы(места, где могут происходить атаки). Проблемы вытекают не из самих форм 
HTML, а из-за того, как сервер обрабатывает данные из этих форм.
В зависимости от того, что вы делаете, вы можете столкнуться с некоторыми очень 
известными проблемами безопасности: XSS "Межсайтовый скриптинг" и CSRF 
"Подделка межсайтовых запросов"

7. Чи впливає регістр символів при передачі імен параметрів у HTTP-запитах до сервлетів?

Да

8. Чи впливає регістр символів при передачі значень параметрів у HTTP-запитах до 
сервлетів?

Да

9. В чому полягає різниця між статичними HTML-сторінками та шаблонами сторінок 
Thymeleaf та JSP?

В статической веб-программе клиент использует веб-браузер (IE, FireFox и т. Д.) Для 
подключения к серверу через сеть и использует протокол HTTP для инициирования 
запроса (Request), сообщая серверу, какую страницу мне нужно получить сейчас, все 
Запрос передается на веб-сервер, а затем веб-сервер извлекает контент из файловой 
системы (диска, на котором хранятся все статические страницы) в соответствии с 
потребностями пользователя.
В динамическом WEB программа по-прежнему использует клиент и сервер, и клиент 
по-прежнему использует браузер (IE, FireFox и т. Д.) Для подключения к серверу через 
сеть и использует протокол HTTP для инициирования запроса (Request). Все текущие 
запросы являются Сначала пройдите через WEB-сервер для обработки.

10. В чому полягає різниця між сервлетами та JSP-сторінками?

Сервлет может принимать любые запросы к протоколу и может переопределять метод 
service (). В то время как JSP получает только HTTP-запросы и не может переопределить 
его метод service (). Более того, сервлет - это Java-код. Написание кода для сервлета 
сложнее, чем JSP, так как это HTML в Java.
Метод service()
Данный метод является основным методом, который и содержит саму логику работы 
сервлета. Он вызывается для обработки полученного запроса и передачи ответа HTTP 
клиенту. При получении запроса, сервер создаёт новый поток, который вызывает 
метод service. Данный метод проверяет тип запроса (POST, GET и т.)

11. Як виглядає життєвий цикл JSP-сторінки? Що таке трансляція та компіляція JSPсторінок? 

Жизненный цикл JSP определяется как процесс от его создания до разрушения. Это 
похоже на жизненный цикл сервлета с дополнительным этапом, который требуется 
для компиляции JSP в сервлет.
Когда браузер запрашивает JSP, механизм JSP сначала проверяет, нужно ли ему 
компилировать страницу. Если страница никогда не компилировалась или если JSP 
был изменен с момента последней компиляции, механизм JSP компилирует 
страницу.
Процесс компиляции включает в себя три этапа –
• Разбор JSP.
• Превращение JSP в сервлет.
• Компиляция сервлета.
При трансляции, которая выполняется один раз для каждой страницы JSP, создается 
или локализуется класс типа Servlet, реализующий JSP. Трансляция JSP может 
производиться как отдельно, до ее использования, так и в процессе размещения JSP на 
Web-сервере или сервере приложений.

12. Що таке скриптлети та директивні елементи?

В технологии JavaServer Pages скриптлет представляет собой фрагмент Java-кода, 
встроенный в HTML-подобный код JSP. Скриптлет — это все, что находится внутри 
тегов <% %>.
JSP елементы, которые предоставляют глобальную информацию для фазы трансляции. 
Существует три типа директивных элементов. Это page, include и taglib.

13. В чому полягає різниця між директивою <%@ include%> та елементом 
<jsp:include>?

Директива <%@include file="abc.jsp"%> действует как C "#include", вытягивая текст 
включенного файла и компилируя его, как если бы он были частью файла include. 
Входящий файл может быть любого типа (включая HTML или текст).
< jsp: include page = "abc.jsp" > тег компилирует файл как отдельный JSP и вставляет 
вызов к нему в скомпилированном JSP.

14. Що таке JavaBean? Як їх використовувати у JSP-сторінках?

Объекты JavaBean определяют простую и мощную модель компонентов для Java. Цель 
объектов JavaBean - предоставить отдельные и многоразовые единицы, которыми 
разработчики могут управлять как программно, так и визуально с помощью 
инструментов компоновки.
Java Beans используются для меньшего количества кода и более рабочего подхода... 
Java Beans используются в Java EE как универсальный контракт для обнаружения и 
доступа к среде выполнения. Например, JavaServer Pages (JSP) использует Java Beans 
как объекты передачи данных между страницами или между сервлетами и JSP.

15. В чому полягають переваги/недоліки використання EL та JSTL у порівнянні з такими JSPелементами як вирази (<%=… %>) та скриптлети (<% … %>)?

JSP по умолчанию позволяет встраивать код на java в разметку html. Однако иногда 
использование стандартных способов для ряда операций, например, для вывода на 
страницу элементов из списка и т.д., может быть несколько громоздким. Чтобы 
упростить встраивание кода java в JSP была разработана специальная библиотека - JST
Выражения EL могут быть встроены в страницы jsp, чтобы уменьшить написание 
сценариев jsp. Цель EL - заменить написание сценариев на страницах jsp
EL извлекает данные из домена (самая важная роль EL)
jsp скрипт: <% = request.getAttribute (name)%>
Выражение EL заменяет приведенный выше сценарий: $ {requestScope.name}
Основная функция EL - получение данных в четырех областях, формат${ELвыражение}
EL получает значение в поле pageContext: $ {pageScope.key};
EL получает значение в поле запроса: $ {requestScope.key};
EL получает значение в поле сеанса: $ {sessionScope.key};
EL получает значение в поле приложения: $ {applicationScope.key};
JSTL (стандартная библиотека тегов JSP), стандартная библиотека тегов JSP, может быть 
встроена в страницу JSP для выполнения бизнес-логики и других функций в форме 
тегов. Цель jstl - заменить код скрипта на странице jsp, как и el. Стандартная 
стандартная библиотека тегов JSTL имеет 5 подбиблиотек, но по мере разработки в 
настоящее время часто используется основная библиотека.
Общие теги основной библиотеки JSTL
1) тег <c: if test = ””>
Где тест - это условие для возврата логического значения
2) тег <c: forEach>
items: коллекция или массив var: представляет определенный элемент в коллекции 
(необязательно)
<c:forEach items=”${productList}” var=”pro”>
$ {pro.name} // Возьмите атрибут с именем name в pro
</c:forEach>

16. В чому полягають переваги/недоліки використання JSTL-елемента <c:out> у порівнянні 
зі звичайними EL-виразом ${…} або JSP-елементом <%=… %>?

Между <%...%> вы можете написать любую логику, которую вы хотите в Java.
Использование <%=...%> выведет результат выражения между скобками на экран. 
Поэтому вместо того, чтобы писать, например
<% System.out.println("Привет, мир") %>
вы можете просто написать
<%= "Привет, мир" %>
По сути, <%= %> вызывает метод toString() оцениваемого выражения.
Если вам нужно добавить логику нулевой проверки, как вы сказали, вы можете 
использовать
 <%..%>
 
17. Який час життя атрибутів на рівнях requestScope, sessionScope, applicationScope? Чи 
можуть одночасно існувати атрибути з однаковими іменами на різних рівнях?

Рассмотреть на примере как сохранять объекты в различных областях видимости 
приложения Spring MVC: Request scope, Session Scope. Рассмотреть часто 
встречающуюся задачу — как сохранить объект в сессии приложения Spring MVC.

18. Що таке XSS-атака? Як зробити сайт стійким до таких атак?

XSS (англ. Cross-Site Scripting — «межсайтовый скриптинг») — довольно 
распространенная уязвимость, которую можно обнаружить на множестве вебприложений. Ее суть довольно проста, злоумышленнику удается внедрить на страницу 
JavaScript-код, который не был предусмотрен разработчиками. Этот код будет 
выполняться каждый раз, когда жертвы (обычные пользователи) будут заходить на 
страницу приложения, куда этот код был добавлен. А дальше существует несколько 
сценариев развития.
Основной стратегией предотвращения XSS-атак является очистка пользовательского 
ввода.
В веб-приложении Spring пользовательский ввод представляет собой HTTP-запрос. 
Чтобы предотвратить атаку, мы должны проверить содержимое HTTP-запроса и 
удалить все, что может исполняться на сервере или в браузере.
Для обычного веб-приложения, доступ к которому осуществляется через веб-браузер, 
мы можем использовать встроенные функции Spring Security (Reflected XSS).
Spring Security по умолчанию предоставляет несколько заголовков безопасности. Он 
включает заголовок X-XSS-Protection. X-XSS-Protection говорит браузеру блокировать 
то, что выглядит как XSS. Spring Security может автоматически добавить этот заголовок 
безопасности в ответ. Чтобы активировать это, мы настраиваем поддержку XSS в 
классе конфигурации Spring Security.

19. Поясніть різницю між термінами forward та redirect.

Метод forward() класса RequestDispatcher позволяет перенаправить запрос из сервлета 
на другой сервлет, html-страницу или страницу jsp. Причем в данном случае речь идет 
о перенаправлении запроса, а не о переадресации
Для переадресации применяется метод sendRedirect() объекта HttpServletResponse. В 
качестве параметра данный метод принимает адрес переадресации. Адрес может 
быть локальным, внутренним, а может быть и внешним.


