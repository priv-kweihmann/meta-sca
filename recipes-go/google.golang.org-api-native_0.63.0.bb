SUMMARY = "go.mod: google.golang.org/api"
HOMEPAGE = "https://pkg.go.dev/google.golang.org/api"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require google.golang.org-api-sources.inc

EXTRA_DEPENDS += "\
    cloud.google.com-go-native \
    github.com-googleapis-gax-go-v2-native \
    go.opencensus.io-native \
    golang.org-x-net-native \
    golang.org-x-oauth2-native \
    golang.org-x-sync-native \
    golang.org-x-sys-native \
    google.golang.org-appengine-native \
    google.golang.org-genproto-native \
    google.golang.org-grpc-native \
"

GO_IMPORT = "google.golang.org/api"

inherit gosrc
inherit native
