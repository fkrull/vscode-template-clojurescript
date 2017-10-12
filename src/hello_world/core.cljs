(ns hello-world.core
    (:require [cljs.nodejs :as nodejs]
              [vscode.window]
              [vscode.commands]))

(defn hello-world []
    (vscode.window/showInformationMessage "Hello ClojureScript!"))

(defn ^:export activate [context]
    (nodejs/enable-util-print!)
    (println "Hello from your ClojureScript extension!")
    (.push (.-subscriptions context)
        (vscode.commands/registerCommand "hellocljs.helloWorld" hello-world)))

(defn ^:export deactivate []
    (println "Goodbye from your ClojureScript extension."))
