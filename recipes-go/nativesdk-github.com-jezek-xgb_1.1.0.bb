SUMMARY = "go.mod: github.com/jezek/xgb"
HOMEPAGE = "https://pkg.go.dev/github.com/jezek/xgb"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-jezek-xgb-sources.inc

GO_IMPORT = "github.com/jezek/xgb"
inherit gosrc
inherit nativesdk
