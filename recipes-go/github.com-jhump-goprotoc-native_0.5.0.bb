SUMMARY = "go.mod: github.com/jhump/goprotoc"
HOMEPAGE = "https://pkg.go.dev/github.com/jhump/goprotoc"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-jhump-goprotoc-sources.inc

EXTRA_DEPENDS += "\
    github.com-golang-protobuf-native \
    github.com-jhump-gopoet-native \
    github.com-jhump-protoreflect-native \
    golang.org-x-sync-native \
    google.golang.org-protobuf-native \
    gopkg.in-yaml.v2-native \
"

GO_IMPORT = "github.com/jhump/goprotoc"

inherit gosrc
inherit native
