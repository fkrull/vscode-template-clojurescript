(require '[lumo.build.api :as build])

(build/build "src"
    {:output-to "out/main.js"
     :optimizations :simple
     :target :nodejs})
