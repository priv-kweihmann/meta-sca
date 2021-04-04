SUMMARY = "go.mod: github.com/markbates/refresh"
HOMEPAGE = "https://pkg.go.dev/github.com/markbates/refresh"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-markbates-refresh-sources.inc

GO_IMPORT = "github.com/markbates/refresh"

inherit gosrc
inherit native
