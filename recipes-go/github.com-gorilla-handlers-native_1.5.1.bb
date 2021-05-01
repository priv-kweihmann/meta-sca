SUMMARY = "go.mod: github.com/gorilla/handlers"
HOMEPAGE = "https://pkg.go.dev/github.com/gorilla/handlers"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gorilla-handlers-sources.inc

EXTRA_DEPENDS += "\
    github.com-felixge-httpsnoop-native \
"

GO_IMPORT = "github.com/gorilla/handlers"

inherit gosrc
inherit native
