var app = angular.module("geektic", ['ngRoute']);


app.config(function($routeProvider){

	$routeProvider
	.when('/', {
		templateUrl: '/views/accueil.html'
	})
	.when('/afficheGeeks/:sexe', {
		templateUrl: '/views/afficheGeeks.html',
		controller: 'afficheGeeksCtl'
	})
	.when('/geek/:id', {
		templateUrl: '/views/geek.html',
		controller: 'geekCtl'
	})

});

app.controller('afficheGeeksCtl', function($scope, $http, $routeParams) {
	
    $http.get('/afficheGeeks/' + $routeParams.sexe).success(function(geeksListe) {
        $scope.geeksListe = geeksListe;
    });
});

app.controller('geekCtl', function($scope, $http, $routeParams) {
	
    $http.get('/geek/' + $routeParams.id).success(function(geek) {
        $scope.geek = geek;
    });
});

