SUMMARY = "go.mod: github.com/jackc/pgconn"
HOMEPAGE = "https://pkg.go.dev/github.com/jackc/pgconn"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-jackc-pgconn-sources.inc

GO_IMPORT = "github.com/jackc/pgconn"

inherit gosrc
inherit native
