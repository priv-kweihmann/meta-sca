SUMMARY = "go.mod: github.com/ugorji/go"
HOMEPAGE = "https://pkg.go.dev/github.com/ugorji/go"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-ugorji-go-sources.inc

EXTRA_DEPENDS += "\
    github.com-ugorji-go-codec-native \
"

GO_IMPORT = "github.com/ugorji/go"

inherit gosrc
inherit native
