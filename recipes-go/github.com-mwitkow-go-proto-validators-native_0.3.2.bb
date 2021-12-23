SUMMARY = "go.mod: github.com/mwitkow/go-proto-validators"
HOMEPAGE = "https://pkg.go.dev/github.com/mwitkow/go-proto-validators"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-mwitkow-go-proto-validators-sources.inc

EXTRA_DEPENDS += "\
    github.com-gogo-protobuf-native \
    github.com-golang-protobuf-native \
    github.com-stretchr-testify-native \
"

GO_IMPORT = "github.com/mwitkow/go-proto-validators"

inherit gosrc
inherit native
