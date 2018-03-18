(function() {

  "use strict";
  angular.module("App", [
      'App.formation'
    ])
    .run(function($state) {
      $state.go("formation");
    });


}());
