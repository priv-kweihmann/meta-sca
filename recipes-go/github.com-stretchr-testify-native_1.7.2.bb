SUMMARY = "go.mod: github.com/stretchr/testify"
HOMEPAGE = "https://pkg.go.dev/github.com/stretchr/testify"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-stretchr-testify-sources.inc

EXTRA_DEPENDS += "\
    github.com-davecgh-go-spew-native \
    github.com-pmezard-go-difflib-native \
    github.com-stretchr-objx-native \
    gopkg.in-yaml.v3-native \
"

GO_IMPORT = "github.com/stretchr/testify"

inherit gosrc
inherit native
