(ns ghost.test-runner
  (:require [clojure.test :as t :refer [deftest is testing]]))

(deftest test-will-fail
  (is (= true false)))

(defn -main []
  (t/run-tests 'ghost.test-runner))