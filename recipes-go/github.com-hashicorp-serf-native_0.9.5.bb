SUMMARY = "go.mod: github.com/hashicorp/serf"
HOMEPAGE = "https://pkg.go.dev/github.com/hashicorp/serf"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-hashicorp-serf-sources.inc

GO_IMPORT = "github.com/hashicorp/serf"

# standalone version is broken
do_compile[noexec] = "1"

inherit gosrc
inherit native
