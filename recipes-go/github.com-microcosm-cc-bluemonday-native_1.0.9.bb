SUMMARY = "go.mod: github.com/microcosm-cc/bluemonday"
HOMEPAGE = "https://pkg.go.dev/github.com/microcosm-cc/bluemonday"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-microcosm-cc-bluemonday-sources.inc

GO_IMPORT = "github.com/microcosm-cc/bluemonday"

inherit gosrc
inherit native
