SUMMARY = "go.mod: github.com/spf13/jwalterweatherman"
HOMEPAGE = "https://pkg.go.dev/github.com/spf13/jwalterweatherman"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-spf13-jwalterweatherman-sources.inc

GO_IMPORT = "github.com/spf13/jwalterweatherman"
inherit gosrc
inherit nativesdk
