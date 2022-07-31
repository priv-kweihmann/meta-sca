SUMMARY = "go.mod: github.com/google/martian/v3"
HOMEPAGE = "https://pkg.go.dev/github.com/google/martian/v3"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-google-martian-v3-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-golang-snappy \
    nativesdk-golang.org-x-net \
    nativesdk-google.golang.org-grpc \
    nativesdk-google.golang.org-protobuf \
"
GO_IMPORT = "github.com/google/martian/v3"
inherit gosrc
inherit nativesdk
