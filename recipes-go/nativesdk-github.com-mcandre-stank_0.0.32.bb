SUMMARY = "go.mod: github.com/mcandre/stank"
HOMEPAGE = "https://pkg.go.dev/github.com/mcandre/stank"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-mcandre-stank-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-magefile-mage \
    nativesdk-github.com-mcandre-mage-extras \
    nativesdk-mvdan.cc-sh-v3 \
"

GO_IMPORT = "github.com/mcandre/stank"

inherit gosrc
inherit_defer nativesdk
