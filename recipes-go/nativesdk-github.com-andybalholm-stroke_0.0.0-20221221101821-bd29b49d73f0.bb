SUMMARY = "go.mod: github.com/andybalholm/stroke"
HOMEPAGE = "https://pkg.go.dev/github.com/andybalholm/stroke"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-andybalholm-stroke-sources.inc

GO_IMPORT = "github.com/andybalholm/stroke"
inherit gosrc
inherit nativesdk
