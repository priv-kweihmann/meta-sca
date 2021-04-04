SUMMARY = "go.mod: github.com/pressly/chi"
HOMEPAGE = "https://pkg.go.dev/github.com/pressly/chi"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-pressly-chi-sources.inc

GO_IMPORT = "github.com/pressly/chi"

inherit gosrc
inherit native
