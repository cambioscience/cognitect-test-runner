(ns ghost.test-runner
  (:require [clojure.test :as t :refer [deftest is testing]]))

(deftest test-will-fail
  (is (= true false)))

(deftest test-will-pass
  (is (= true true)))

(defn -main []
  (let [{:keys [fail error]} (t/run-tests 'ghost.test-runner)]
    (System/exit (if (zero? (+ fail error)) 0 1))))