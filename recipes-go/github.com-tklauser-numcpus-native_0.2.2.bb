SUMMARY = "go.mod: github.com/tklauser/numcpus"
HOMEPAGE = "https://pkg.go.dev/github.com/tklauser/numcpus"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-tklauser-numcpus-sources.inc

GO_IMPORT = "github.com/tklauser/numcpus"

inherit gosrc
inherit native
