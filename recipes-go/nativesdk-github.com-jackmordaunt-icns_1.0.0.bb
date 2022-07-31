SUMMARY = "go.mod: github.com/jackmordaunt/icns"
HOMEPAGE = "https://pkg.go.dev/github.com/jackmordaunt/icns"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-jackmordaunt-icns-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-nfnt-resize \
    nativesdk-github.com-pkg-errors \
    nativesdk-github.com-spf13-afero \
    nativesdk-github.com-spf13-pflag \
"
GO_IMPORT = "github.com/jackmordaunt/icns"
inherit gosrc
inherit nativesdk
