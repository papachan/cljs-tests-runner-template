(ns testing.test-runner-headless
  (:require
   [figwheel.main.testing :refer-macros [run-tests-async]]
   [testing.core-tests]))

(defn -main [& args]
  (run-tests-async 10000))
