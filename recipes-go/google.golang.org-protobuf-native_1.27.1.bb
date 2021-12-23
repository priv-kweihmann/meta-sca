SUMMARY = "go.mod: google.golang.org/protobuf"
HOMEPAGE = "https://pkg.go.dev/google.golang.org/protobuf"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require google.golang.org-protobuf-sources.inc

EXTRA_DEPENDS += "\
    github.com-golang-protobuf-native \
    github.com-google-go-cmp-native \
"

GO_IMPORT = "google.golang.org/protobuf"

# needs CGO
do_compile[noexec] = "1"

inherit gosrc
inherit native
