(ns caribou.md
  (:require [markdown.core :as md]))

(def targets
  ["outline"
   "quickstart"
   "what-is-caribou"
   "getting-started"
   "components"
   "basic-concepts"
   "philosophy"
   "configuring"
   "models"
   "routes"
   "controllers"
   "templates"
   "misc"
   "tutorial"
   "api"
   "deploying"])

(def pre-layout
  "<!DOCTYPE html>
<html>
  <head>
    <meta charset='utf-8'>
    <meta http-equiv=\"X-UA-Compatible\" content=\"chrome=1\">

    <link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheets/stylesheet.css\" media=\"screen\" />
    <link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheets/pygment_trac.css\" media=\"screen\" />

    <title>Caribou Documentation</title>
  </head>

  <body>

    <header>
      <div class=\"container\">
        <h1>THIS. IS. CARIBOU.</h1>
      </div>
    </header>

    <div class=\"container\">
      <section id=\"main_content\">
")

(def post-layout
  "
      </section>
    </div>

    
  </body>
</html>")

(defn wrap-layout
  [html]
  (str pre-layout html post-layout))

(defn compile-targets
  []
  (doseq [target targets]
    (let [html (md/md-to-html-string (slurp (str target ".md")))
          wrapped (wrap-layout html)]
      (spit (str "docs/" target ".html") wrapped))))

(defn -main
  []
  (compile-targets))
