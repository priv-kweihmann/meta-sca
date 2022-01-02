SUMMARY = "go.mod: github.com/gobuffalo/pop"
HOMEPAGE = "https://pkg.go.dev/github.com/gobuffalo/pop"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gobuffalo-pop-sources.inc

EXTRA_DEPENDS += "\
    github.com-fatih-color-native \
    github.com-go-sql-driver-mysql-native \
    github.com-gobuffalo-attrs-native \
    github.com-gobuffalo-envy-native \
    github.com-gobuffalo-fizz-native \
    github.com-gobuffalo-flect-native \
    github.com-gobuffalo-genny-v2-native \
    github.com-gobuffalo-logger-native \
    github.com-gobuffalo-nulls-native \
    github.com-gobuffalo-packd-native \
    github.com-gobuffalo-packr-v2-native \
    github.com-gobuffalo-plush-v4-native \
    github.com-gobuffalo-validate-v3-native \
    github.com-gofrs-uuid-native \
    github.com-jackc-pgconn-native \
    github.com-jackc-pgx-v4-native \
    github.com-jmoiron-sqlx-native \
    github.com-lib-pq-native \
    github.com-luna-duclos-instrumentedsql-native \
    github.com-mattn-go-sqlite3-native \
    github.com-pkg-errors-native \
    github.com-spf13-cobra-native \
    golang.org-x-sync-native \
    gopkg.in-yaml.v2-native \
"

GO_IMPORT = "github.com/gobuffalo/pop"

UPSTREAM_CHECK_REGEX = "v(?P<pver>\d+\.\d+\.\d+)"

inherit gosrc
inherit native
