SUMMARY = "go.mod: github.com/securego/gosec"
HOMEPAGE = "https://pkg.go.dev/github.com/securego/gosec"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-securego-gosec-sources.inc

GO_IMPORT = "github.com/securego/gosec"

inherit gosrc
inherit native
