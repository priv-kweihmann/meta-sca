SUMMARY = "go.mod: github.com/alcortesm/tgz"
HOMEPAGE = "https://pkg.go.dev/github.com/alcortesm/tgz"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-alcortesm-tgz-sources.inc

GO_IMPORT = "github.com/alcortesm/tgz"

inherit gosrc
inherit native
