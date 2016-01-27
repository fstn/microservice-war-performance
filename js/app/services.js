
/* Services */
'use strict';

angular.module('app.services', [])
    .service('users', ['$http', function ($http) {

        var urlBase = 'http://127.0.0.1:8080/RestEasyAPI-0.0.1-SNAPSHOT/rest/users/';

        this.getUsers = function () {
            return $http.get(urlBase);
        };
    }]);
