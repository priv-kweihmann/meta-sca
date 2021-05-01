SUMMARY = "go.mod: github.com/posener/complete"
HOMEPAGE = "https://pkg.go.dev/github.com/posener/complete"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-posener-complete-sources.inc

EXTRA_DEPENDS += "\
    github.com-hashicorp-go-multierror-native \
"

GO_IMPORT = "github.com/posener/complete"

inherit gosrc
inherit native
