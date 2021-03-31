SUMMARY = "go.mod: github.com/posener/complete"
HOMEPAGE = "https://pkg.go.dev/github.com/posener/complete"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-posener-complete-sources.inc
require github.com-hashicorp-errwrap-sources.inc
require github.com-hashicorp-go-multierror-sources.inc

GO_IMPORT = "github.com/posener/complete"

inherit gosrc
inherit native
