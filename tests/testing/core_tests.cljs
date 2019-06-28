(ns testing.core-tests
  (:require [cljs.test :refer-macros [deftest is testing run-tests async]]
            [cljs.core.async :refer [<! >! timeout take! chan] :refer-macros [go]]
            [cljs-http.client :as http]
            [ajax.core :refer [GET]]))

(deftest test-dummy
  (is (= 1 1)))

(deftest promise-resolve-x
  (let [x 42]
    (async done
           (is (= 42 x))
           (done))))
