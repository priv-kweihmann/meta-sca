SUMMARY = "go.mod: google.golang.org/genproto/googleapis/bytestream"
HOMEPAGE = "https://pkg.go.dev/google.golang.org/genproto/googleapis/bytestream"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require google.golang.org-genproto-googleapis-bytestream-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-google.golang.org-genproto \
    nativesdk-google.golang.org-genproto-googleapis-api \
    nativesdk-google.golang.org-grpc \
    nativesdk-google.golang.org-protobuf \
"
GO_IMPORT = "google.golang.org/genproto/googleapis/bytestream"
inherit gosrc
inherit nativesdk
