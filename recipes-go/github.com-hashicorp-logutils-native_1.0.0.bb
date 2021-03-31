SUMMARY = "go.mod: github.com/hashicorp/logutils"
HOMEPAGE = "https://pkg.go.dev/github.com/hashicorp/logutils"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-hashicorp-logutils-sources.inc

GO_IMPORT = "github.com/hashicorp/logutils"

inherit gosrc
inherit native
