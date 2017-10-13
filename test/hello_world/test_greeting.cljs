(ns hello-world.test-greeting
    (:require [cljs.test :refer-macros [deftest is testing]]
              [hello-world.greeting]))

(deftest test-greeting
    (testing "should return themed greeting"
        (is (hello-world.greeting/greeting) "Hello ClojureScript!")))
