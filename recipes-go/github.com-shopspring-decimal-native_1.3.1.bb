SUMMARY = "go.mod: github.com/shopspring/decimal"
HOMEPAGE = "https://pkg.go.dev/github.com/shopspring/decimal"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-shopspring-decimal-sources.inc

GO_IMPORT = "github.com/shopspring/decimal"

inherit gosrc
inherit native
