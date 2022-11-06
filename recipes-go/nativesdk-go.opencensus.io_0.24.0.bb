SUMMARY = "go.mod: go.opencensus.io"
HOMEPAGE = "https://pkg.go.dev/go.opencensus.io"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require go.opencensus.io-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-golang-groupcache \
    nativesdk-github.com-golang-protobuf \
    nativesdk-github.com-google-go-cmp \
    nativesdk-golang.org-x-net \
    nativesdk-google.golang.org-grpc \
"
GO_IMPORT = "go.opencensus.io"
inherit gosrc
inherit nativesdk
