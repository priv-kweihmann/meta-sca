SUMMARY = "go.mod: github.com/gorilla/css"
HOMEPAGE = "https://pkg.go.dev/github.com/gorilla/css"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gorilla-css-sources.inc

GO_IMPORT = "github.com/gorilla/css"

inherit gosrc
inherit native
