SUMMARY = "go.mod: github.com/gorilla/mux"
HOMEPAGE = "https://pkg.go.dev/github.com/gorilla/mux"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gorilla-mux-sources.inc

GO_IMPORT = "github.com/gorilla/mux"

inherit gosrc
inherit native
