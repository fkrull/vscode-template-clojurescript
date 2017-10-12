(require '[lumo.build.api :as build])
(require '[goog.string])
(require '[goog.string.format])

(defn to-string [value]
    (if (nil? value) "" (str value)))

(defn format-src-location [line col]
    (goog.string/format "[%s,%s]: "
        (to-string line)
        (to-string col)))

(defn format-error-message
    ([error]
     (let [file (:file (.-data error))
           cause (.-cause (.-cause error))]
        (format-error-message file cause)))
    ([file cause]
     (let [message (.-message cause)
           { :keys [line col] } (.-data cause)]
        (str "error:" file (format-src-location line col) message))))

(try
    (build/build
        (build/inputs "lib" "src")
        {:output-to "out/main.js"
            :optimizations :none
            :process-shim false
            :hashbang false
            :verbose true
            :target :nodejs
            :static-fns true
            :fn-invoke-direct true})
    (catch js/Error exc (println (format-error-message exc))))
