(ns testing.core-tests
  (:require [cljs.test :refer-macros [deftest is testing async]]))

(deftest test-dummy
  (is (= 1 1)))

(deftest promise-resolve-x
  (let [x 42]
    (async done
           (is (= 42 x))
           (done))))
