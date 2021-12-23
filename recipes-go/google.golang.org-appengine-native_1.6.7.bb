SUMMARY = "go.mod: google.golang.org/appengine"
HOMEPAGE = "https://pkg.go.dev/google.golang.org/appengine"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require google.golang.org-appengine-sources.inc

EXTRA_DEPENDS += "\
    github.com-golang-protobuf-native \
    golang.org-x-net-native \
    golang.org-x-text-native \
"

GO_IMPORT = "google.golang.org/appengine"

inherit gosrc
inherit native
