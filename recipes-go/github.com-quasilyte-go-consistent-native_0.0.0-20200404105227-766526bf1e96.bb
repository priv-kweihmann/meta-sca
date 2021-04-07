SUMMARY = "go.mod: github.com/quasilyte/go-consistent"
HOMEPAGE = "https://pkg.go.dev/github.com/quasilyte/go-consistent"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-quasilyte-go-consistent-sources.inc

GO_IMPORT = "github.com/quasilyte/go-consistent"

inherit gosrc
inherit native
