(ns dev.jannick.amazing-app.core
  (:require
    [dev.jannick.utils.interface :as utils]))

(defn ^:export init []
  (->
    (utils/parse-qs "a=c")
    js/console.dir))

