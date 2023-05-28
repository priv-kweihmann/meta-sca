SUMMARY = "go.mod: github.com/google/s2a-go"
HOMEPAGE = "https://pkg.go.dev/github.com/google/s2a-go"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-google-s2a-go-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-golang-protobuf \
    nativesdk-golang.org-x-crypto \
    nativesdk-google.golang.org-appengine \
    nativesdk-google.golang.org-grpc \
    nativesdk-google.golang.org-protobuf \
"
GO_IMPORT = "github.com/google/s2a-go"
inherit gosrc
inherit nativesdk
