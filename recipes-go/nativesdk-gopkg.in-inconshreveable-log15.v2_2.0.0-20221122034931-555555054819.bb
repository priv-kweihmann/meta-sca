SUMMARY = "go.mod: gopkg.in/inconshreveable/log15.v2"
HOMEPAGE = "https://pkg.go.dev/gopkg.in/inconshreveable/log15.v2"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require gopkg.in-inconshreveable-log15.v2-sources.inc

EXTRA_DEPENDS += "nativesdk-github.com-inconshreveable-log15"
GO_IMPORT = "gopkg.in/inconshreveable/log15.v2"
inherit gosrc
inherit nativesdk
