(ns ^:figwheel-hooks testing.test-runner
  (:require  [cljs.test]
             [cljs-test-display.core]
             [testing.core-tests])
  (:require-macros [cljs.test]))


(defn ^:after-load test-run
  []
  (cljs.test/run-tests
   (cljs-test-display.core/init! "app-tests")
   'testing.core-tests))

(defonce run (test-run))
