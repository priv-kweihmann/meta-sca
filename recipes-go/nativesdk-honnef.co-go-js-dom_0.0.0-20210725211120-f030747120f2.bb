SUMMARY = "go.mod: honnef.co/go/js/dom"
HOMEPAGE = "https://pkg.go.dev/honnef.co/go/js/dom"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require honnef.co-go-js-dom-sources.inc

EXTRA_DEPENDS += "nativesdk-github.com-gopherjs-gopherjs"
GO_IMPORT = "honnef.co/go/js/dom"
inherit gosrc
inherit nativesdk
