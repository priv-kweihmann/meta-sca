SUMMARY = "go.mod: github.com/julienschmidt/httprouter"
HOMEPAGE = "https://pkg.go.dev/github.com/julienschmidt/httprouter"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-julienschmidt-httprouter-sources.inc

GO_IMPORT = "github.com/julienschmidt/httprouter"

inherit gosrc
inherit native
