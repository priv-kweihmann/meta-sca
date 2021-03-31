SUMMARY = "go.mod: github.com/kisielk/gotool"
HOMEPAGE = "https://pkg.go.dev/github.com/kisielk/gotool"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-kisielk-gotool-sources.inc

GO_IMPORT = "github.com/kisielk/gotool"

inherit gosrc
inherit native
