SUMMARY = "go.mod: github.com/jdkato/prose"
HOMEPAGE = "https://pkg.go.dev/github.com/jdkato/prose"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-jdkato-prose-sources.inc

EXTRA_DEPENDS += "\
    github.com-montanaflynn-stats-native \
    github.com-shogo82148-go-shuffle-native \
    gopkg.in-neurosnap-sentences.v1-native \
"

GO_IMPORT = "github.com/jdkato/prose"

inherit gosrc
inherit native
