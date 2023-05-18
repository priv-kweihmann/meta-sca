SUMMARY = "go.mod: github.com/campoy/embedmd"
HOMEPAGE = "https://pkg.go.dev/github.com/campoy/embedmd"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-campoy-embedmd-sources.inc

EXTRA_DEPENDS += "\
    github.com-pmezard-go-difflib-native \
"

GO_IMPORT = "github.com/campoy/embedmd"

inherit gosrc
inherit native
