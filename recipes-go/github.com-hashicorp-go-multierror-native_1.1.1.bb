SUMMARY = "go.mod: github.com/hashicorp/go-multierror"
HOMEPAGE = "https://pkg.go.dev/github.com/hashicorp/go-multierror"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-hashicorp-go-multierror-sources.inc
require github.com-hashicorp-errwrap-sources.inc

GO_IMPORT = "github.com/hashicorp/go-multierror"

inherit gosrc
inherit native
