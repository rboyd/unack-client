(ns unack-client.core
  (:require [immutant.messaging :as messaging]
            [clojure.tools.logging :as logging]))

(defn logger [msg]
  (logging/info msg))

(defn init []
  (messaging/listen (messaging/as-queue "SomeQueue") logger :host "127.0.0.1" :port 5445 :decode? false :reconnect-attempts -1 :retry-interval 1000))
