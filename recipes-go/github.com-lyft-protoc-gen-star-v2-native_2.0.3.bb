SUMMARY = "go.mod: github.com/lyft/protoc-gen-star/v2"
HOMEPAGE = "https://pkg.go.dev/github.com/lyft/protoc-gen-star/v2"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-lyft-protoc-gen-star-v2-sources.inc

EXTRA_DEPENDS += "\
    github.com-spf13-afero-native \
    golang.org-x-tools-native \
    google.golang.org-protobuf-native \
"

GO_IMPORT = "github.com/lyft/protoc-gen-star/v2"

inherit gosrc
inherit native
