SUMMARY = "go.mod: google.golang.org/appengine"
HOMEPAGE = "https://pkg.go.dev/google.golang.org/appengine"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require google.golang.org-appengine-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-golang-protobuf \
    nativesdk-golang.org-x-net \
    nativesdk-golang.org-x-text \
"
GO_IMPORT = "google.golang.org/appengine"
inherit gosrc
inherit nativesdk
