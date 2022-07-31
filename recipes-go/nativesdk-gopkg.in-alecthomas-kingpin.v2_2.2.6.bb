SUMMARY = "go.mod: gopkg.in/alecthomas/kingpin.v2"
HOMEPAGE = "https://pkg.go.dev/gopkg.in/alecthomas/kingpin.v2"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require gopkg.in-alecthomas-kingpin.v2-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-alecthomas-template \
    nativesdk-github.com-alecthomas-units \
"
GO_IMPORT = "gopkg.in/alecthomas/kingpin.v2"
inherit gosrc
inherit nativesdk
