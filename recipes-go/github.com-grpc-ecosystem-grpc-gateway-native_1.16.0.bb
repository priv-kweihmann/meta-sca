SUMMARY = "go.mod: github.com/grpc-ecosystem/grpc-gateway"
HOMEPAGE = "https://pkg.go.dev/github.com/grpc-ecosystem/grpc-gateway"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-grpc-ecosystem-grpc-gateway-sources.inc

EXTRA_DEPENDS += "\
    github.com-antihax-optional-native \
    github.com-ghodss-yaml-native \
    github.com-golang-glog-native \
    github.com-golang-protobuf-native \
    github.com-rogpeppe-fastuuid-native \
    golang.org-x-net-native \
    golang.org-x-oauth2-native \
    golang.org-x-xerrors-native \
    google.golang.org-genproto-native \
    google.golang.org-grpc-native \
    gopkg.in-yaml.v2-native \
"

GO_IMPORT = "github.com/grpc-ecosystem/grpc-gateway"

inherit gosrc
inherit native
