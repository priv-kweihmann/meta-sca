SUMMARY = "go.mod: github.com/inconshreveable/mousetrap"
HOMEPAGE = "https://pkg.go.dev/github.com/inconshreveable/mousetrap"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-inconshreveable-mousetrap-sources.inc

GO_IMPORT = "github.com/inconshreveable/mousetrap"

inherit gosrc
inherit native
