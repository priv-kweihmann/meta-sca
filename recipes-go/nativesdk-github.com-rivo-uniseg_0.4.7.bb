SUMMARY = "go.mod: github.com/rivo/uniseg"
HOMEPAGE = "https://pkg.go.dev/github.com/rivo/uniseg"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-rivo-uniseg-sources.inc

GO_IMPORT = "github.com/rivo/uniseg"
inherit gosrc
inherit nativesdk
