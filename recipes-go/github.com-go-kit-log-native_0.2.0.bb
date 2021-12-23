SUMMARY = "go.mod: github.com/go-kit/log"
HOMEPAGE = "https://pkg.go.dev/github.com/go-kit/log"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-go-kit-log-sources.inc

EXTRA_DEPENDS += "\
    github.com-go-logfmt-logfmt-native \
"

GO_IMPORT = "github.com/go-kit/log"

inherit gosrc
inherit native
