SUMMARY = "go.mod: github.com/muesli/cancelreader"
HOMEPAGE = "https://pkg.go.dev/github.com/muesli/cancelreader"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-muesli-cancelreader-sources.inc

EXTRA_DEPENDS += "\
    golang.org-x-sys-native \
"

GO_IMPORT = "github.com/muesli/cancelreader"

inherit gosrc
inherit_defer native
