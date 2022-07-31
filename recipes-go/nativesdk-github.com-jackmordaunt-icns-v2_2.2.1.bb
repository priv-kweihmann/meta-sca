SUMMARY = "go.mod: github.com/jackmordaunt/icns/v2"
HOMEPAGE = "https://pkg.go.dev/github.com/jackmordaunt/icns/v2"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-jackmordaunt-icns-v2-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-nfnt-resize \
    nativesdk-github.com-spf13-afero \
    nativesdk-github.com-spf13-pflag \
"
GO_IMPORT = "github.com/jackmordaunt/icns/v2"
inherit gosrc
inherit nativesdk
