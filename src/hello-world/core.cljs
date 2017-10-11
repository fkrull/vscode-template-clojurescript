(ns hello-world.core
    (:require [cljs.nodejs :as nodejs]))

(defn ^:export activate [context]
    (nodejs/enable-util-print!)
    (println "Hello from your ClojureScript extension!"))

(defn ^:export deactivate []
    (println "Goodbye from your ClojureScript extension."))
