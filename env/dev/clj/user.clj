(ns user
  (:require [mount.core :as mount]
            shalou.core))

(defn start []
  (mount/start-without #'shalou.core/repl-server))

(defn stop []
  (mount/stop-except #'shalou.core/repl-server))

(defn restart []
  (stop)
  (start))


