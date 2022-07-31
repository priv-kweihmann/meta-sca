SUMMARY = "go.mod: github.com/emirpasic/gods"
HOMEPAGE = "https://pkg.go.dev/github.com/emirpasic/gods"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-emirpasic-gods-sources.inc

GO_IMPORT = "github.com/emirpasic/gods"
inherit gosrc
inherit nativesdk
