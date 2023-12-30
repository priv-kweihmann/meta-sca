SUMMARY = "go.mod: github.com/mcandre/zipc"
HOMEPAGE = "https://pkg.go.dev/github.com/mcandre/zipc"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-mcandre-zipc-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-jhoonb-archivex \
    nativesdk-github.com-magefile-mage \
    nativesdk-github.com-mcandre-mage-extras \
"
GO_IMPORT = "github.com/mcandre/zipc"
inherit gosrc
inherit nativesdk
