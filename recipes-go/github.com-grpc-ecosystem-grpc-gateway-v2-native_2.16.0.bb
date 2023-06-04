SUMMARY = "go.mod: github.com/grpc-ecosystem/grpc-gateway/v2"
HOMEPAGE = "https://pkg.go.dev/github.com/grpc-ecosystem/grpc-gateway/v2"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-grpc-ecosystem-grpc-gateway-v2-sources.inc

EXTRA_DEPENDS += "\
    github.com-antihax-optional-native \
    github.com-golang-glog-native \
    github.com-golang-protobuf-native \
    github.com-google-go-cmp-native \
    github.com-rogpeppe-fastuuid-native \
    golang.org-x-oauth2-native \
    golang.org-x-text-native \
    google.golang.org-genproto-googleapis-api-native \
    google.golang.org-genproto-googleapis-rpc-native \
    google.golang.org-grpc-native \
    google.golang.org-protobuf-native \
    gopkg.in-yaml.v3-native \
"

GO_IMPORT = "github.com/grpc-ecosystem/grpc-gateway/v2"

inherit gosrc
inherit native
