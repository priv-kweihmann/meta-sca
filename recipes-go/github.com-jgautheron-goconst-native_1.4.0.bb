SUMMARY = "go.mod: github.com/jgautheron/goconst"
HOMEPAGE = "https://pkg.go.dev/github.com/jgautheron/goconst"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-jgautheron-goconst-sources.inc

GO_IMPORT = "github.com/jgautheron/goconst"

inherit gosrc
inherit native
