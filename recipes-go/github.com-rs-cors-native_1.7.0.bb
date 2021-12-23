SUMMARY = "go.mod: github.com/rs/cors"
HOMEPAGE = "https://pkg.go.dev/github.com/rs/cors"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-rs-cors-sources.inc

EXTRA_DEPENDS += "\
    github.com-codegangsta-negroni-native \
    github.com-gin-gonic-gin-native \
    github.com-go-martini-martini-native \
    github.com-gobuffalo-buffalo-native \
    github.com-gorilla-mux-native \
    github.com-julienschmidt-httprouter-native \
    github.com-justinas-alice-native \
    github.com-martini-contrib-render-native \
    github.com-pressly-chi-native \
    github.com-zenazn-goji-native \
"

GO_IMPORT = "github.com/rs/cors"

inherit gosrc
inherit native
