SUMMARY = "go.mod: github.com/mattn/go-runewidth"
HOMEPAGE = "https://pkg.go.dev/github.com/mattn/go-runewidth"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-mattn-go-runewidth-sources.inc
require github.com-rivo-uniseg-sources.inc

GO_IMPORT = "github.com/mattn/go-runewidth"

inherit gosrc
inherit native
