SUMMARY = "go.mod: github.com/pborman/uuid"
HOMEPAGE = "https://pkg.go.dev/github.com/pborman/uuid"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-pborman-uuid-sources.inc

EXTRA_DEPENDS += "\
    github.com-google-uuid-native \
"

GO_IMPORT = "github.com/pborman/uuid"

inherit gosrc
inherit native
