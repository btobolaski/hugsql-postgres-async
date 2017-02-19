(defproject hugsql-adapter-postgres-async "0.3.4-SNAPSHOT"
  :description "Postgres.async adapter for HugSQL"
  :url "https://gitlab.com/robin.heggelund/hugsql-postgres-async"
  :license {:name "Apache License, Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/core.async "0.2.374"]
                 [com.layerware/hugsql-adapter "0.4.7"]
                 [alaisi/postgres.async "0.8.0"]])
