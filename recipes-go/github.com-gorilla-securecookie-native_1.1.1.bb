SUMMARY = "go.mod: github.com/gorilla/securecookie"
HOMEPAGE = "https://pkg.go.dev/github.com/gorilla/securecookie"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gorilla-securecookie-sources.inc

GO_IMPORT = "github.com/gorilla/securecookie"

inherit gosrc
inherit native
