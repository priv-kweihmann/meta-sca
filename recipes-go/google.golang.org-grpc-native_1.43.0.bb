SUMMARY = "go.mod: google.golang.org/grpc"
HOMEPAGE = "https://pkg.go.dev/google.golang.org/grpc"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require google.golang.org-grpc-sources.inc

EXTRA_DEPENDS += "\
    github.com-cespare-xxhash-v2-native \
    github.com-cncf-udpa-go-native \
    github.com-cncf-xds-go-native \
    github.com-envoyproxy-go-control-plane-native \
    github.com-golang-glog-native \
    github.com-golang-protobuf-native \
    github.com-google-go-cmp-native \
    github.com-google-uuid-native \
    golang.org-x-net-native \
    golang.org-x-oauth2-native \
    golang.org-x-sys-native \
    google.golang.org-genproto-native \
    google.golang.org-protobuf-native \
"

GO_IMPORT = "google.golang.org/grpc"

# version is somehow broken
do_compile[noexec] = "1"

inherit gosrc
inherit native
