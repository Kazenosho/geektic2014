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

});

app.controller('afficheGeeksCtl', function($scope, $http, $routeParams) {
	
    $http.get('/afficheGeeks/' + $routeParams.sexe).success(function(geeksListe) {
        $scope.geeksListe = geeksListe;
    });
});

