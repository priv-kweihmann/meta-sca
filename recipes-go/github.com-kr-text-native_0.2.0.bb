SUMMARY = "go.mod: github.com/kr/text"
HOMEPAGE = "https://pkg.go.dev/github.com/kr/text"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-kr-text-sources.inc

EXTRA_DEPENDS += "\
    github.com-creack-pty-native \
"

GO_IMPORT = "github.com/kr/text"

inherit gosrc
inherit native
