SUMMARY = "go.mod: github.com/opentracing-contrib/go-observer"
HOMEPAGE = "https://pkg.go.dev/github.com/opentracing-contrib/go-observer"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-opentracing-contrib-go-observer-sources.inc

EXTRA_DEPENDS += "\
    github.com-opentracing-opentracing-go-native \
"

GO_IMPORT = "github.com/opentracing-contrib/go-observer"

inherit gosrc
inherit native
