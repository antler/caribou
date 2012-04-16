(defproject antler/caribou "0.4.5"
  :description
  "caribou: type structure interaction medium"

  :dependencies
  [[antler/caribou-core "0.4.4"]
   [antler/caribou-api "0.2.0"]
   [antler/caribou-frontend "0.2.0"]
   [antler/caribou-admin "0.2.0"]]

  :sub
  ["caribou-core"
   "caribou-api"
   "caribou-frontend"
   "caribou-admin"]

  :codox
  {:sources
   ["caribou-core/src"
    "caribou-api/src"
    "caribou-frontend/src"
    "caribou-admin/src"]}

  :jvm-opts ["-agentlib:jdwp=transport=dt_socket,server=y,suspend=n"])

  ;;:repositories {"sonatype-oss-public" "https://oss.sonatype.org/content/groups/public/"})
  ;; :main caribou.core
                 ;; "battlecat" "http://battlecat:8080/nexus/content/groups/public"
                 ;; "snapshots" "http://battlecat:8080/nexus/content/repositories/snapshots"
                 ;; "releases" "http://battlecat:8080/nexus/content/repositories/releases"})
