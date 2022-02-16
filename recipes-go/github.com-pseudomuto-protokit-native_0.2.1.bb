SUMMARY = "go.mod: github.com/pseudomuto/protokit"
HOMEPAGE = "https://pkg.go.dev/github.com/pseudomuto/protokit"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-pseudomuto-protokit-sources.inc

EXTRA_DEPENDS += "\
    github.com-golang-protobuf-native \
    google.golang.org-genproto-native \
"

GO_IMPORT = "github.com/pseudomuto/protokit"

# needs CGO
do_compile[noexec] = "1"

inherit gosrc
inherit native
