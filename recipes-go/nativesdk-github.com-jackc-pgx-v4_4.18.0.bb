SUMMARY = "go.mod: github.com/jackc/pgx/v4"
HOMEPAGE = "https://pkg.go.dev/github.com/jackc/pgx/v4"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-jackc-pgx-v4-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-go-kit-log \
    nativesdk-github.com-jackc-pgconn \
    nativesdk-github.com-jackc-pgio \
    nativesdk-github.com-jackc-pgproto3-v2 \
    nativesdk-github.com-jackc-pgtype \
    nativesdk-github.com-jackc-puddle \
    nativesdk-github.com-rs-zerolog \
    nativesdk-github.com-sirupsen-logrus \
    nativesdk-go.uber.org-zap \
    nativesdk-gopkg.in-inconshreveable-log15.v2 \
"
GO_IMPORT = "github.com/jackc/pgx/v4"
inherit gosrc
inherit nativesdk
