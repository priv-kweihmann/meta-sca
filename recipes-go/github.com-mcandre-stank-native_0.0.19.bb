SUMMARY = "go.mod: github.com/mcandre/stank"
HOMEPAGE = "https://pkg.go.dev/github.com/mcandre/stank"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-mcandre-stank-sources.inc

GO_IMPORT = "github.com/mcandre/stank"

inherit gosrc
inherit native
