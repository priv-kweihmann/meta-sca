SUMMARY = "go.mod: github.com/jackc/pgtype"
HOMEPAGE = "https://pkg.go.dev/github.com/jackc/pgtype"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-jackc-pgtype-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-gofrs-uuid \
    nativesdk-github.com-jackc-pgconn \
    nativesdk-github.com-jackc-pgio \
    nativesdk-github.com-jackc-pgx-v4 \
    nativesdk-github.com-lib-pq \
    nativesdk-github.com-shopspring-decimal \
"
GO_IMPORT = "github.com/jackc/pgtype"
inherit gosrc
inherit nativesdk
