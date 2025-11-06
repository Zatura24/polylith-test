(ns dev.jannick.amazing-app.core
  (:require
    [dev.jannick.utils.interface :as utils]
    [dev.jannick.server.interface :as server]))

;; just a simple change
;; just a fimple hotfix comment

(defn ^:export init []
  (js/console.log "Utils lib:")
  (->
    (utils/parse-qs "a=c")
    js/console.dir)
  (js/console.log "Starting server:")
  (server/start-server))

