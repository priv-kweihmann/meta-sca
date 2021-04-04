SUMMARY = "go.mod: github.com/nxadm/tail"
HOMEPAGE = "https://pkg.go.dev/github.com/nxadm/tail"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-nxadm-tail-sources.inc

GO_IMPORT = "github.com/nxadm/tail"

inherit gosrc
inherit native
