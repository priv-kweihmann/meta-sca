SUMMARY = "go.mod: github.com/hashicorp/go-cleanhttp"
HOMEPAGE = "https://pkg.go.dev/github.com/hashicorp/go-cleanhttp"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-hashicorp-go-cleanhttp-sources.inc

GO_IMPORT = "github.com/hashicorp/go-cleanhttp"

inherit gosrc
inherit native
