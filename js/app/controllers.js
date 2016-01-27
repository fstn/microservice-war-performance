'use strict';

/* Controllers */

function UsersController($scope, users) {

     users.getUsers()
            .success(function (users) {
                $scope.users = users;
            })
            .error(function (error) {
                $scope.status = 'Unable to load user data: ' + error.message;
            });
    
    $scope.details = function(user) {
        $scope.selectedUser = user;
        $scope.userSelected = true;
    }
    
}
