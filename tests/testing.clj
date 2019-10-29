(ns testing
  (:require [clojure.java.shell :as shell]))

(defn run-js-test-environment
  [{:keys [output-to open-url] :as args}]
  (let [js-env "tests/testing/test_environment.js"
        result (shell/sh "node" js-env output-to open-url)]
    (if (zero? (:exit result))
      result
      (do (println result)
          (System/exit 0)))))
