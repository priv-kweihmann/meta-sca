SUMMARY = "go.mod: github.com/hashicorp/go-immutable-radix"
HOMEPAGE = "https://pkg.go.dev/github.com/hashicorp/go-immutable-radix"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-hashicorp-go-immutable-radix-sources.inc
require github.com-hashicorp-golang-lru-sources.inc

GO_IMPORT = "github.com/hashicorp/go-immutable-radix"

inherit gosrc
inherit native
