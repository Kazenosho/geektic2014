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
		$scope.selection= {interet:0};
		$scope.filtreInteret = function(geek){
			if($scope.selection.interet != "0"){
				for(var i =0; i < geek.interets.length; i++){
					var interet = geek.interets[i];
					
					if(interet.id == $scope.selection.interet){
						return true;
					}	
				}
				return false;
			}
			else{
				
				return true;
			}
		}
	
    $http.get('/afficheGeeks/' + $routeParams.sexe).success(function(geeksListe) {
        $scope.geeksListe = geeksListe;
    });
    $http.get('/interets').success(function(interets) {
        $scope.interets = interets;
    });
});

app.controller('geekCtl', function($scope, $http, $routeParams) {
    $http.get('/geek/' + $routeParams.id).success(function(geek) {
        $scope.geek = geek;
    });
    
});



