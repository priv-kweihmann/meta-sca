SUMMARY = "go.mod: github.com/boyter/lc"
HOMEPAGE = "https://pkg.go.dev/github.com/boyter/lc"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-boyter-lc-sources.inc

GO_IMPORT = "github.com/boyter/lc"

inherit gosrc
inherit native
