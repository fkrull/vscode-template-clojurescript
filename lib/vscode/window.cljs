(ns vscode.window)
(def window (.-window (js/require "vscode")))

(defn showInformationMessage [& args]
    (apply (.-showInformationMessage window) args))
