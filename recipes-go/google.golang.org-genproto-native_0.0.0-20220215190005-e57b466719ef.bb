SUMMARY = "go.mod: google.golang.org/genproto"
HOMEPAGE = "https://pkg.go.dev/google.golang.org/genproto"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require google.golang.org-genproto-sources.inc

EXTRA_DEPENDS += "\
    github.com-golang-protobuf-native \
    google.golang.org-grpc-native \
    google.golang.org-protobuf-native \
"

GO_IMPORT = "google.golang.org/genproto"

inherit gosrc
inherit native
