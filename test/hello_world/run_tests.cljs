(ns hello-world.run-tests
    (:require [cljs.nodejs]
              [cljs.test :refer-macros [run-tests]]
              [hello-world.test-greeting]))

(defn -main [& args]
    (cljs.nodejs/enable-util-print!)
    (cljs.test/run-tests
        'hello-world.test-greeting))

(set! *main-cli-fn* -main)
