SUMMARY = "go.mod: github.com/hashicorp/go-immutable-radix"
HOMEPAGE = "https://pkg.go.dev/github.com/hashicorp/go-immutable-radix"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-hashicorp-go-immutable-radix-sources.inc

EXTRA_DEPENDS += "\
    github.com-hashicorp-golang-lru-native \
"

GO_IMPORT = "github.com/hashicorp/go-immutable-radix"

inherit gosrc
inherit native
