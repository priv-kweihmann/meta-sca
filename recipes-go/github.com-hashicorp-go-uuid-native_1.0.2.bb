SUMMARY = "go.mod: github.com/hashicorp/go-uuid"
HOMEPAGE = "https://pkg.go.dev/github.com/hashicorp/go-uuid"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-hashicorp-go-uuid-sources.inc

GO_IMPORT = "github.com/hashicorp/go-uuid"

inherit gosrc
inherit native
