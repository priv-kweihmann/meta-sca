SUMMARY = "go.mod: github.com/jackc/pgtype"
HOMEPAGE = "https://pkg.go.dev/github.com/jackc/pgtype"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-jackc-pgtype-sources.inc

GO_IMPORT = "github.com/jackc/pgtype"

inherit gosrc
inherit native
