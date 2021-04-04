SUMMARY = "go.mod: github.com/djherbis/buffer"
HOMEPAGE = "https://pkg.go.dev/github.com/djherbis/buffer"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-djherbis-buffer-sources.inc

GO_IMPORT = "github.com/djherbis/buffer"

inherit gosrc
inherit native
