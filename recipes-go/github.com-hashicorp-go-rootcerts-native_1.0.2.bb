SUMMARY = "go.mod: github.com/hashicorp/go-rootcerts"
HOMEPAGE = "https://pkg.go.dev/github.com/hashicorp/go-rootcerts"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-hashicorp-go-rootcerts-sources.inc
require github.com-mitchellh-go-homedir-sources.inc

GO_IMPORT = "github.com/hashicorp/go-rootcerts"

inherit gosrc
inherit native
