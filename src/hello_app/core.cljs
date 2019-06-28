(ns ^:figwheel-hooks hello-app.core
  (:require [reagent.core :as r]))

(enable-console-print!) ;; enable print log into console

(def debug?
  ^boolean goog.DEBUG)

(defn app []
  [:h1.site__title
    [:span.site__title-text "hello !!!"]])


(defn mount []
  (js/console.log "Hello Clojurescript!!!")
  (r/render
   [app]
   (js/document.getElementById "app")))


(defn ^:after-load re-render []
  (mount))


(defonce start-up (do (mount) true))
