(function() {

  "use strict";

  angular.module("App.formation")
    .controller("formationController", function($scope,$http) {


      $http.get({
        method: 'GET',
        url: 'localhost:8080/list'
      }).then(function(response) {
        $scope.formation = response;
      });


    });



}());
