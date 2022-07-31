SUMMARY = "go.mod: github.com/yuin/goldmark"
HOMEPAGE = "https://pkg.go.dev/github.com/yuin/goldmark"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-yuin-goldmark-sources.inc

GO_IMPORT = "github.com/yuin/goldmark"
inherit gosrc
inherit nativesdk
