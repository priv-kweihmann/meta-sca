SUMMARY = "go.mod: github.com/googleapis/gax-go/v2"
HOMEPAGE = "https://pkg.go.dev/github.com/googleapis/gax-go/v2"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-googleapis-gax-go-v2-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-google.golang.org-api \
    nativesdk-google.golang.org-genproto-googleapis-rpc \
    nativesdk-google.golang.org-grpc \
    nativesdk-google.golang.org-protobuf \
"
GO_IMPORT = "github.com/googleapis/gax-go/v2"
inherit gosrc
inherit nativesdk
