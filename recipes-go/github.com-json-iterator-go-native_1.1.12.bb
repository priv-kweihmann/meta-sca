SUMMARY = "go.mod: github.com/json-iterator/go"
HOMEPAGE = "https://pkg.go.dev/github.com/json-iterator/go"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-json-iterator-go-sources.inc

EXTRA_DEPENDS += "\
    github.com-modern-go-concurrent-native \
    github.com-modern-go-reflect2-native \
"

GO_IMPORT = "github.com/json-iterator/go"

inherit gosrc
inherit native
