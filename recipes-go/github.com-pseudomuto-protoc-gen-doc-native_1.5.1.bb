SUMMARY = "go.mod: github.com/pseudomuto/protoc-gen-doc"
HOMEPAGE = "https://pkg.go.dev/github.com/pseudomuto/protoc-gen-doc"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-pseudomuto-protoc-gen-doc-sources.inc

EXTRA_DEPENDS += "\
    github.com-envoyproxy-protoc-gen-validate-native \
    github.com-golang-protobuf-native \
    github.com-masterminds-sprig-native \
    github.com-mwitkow-go-proto-validators-native \
    github.com-pseudomuto-protokit-native \
    google.golang.org-genproto-native \
"

GO_IMPORT = "github.com/pseudomuto/protoc-gen-doc"

inherit gosrc
inherit native
