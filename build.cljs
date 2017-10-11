(require '[lumo.build.api :as build])

(build/build
    (build/inputs "lib" "src")
    {:output-to "out/main.js"
     :optimizations :none
     :process-shim false
     :hashbang false
     :verbose true
     :target :nodejs})
