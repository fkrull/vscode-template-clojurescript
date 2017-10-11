(ns hello-world.core
    (:require [cljs.nodejs :as nodejs]))
(def vscode (js/require "vscode"))

(defn hello-world []
    (.showInformationMessage (.-window vscode) "Hello ClojureScript!"))

(defn ^:export activate [context]
    (nodejs/enable-util-print!)
    (println "Hello from your ClojureScript extension!")
    (.push (.-subscriptions context)
        (.registerCommand (.-commands vscode) "hellocljs.helloWorld" hello-world)))

(defn ^:export deactivate []
    (println "Goodbye from your ClojureScript extension."))
