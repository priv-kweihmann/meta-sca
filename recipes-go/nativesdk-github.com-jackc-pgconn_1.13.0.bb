SUMMARY = "go.mod: github.com/jackc/pgconn"
HOMEPAGE = "https://pkg.go.dev/github.com/jackc/pgconn"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-jackc-pgconn-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-jackc-chunkreader-v2 \
    nativesdk-github.com-jackc-pgio \
    nativesdk-github.com-jackc-pgpassfile \
    nativesdk-github.com-jackc-pgproto3-v2 \
    nativesdk-github.com-jackc-pgservicefile \
    nativesdk-golang.org-x-crypto \
    nativesdk-golang.org-x-text \
"
GO_IMPORT = "github.com/jackc/pgconn"
inherit gosrc
inherit nativesdk
