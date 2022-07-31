SUMMARY = "go.mod: github.com/lyft/protoc-gen-star"
HOMEPAGE = "https://pkg.go.dev/github.com/lyft/protoc-gen-star"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-lyft-protoc-gen-star-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-golang-protobuf \
    nativesdk-github.com-spf13-afero \
    nativesdk-google.golang.org-protobuf \
"
GO_IMPORT = "github.com/lyft/protoc-gen-star"
inherit gosrc
inherit nativesdk
