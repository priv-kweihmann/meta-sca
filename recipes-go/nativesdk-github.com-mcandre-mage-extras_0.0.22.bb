SUMMARY = "go.mod: github.com/mcandre/mage-extras"
HOMEPAGE = "https://pkg.go.dev/github.com/mcandre/mage-extras"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-mcandre-mage-extras-sources.inc

EXTRA_DEPENDS += "nativesdk-github.com-magefile-mage"

GO_IMPORT = "github.com/mcandre/mage-extras"

inherit gosrc
inherit_defer nativesdk
