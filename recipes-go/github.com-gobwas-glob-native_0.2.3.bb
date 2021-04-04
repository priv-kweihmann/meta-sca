SUMMARY = "go.mod: github.com/gobwas/glob"
HOMEPAGE = "https://pkg.go.dev/github.com/gobwas/glob"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gobwas-glob-sources.inc

GO_IMPORT = "github.com/gobwas/glob"

inherit gosrc
inherit native
