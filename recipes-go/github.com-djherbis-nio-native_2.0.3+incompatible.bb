SUMMARY = "go.mod: github.com/djherbis/nio"
HOMEPAGE = "https://pkg.go.dev/github.com/djherbis/nio"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-djherbis-nio-sources.inc

GO_IMPORT = "github.com/djherbis/nio"

inherit gosrc
inherit native
