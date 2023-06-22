SUMMARY = "go.mod: cloud.google.com/go/spanner"
HOMEPAGE = "https://pkg.go.dev/cloud.google.com/go/spanner"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require cloud.google.com-go-spanner-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-cloud.google.com-go \
    nativesdk-cloud.google.com-go-iam \
    nativesdk-cloud.google.com-go-longrunning \
    nativesdk-github.com-golang-protobuf \
    nativesdk-github.com-googleapis-gax-go-v2 \
    nativesdk-go.opencensus.io \
    nativesdk-golang.org-x-xerrors \
    nativesdk-google.golang.org-api \
    nativesdk-google.golang.org-genproto \
    nativesdk-google.golang.org-genproto-googleapis-api \
    nativesdk-google.golang.org-genproto-googleapis-rpc \
    nativesdk-google.golang.org-grpc \
    nativesdk-google.golang.org-protobuf \
"
GO_IMPORT = "cloud.google.com/go/spanner"
inherit gosrc
inherit nativesdk
