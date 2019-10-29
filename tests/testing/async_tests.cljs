(ns testing.async-tests
  (:require [cljs.test :refer-macros [deftest is testing run-tests async]]
            [cljs.core.async :refer [<! >! timeout take! chan] :refer-macros [go]]
            [cljs-http.client :as http]
            [ajax.core :refer [GET]]))


(deftest test-async-file
  (async done
         (go (let [response (<! (http/get "index.html"))]
               (is (= 200 (:status response)))
               (done)))))

(deftest test-http-async
  (async done
         (go (let [response (<! (http/get "https://developer.mozilla.org/en-US/docs/Web/CSS/line-height?raw&section=Summary" {:with-credentials? false}))]
               (prn response)
               (is (= 200 (:status response)))
               (done)))))
