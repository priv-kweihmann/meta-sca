SUMMARY = "go.mod: github.com/gorilla/sessions"
HOMEPAGE = "https://pkg.go.dev/github.com/gorilla/sessions"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gorilla-sessions-sources.inc

EXTRA_DEPENDS += "\
    github.com-gorilla-securecookie-native \
"

GO_IMPORT = "github.com/gorilla/sessions"

inherit gosrc
inherit native
