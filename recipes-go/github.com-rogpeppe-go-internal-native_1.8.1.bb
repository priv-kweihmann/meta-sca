SUMMARY = "go.mod: github.com/rogpeppe/go-internal"
HOMEPAGE = "https://pkg.go.dev/github.com/rogpeppe/go-internal"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-rogpeppe-go-internal-sources.inc

EXTRA_DEPENDS += "\
    github.com-pkg-diff-native \
    gopkg.in-errgo.v2-native \
"

GO_IMPORT = "github.com/rogpeppe/go-internal"

inherit gosrc
inherit native
