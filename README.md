# REST_Proxy

Представлена учебно-боевая задача по разработке внутрибанковских микросервисов. При выполнении задачи студент учится разработке микросеовисов популянрых архитектур, и обращению из одного микросервиса в другой не взирая на архитектуру.

                                                 Project ctructure
                                                 
                                                 *****************
                                                 *    Browser    *
                                                 *****************
                                                         |
                                                 *****************
                                                 *   REST-Proxy  *
                                                 *****************
                                                         |
                               ---------------------------------------------------------
                               |                         |                             |
                       *****************         *****************             *****************
                       *   insurance   *         * personal data *             *      tax      *
                       *     SOAP      *         *      REST     *             *      gRPC     *
                       *****************         *****************             *****************
                               |                                                       |
                               |                 *****************                     |
                               |_________________*      cars     *_____________________|
                               |                 *      SOAP     *                     |
                               |                 *****************                     |
                               |                                                       |
                               |                 *****************                     |
                               |_________________*   buildings   *_____________________|
                               |                 *      REST     *                     |
                               |                 *****************                     |
                               |                                                       |
                               |                 *****************                     |
                               |_________________*     salary    *_____________________|
                                                 *      gRPC     *
                                                 *****************
                                                
Проект имитирует микросервисы внутренних систем банка и ситуацию, когда сотруднику банка для принятия решения необходима полная информация о клиенте. Информацию необходимо получить в браузере. 
Назначение микросервисов:
REST-Proxy    - для получения запроса из браузера, формирования запросов к внутренним микросервисам банка, получения данных, формирование ответа и передачи его в браузер.
personal data - выдает персональные данные клиента по некоему id. Это REST-сервис.
insurance     - запрашивает данные по машинам, недвижимости и доходам клиента в соответствующих сервисах на основании персональных данных, полученных из personal data сервиса, и                 высчитывает сумму страховки. Это SOAP сервис.
tax           - запрашивает данные по машинам, недвижимости и доходам клиента в соответствующих сервисах на основании персональных данных, полученных из personal data сервиса, и                 высчитывает сумму налога. Это gRPC сервис.
cars          - сервис выдает данные об автомобилях клиента. Это SOAP сервис.
buildings     - сервис выдает данные о недвижимости клиента. Это REST сервис.
salary        - сервис выдает данные о доходах клиента. Это gRPC сервис.
