SUMMARY = "go.mod: google.golang.org/protobuf"
HOMEPAGE = "https://pkg.go.dev/google.golang.org/protobuf"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require google.golang.org-protobuf-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-golang-protobuf \
    nativesdk-github.com-google-go-cmp \
"
GO_IMPORT = "google.golang.org/protobuf"
# needs CGO
do_compile[noexec] = "1"
inherit gosrc
inherit nativesdk
