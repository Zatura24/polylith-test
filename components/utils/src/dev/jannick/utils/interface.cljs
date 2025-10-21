(ns dev.jannick.utils.interface
  (:require
    ["qs" :as Qs]))

(defn parse-qs [s]
  (js/console.log "parse-qs:" (.-formats ^js Qs))
  (.parse ^js Qs s))
