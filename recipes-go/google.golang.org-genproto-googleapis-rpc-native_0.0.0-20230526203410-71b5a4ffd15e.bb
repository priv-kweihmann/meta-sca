SUMMARY = "go.mod: google.golang.org/genproto/googleapis/rpc"
HOMEPAGE = "https://pkg.go.dev/google.golang.org/genproto/googleapis/rpc"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require google.golang.org-genproto-googleapis-rpc-sources.inc

EXTRA_DEPENDS += "\
    google.golang.org-genproto-native \
    google.golang.org-protobuf-native \
"

GO_IMPORT = "google.golang.org/genproto/googleapis/rpc"

inherit gosrc
inherit native
