SUMMARY = "go.mod: github.com/jackc/pgservicefile"
HOMEPAGE = "https://pkg.go.dev/github.com/jackc/pgservicefile"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-jackc-pgservicefile-sources.inc

GO_IMPORT = "github.com/jackc/pgservicefile"
inherit gosrc
inherit nativesdk
