SUMMARY = "go.mod: modernc.org/mathutil"
HOMEPAGE = "https://pkg.go.dev/modernc.org/mathutil"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require modernc.org-mathutil-sources.inc

EXTRA_DEPENDS += "nativesdk-github.com-remyoudompheng-bigfft"
GO_IMPORT = "modernc.org/mathutil"
inherit gosrc
inherit nativesdk
