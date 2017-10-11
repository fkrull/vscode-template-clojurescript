(require '[lumo.build.api :as build])

(build/build "src"
    {:output-to "out/main.js"
     :optimizations :none
     :process-shim false
     :verbose true
     :hashbang false
     :target :nodejs})
