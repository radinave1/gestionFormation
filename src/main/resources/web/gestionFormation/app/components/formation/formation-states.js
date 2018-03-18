(function() {
  "use strict";


  angular.module("App.formation")
    .config(function($stateProvider) {
      var state = {
        name: 'formation',
        url: '/formation',
        templateUrl: 'components/formation/formation-tpl.html',
        controller: 'formationController'
      };
      $stateProvider.state(state);

    });
}());
