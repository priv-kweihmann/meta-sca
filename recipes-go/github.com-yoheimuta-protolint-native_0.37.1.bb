SUMMARY = "go.mod: github.com/yoheimuta/protolint"
HOMEPAGE = "https://pkg.go.dev/github.com/yoheimuta/protolint"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-yoheimuta-protolint-sources.inc

EXTRA_DEPENDS += "\
    github.com-gertd-go-pluralize-native \
    github.com-golang-protobuf-native \
    github.com-hashicorp-go-hclog-native \
    github.com-hashicorp-go-plugin-native \
    github.com-yoheimuta-go-protoparser-v4-native \
    google.golang.org-genproto-native \
    google.golang.org-grpc-native \
    gopkg.in-yaml.v2-native \
"

GO_IMPORT = "github.com/yoheimuta/protolint"

inherit gosrc
inherit native
