SUMMARY = "go.mod: github.com/hashicorp/memberlist"
HOMEPAGE = "https://pkg.go.dev/github.com/hashicorp/memberlist"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-hashicorp-memberlist-sources.inc

GO_IMPORT = "github.com/hashicorp/memberlist"

inherit gosrc
inherit native
