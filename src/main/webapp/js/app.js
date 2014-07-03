var app = angular.module("geektic", ['ngRoute']);

app.controller('afficheGeeks', function($scope, $http) {
    $http.get('/afficheGeeks').success(function(afficheGeeks) {
        $scope.afficheGeeks = afficheGeeks;
    });
});