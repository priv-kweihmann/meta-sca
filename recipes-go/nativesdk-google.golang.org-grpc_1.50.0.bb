SUMMARY = "go.mod: google.golang.org/grpc"
HOMEPAGE = "https://pkg.go.dev/google.golang.org/grpc"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require google.golang.org-grpc-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-cespare-xxhash-v2 \
    nativesdk-github.com-cncf-udpa-go \
    nativesdk-github.com-cncf-xds-go \
    nativesdk-github.com-envoyproxy-go-control-plane \
    nativesdk-github.com-golang-glog \
    nativesdk-github.com-golang-protobuf \
    nativesdk-github.com-google-go-cmp \
    nativesdk-github.com-google-uuid \
    nativesdk-golang.org-x-net \
    nativesdk-golang.org-x-oauth2 \
    nativesdk-golang.org-x-sys \
    nativesdk-google.golang.org-genproto \
    nativesdk-google.golang.org-protobuf \
"
GO_IMPORT = "google.golang.org/grpc"
# version is somehow broken
do_compile[noexec] = "1"
inherit gosrc
inherit nativesdk
