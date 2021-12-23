SUMMARY = "go.mod: github.com/jackc/pgio"
HOMEPAGE = "https://pkg.go.dev/github.com/jackc/pgio"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-jackc-pgio-sources.inc

GO_IMPORT = "github.com/jackc/pgio"

inherit gosrc
inherit native
