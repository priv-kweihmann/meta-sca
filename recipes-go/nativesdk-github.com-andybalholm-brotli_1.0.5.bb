SUMMARY = "go.mod: github.com/andybalholm/brotli"
HOMEPAGE = "https://pkg.go.dev/github.com/andybalholm/brotli"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-andybalholm-brotli-sources.inc

GO_IMPORT = "github.com/andybalholm/brotli"
inherit gosrc
inherit nativesdk
