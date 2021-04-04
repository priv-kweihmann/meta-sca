SUMMARY = "go.mod: github.com/aymerick/douceur"
HOMEPAGE = "https://pkg.go.dev/github.com/aymerick/douceur"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-aymerick-douceur-sources.inc

GO_IMPORT = "github.com/aymerick/douceur"

inherit gosrc
inherit native
