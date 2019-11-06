(ns testing.core-tests
  (:require [cljs.test :refer-macros [deftest is testing]]))

(deftest test-dummy
  (is (= 1 1)))
