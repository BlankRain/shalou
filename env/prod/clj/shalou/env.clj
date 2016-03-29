(ns shalou.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[shalou started successfully]=-"))
   :middleware identity})
