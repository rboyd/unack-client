(defproject unack-client "0.1.0-SNAPSHOT"
  :description "Example app to demonstrate unacknowledged message issue."
  :url "http://github.com/rboyd/unack-client"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :immutant  { :init unack-client.core/init
               :nrepl-port 4112 }
  :dependencies [[org.clojure/clojure "1.4.0"]]
  :main unack-client.core)
