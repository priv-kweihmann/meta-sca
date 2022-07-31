SUMMARY = "go.mod: github.com/stretchr/testify"
HOMEPAGE = "https://pkg.go.dev/github.com/stretchr/testify"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-stretchr-testify-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-davecgh-go-spew \
    nativesdk-github.com-pmezard-go-difflib \
    nativesdk-github.com-stretchr-objx \
    nativesdk-gopkg.in-yaml.v3 \
"
GO_IMPORT = "github.com/stretchr/testify"
inherit gosrc
inherit nativesdk
