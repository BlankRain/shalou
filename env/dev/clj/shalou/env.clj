(ns shalou.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [shalou.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[shalou started successfully using the development profile]=-"))
   :middleware wrap-dev})
