SUMMARY = "go.mod: github.com/alecthomas/kingpin/v2"
HOMEPAGE = "https://pkg.go.dev/github.com/alecthomas/kingpin/v2"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-alecthomas-kingpin-v2-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-alecthomas-units \
    nativesdk-github.com-xhit-go-str2duration-v2 \
"
GO_IMPORT = "github.com/alecthomas/kingpin/v2"
inherit gosrc
inherit nativesdk
