SUMMARY = "go.mod: github.com/bgentry/speakeasy"
HOMEPAGE = "https://pkg.go.dev/github.com/bgentry/speakeasy"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-bgentry-speakeasy-sources.inc

GO_IMPORT = "github.com/bgentry/speakeasy"
inherit gosrc
inherit nativesdk
