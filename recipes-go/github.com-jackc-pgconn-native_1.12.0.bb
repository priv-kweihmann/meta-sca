SUMMARY = "go.mod: github.com/jackc/pgconn"
HOMEPAGE = "https://pkg.go.dev/github.com/jackc/pgconn"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-jackc-pgconn-sources.inc

EXTRA_DEPENDS += "\
    github.com-jackc-chunkreader-v2-native \
    github.com-jackc-pgio-native \
    github.com-jackc-pgpassfile-native \
    github.com-jackc-pgproto3-v2-native \
    github.com-jackc-pgservicefile-native \
    golang.org-x-crypto-native \
    golang.org-x-text-native \
"

GO_IMPORT = "github.com/jackc/pgconn"

inherit gosrc
inherit native
