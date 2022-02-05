SUMMARY = "go.mod: github.com/jhump/protoreflect"
HOMEPAGE = "https://pkg.go.dev/github.com/jhump/protoreflect"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-jhump-protoreflect-sources.inc

EXTRA_DEPENDS += "\
    github.com-golang-protobuf-native \
    golang.org-x-net-native \
    google.golang.org-genproto-native \
    google.golang.org-grpc-native \
    google.golang.org-protobuf-native \
"

GO_IMPORT = "github.com/jhump/protoreflect"

inherit gosrc
inherit native
