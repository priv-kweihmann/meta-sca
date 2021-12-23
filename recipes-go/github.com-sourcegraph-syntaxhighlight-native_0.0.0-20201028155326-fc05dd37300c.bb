SUMMARY = "go.mod: github.com/sourcegraph/syntaxhighlight"
HOMEPAGE = "https://pkg.go.dev/github.com/sourcegraph/syntaxhighlight"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-sourcegraph-syntaxhighlight-sources.inc

EXTRA_DEPENDS += "\
    github.com-sourcegraph-annotate-native \
"

GO_IMPORT = "github.com/sourcegraph/syntaxhighlight"

inherit gosrc
inherit native
