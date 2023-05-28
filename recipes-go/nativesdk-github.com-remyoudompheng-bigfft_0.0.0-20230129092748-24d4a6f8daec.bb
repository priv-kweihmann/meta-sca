SUMMARY = "go.mod: github.com/remyoudompheng/bigfft"
HOMEPAGE = "https://pkg.go.dev/github.com/remyoudompheng/bigfft"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-remyoudompheng-bigfft-sources.inc

GO_IMPORT = "github.com/remyoudompheng/bigfft"
inherit gosrc
inherit nativesdk
