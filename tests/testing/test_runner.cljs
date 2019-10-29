(ns ^:figwheel-hooks testing.test-runner
  (:require  [cljs.test]
             [cljs-test-display.core]
             [testing.core-tests]
             [testing.async-tests])
  (:require-macros [cljs.test]))

(defn ^:after-load test-run
  []
  (cljs.test/run-tests
   (cljs-test-display.core/init! "app-tests")
   'testing.core-tests
   'testing.async-tests))

(defonce run (test-run))
