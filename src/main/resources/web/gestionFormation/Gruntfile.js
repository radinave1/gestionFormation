'use strict';
var LIVERELOAD_PORT = 35729;
//
// var lrSnippet = require('connect-livereload')({
//   port: LIVERELOAD_PORT
// });
// var proxySnippet = require('grunt-connect-proxy/lib/utils').proxyRequest;
var mountFolder = function(connect, dir) {

  return connect.static(require('path').resolve(dir));
};

var proxies = {
    serveurLocal: {
      context: '/api',
      host: 'localhost',
      port: 8080      // changeOrigin: true,
      // xforward: false,
    //   rewrite: {
    //     '/api/': '/client/api/'
    // }
  },
};

module.exports = function(grunt) {
  require('load-grunt-tasks')(grunt);
  grunt.loadNpmTasks('grunt-port-pick');



  // Config GRUNT
  grunt.initConfig({

    /** Server **/
    // watch : permt d'associer des actions à chaque changement sur un fichier.
    watch: {

      // chaque changement sur un fichier de l'app met à jour le serveur web.
      livereload: {
        options: {
          livereload: LIVERELOAD_PORT
        },
        files: [
          'app/**/*',
          '.tmp/**/*'
        ]
      }
    },

    // connect : lance un serveur web
    connect: {
      options: {
        port: 9000,
        hostname: 'localhost'
      },
      bower: {
        // Serveur web sur l'application en cours de développement.
        options: {
          middleware: function(connect) {
            return [
              // proxySnippet,
              // lrSnippet,
              mountFolder(connect, '.tmp'),
              mountFolder(connect, 'app'),
              mountFolder(connect, '.'),
            ];
          },
          open: {
            target: 'http://localhost:9000/'
          }
        },
        // les appels à localhost/api sont redirigés vers localhost:8080/api, ce qui permet de faire des tests avec un back office en local
        proxies: [proxies.serveurLocal]
      },
    }
  });

  grunt.loadNpmTasks('grunt-connect-proxy');
    grunt.loadNpmTasks('grunt-contrib-connect');

  grunt.registerTask('server', function(server, components) {
    server = server || 'int';
    components = components || 'bower';

    var connect = components + (server === 'local' ? '' : server);
    console.log('*** Starting ' + connect + ' ***');

    var noLiveReload = grunt.option('no-lr');
    if (!noLiveReload) {
      grunt.task.run([
        'configureProxies:' + connect,
        'connect:' + connect,
        'watch'
      ]);
    }

  });
};
