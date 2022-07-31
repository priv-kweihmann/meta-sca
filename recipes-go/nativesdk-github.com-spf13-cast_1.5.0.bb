SUMMARY = "go.mod: github.com/spf13/cast"
HOMEPAGE = "https://pkg.go.dev/github.com/spf13/cast"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-spf13-cast-sources.inc

GO_IMPORT = "github.com/spf13/cast"
inherit gosrc
inherit nativesdk
