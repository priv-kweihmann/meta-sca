SUMMARY = "go.mod: cloud.google.com/go/texttospeech"
HOMEPAGE = "https://pkg.go.dev/cloud.google.com/go/texttospeech"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require cloud.google.com-go-texttospeech-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-cloud.google.com-go-longrunning \
    nativesdk-github.com-googleapis-gax-go-v2 \
    nativesdk-google.golang.org-api \
    nativesdk-google.golang.org-genproto \
    nativesdk-google.golang.org-genproto-googleapis-api \
    nativesdk-google.golang.org-grpc \
    nativesdk-google.golang.org-protobuf \
"
GO_IMPORT = "cloud.google.com/go/texttospeech"
inherit gosrc
inherit nativesdk
