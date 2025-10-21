(ns dev.jannick.utils.interface
  (:require
    ["qs" :as Qs]))

(defn parse-qs [s]
  (.parse ^js Qs s))
