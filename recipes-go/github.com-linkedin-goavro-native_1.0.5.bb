SUMMARY = "go.mod: github.com/linkedin/goavro"
HOMEPAGE = "https://pkg.go.dev/github.com/linkedin/goavro"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-linkedin-goavro-sources.inc

EXTRA_DEPENDS += "\
    github.com-golang-snappy-native \
"

GO_IMPORT = "github.com/linkedin/goavro"

inherit gosrc
inherit native
