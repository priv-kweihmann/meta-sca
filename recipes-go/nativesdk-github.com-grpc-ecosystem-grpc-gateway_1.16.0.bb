SUMMARY = "go.mod: github.com/grpc-ecosystem/grpc-gateway"
HOMEPAGE = "https://pkg.go.dev/github.com/grpc-ecosystem/grpc-gateway"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-grpc-ecosystem-grpc-gateway-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-antihax-optional \
    nativesdk-github.com-ghodss-yaml \
    nativesdk-github.com-golang-glog \
    nativesdk-github.com-golang-protobuf \
    nativesdk-github.com-rogpeppe-fastuuid \
    nativesdk-golang.org-x-net \
    nativesdk-golang.org-x-oauth2 \
    nativesdk-golang.org-x-xerrors \
    nativesdk-google.golang.org-genproto \
    nativesdk-google.golang.org-grpc \
    nativesdk-gopkg.in-yaml.v2 \
"
GO_IMPORT = "github.com/grpc-ecosystem/grpc-gateway"
inherit gosrc
inherit nativesdk
