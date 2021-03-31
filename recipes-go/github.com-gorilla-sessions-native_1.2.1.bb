SUMMARY = "go.mod: github.com/gorilla/sessions"
HOMEPAGE = "https://pkg.go.dev/github.com/gorilla/sessions"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gorilla-sessions-sources.inc
require github.com-gorilla-securecookie-sources.inc

GO_IMPORT = "github.com/gorilla/sessions"

inherit gosrc
inherit native
