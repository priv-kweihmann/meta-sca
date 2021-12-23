SUMMARY = "go.mod: github.com/jackc/pgproto3/v2"
HOMEPAGE = "https://pkg.go.dev/github.com/jackc/pgproto3/v2"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-jackc-pgproto3-v2-sources.inc

EXTRA_DEPENDS += "\
    github.com-jackc-chunkreader-v2-native \
    github.com-jackc-pgio-native \
"

GO_IMPORT = "github.com/jackc/pgproto3/v2"

inherit gosrc
inherit native
