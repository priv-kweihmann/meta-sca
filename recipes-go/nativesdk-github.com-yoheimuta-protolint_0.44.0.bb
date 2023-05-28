SUMMARY = "go.mod: github.com/yoheimuta/protolint"
HOMEPAGE = "https://pkg.go.dev/github.com/yoheimuta/protolint"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-yoheimuta-protolint-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-chavacava-garif \
    nativesdk-github.com-gertd-go-pluralize \
    nativesdk-github.com-golang-protobuf \
    nativesdk-github.com-hashicorp-go-hclog \
    nativesdk-github.com-hashicorp-go-plugin \
    nativesdk-github.com-yoheimuta-go-protoparser-v4 \
    nativesdk-google.golang.org-grpc \
    nativesdk-google.golang.org-protobuf \
    nativesdk-gopkg.in-yaml.v2 \
"
GO_IMPORT = "github.com/yoheimuta/protolint"
inherit gosrc
inherit nativesdk
