SUMMARY = "go.mod: github.com/gin-gonic/gin"
HOMEPAGE = "https://pkg.go.dev/github.com/gin-gonic/gin"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gin-gonic-gin-sources.inc

EXTRA_DEPENDS += "\
    github.com-gin-contrib-sse-native \
    github.com-go-playground-validator-v10-native \
    github.com-golang-protobuf-native \
    github.com-json-iterator-go-native \
    github.com-mattn-go-isatty-native \
    github.com-stretchr-testify-native \
    github.com-ugorji-go-codec-native \
    gopkg.in-yaml.v2-native \
"

GO_IMPORT = "github.com/gin-gonic/gin"

inherit gosrc
inherit native
