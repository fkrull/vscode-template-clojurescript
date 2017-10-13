(ns hello-world.core
    (:require [cljs.nodejs :as nodejs]
              [vscode.window]
              [vscode.commands]
              [hello-world.greeting :refer [greeting]]))

(defn hello-world []
    (vscode.window/showInformationMessage (greeting)))

(defn ^:export activate [context]
    (nodejs/enable-util-print!)
    (println "Hello from your ClojureScript extension!")
    (.push (.-subscriptions context)
        (vscode.commands/registerCommand "hellocljs.helloWorld" hello-world)))

(defn ^:export deactivate []
    (println "Goodbye from your ClojureScript extension."))
