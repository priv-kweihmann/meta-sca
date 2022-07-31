SUMMARY = "go.mod: cloud.google.com/go/datastore"
HOMEPAGE = "https://pkg.go.dev/cloud.google.com/go/datastore"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require cloud.google.com-go-datastore-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-cloud.google.com-go \
    nativesdk-github.com-golang-protobuf \
    nativesdk-github.com-googleapis-gax-go-v2 \
    nativesdk-google.golang.org-api \
    nativesdk-google.golang.org-genproto \
    nativesdk-google.golang.org-grpc \
    nativesdk-google.golang.org-protobuf \
"
GO_IMPORT = "cloud.google.com/go/datastore"
inherit gosrc
inherit nativesdk
