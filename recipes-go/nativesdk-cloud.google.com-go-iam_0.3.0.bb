SUMMARY = "go.mod: cloud.google.com/go/iam"
HOMEPAGE = "https://pkg.go.dev/cloud.google.com/go/iam"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require cloud.google.com-go-iam-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-cloud.google.com-go \
    nativesdk-github.com-golang-protobuf \
    nativesdk-github.com-googleapis-gax-go-v2 \
    nativesdk-google.golang.org-api \
    nativesdk-google.golang.org-genproto \
    nativesdk-google.golang.org-grpc \
"
GO_IMPORT = "cloud.google.com/go/iam"
inherit gosrc
inherit nativesdk
