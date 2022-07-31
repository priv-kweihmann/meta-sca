SUMMARY = "go.mod: github.com/envoyproxy/protoc-gen-validate"
HOMEPAGE = "https://pkg.go.dev/github.com/envoyproxy/protoc-gen-validate"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-envoyproxy-protoc-gen-validate-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-iancoleman-strcase \
    nativesdk-github.com-lyft-protoc-gen-star \
    nativesdk-github.com-spf13-afero \
    nativesdk-golang.org-x-lint \
    nativesdk-golang.org-x-mod \
    nativesdk-golang.org-x-net \
    nativesdk-golang.org-x-sys \
    nativesdk-golang.org-x-text \
    nativesdk-golang.org-x-tools \
    nativesdk-google.golang.org-protobuf \
"
GO_IMPORT = "github.com/envoyproxy/protoc-gen-validate"
inherit gosrc
inherit nativesdk
