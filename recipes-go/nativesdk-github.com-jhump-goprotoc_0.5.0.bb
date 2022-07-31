SUMMARY = "go.mod: github.com/jhump/goprotoc"
HOMEPAGE = "https://pkg.go.dev/github.com/jhump/goprotoc"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-jhump-goprotoc-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-golang-protobuf \
    nativesdk-github.com-jhump-gopoet \
    nativesdk-github.com-jhump-protoreflect \
    nativesdk-golang.org-x-sync \
    nativesdk-google.golang.org-protobuf \
    nativesdk-gopkg.in-yaml.v2 \
"
GO_IMPORT = "github.com/jhump/goprotoc"
inherit gosrc
inherit nativesdk
