SUMMARY = "go.mod: github.com/grpc-ecosystem/grpc-gateway/v2"
HOMEPAGE = "https://pkg.go.dev/github.com/grpc-ecosystem/grpc-gateway/v2"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-grpc-ecosystem-grpc-gateway-v2-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-antihax-optional \
    nativesdk-github.com-golang-glog \
    nativesdk-github.com-golang-protobuf \
    nativesdk-github.com-google-go-cmp \
    nativesdk-github.com-rogpeppe-fastuuid \
    nativesdk-golang.org-x-oauth2 \
    nativesdk-golang.org-x-text \
    nativesdk-google.golang.org-genproto-googleapis-api \
    nativesdk-google.golang.org-genproto-googleapis-rpc \
    nativesdk-google.golang.org-grpc \
    nativesdk-google.golang.org-protobuf \
    nativesdk-gopkg.in-yaml.v3 \
"
GO_IMPORT = "github.com/grpc-ecosystem/grpc-gateway/v2"
inherit gosrc
inherit nativesdk
