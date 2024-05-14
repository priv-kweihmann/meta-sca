SUMMARY = "go.mod: github.com/magefile/mage"
HOMEPAGE = "https://pkg.go.dev/github.com/magefile/mage"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-magefile-mage-sources.inc

GO_IMPORT = "github.com/magefile/mage"
inherit gosrc
inherit_defer nativesdk
