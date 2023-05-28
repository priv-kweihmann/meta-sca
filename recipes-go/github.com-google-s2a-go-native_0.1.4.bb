SUMMARY = "go.mod: github.com/google/s2a-go"
HOMEPAGE = "https://pkg.go.dev/github.com/google/s2a-go"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-google-s2a-go-sources.inc

EXTRA_DEPENDS += "\
    github.com-golang-protobuf-native \
    golang.org-x-crypto-native \
    google.golang.org-appengine-native \
    google.golang.org-grpc-native \
    google.golang.org-protobuf-native \
"

GO_IMPORT = "github.com/google/s2a-go"

inherit gosrc
inherit native
