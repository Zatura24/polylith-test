(ns dev.jannick.server.interface
  (:require
    ["express$default" :as express]))

(defn start-server []
  (let [app ^js (express)]
    (.get app "/" (fn [^js req ^js res] (js/console.dir req) (.send res "Hello world")))
    (.listen app 3000)))
