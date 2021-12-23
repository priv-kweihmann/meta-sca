SUMMARY = "go.mod: github.com/gobuffalo/github_flavored_markdown"
HOMEPAGE = "https://pkg.go.dev/github.com/gobuffalo/github_flavored_markdown"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gobuffalo-github-flavored-markdown-sources.inc

EXTRA_DEPENDS += "\
    github.com-microcosm-cc-bluemonday-native \
    github.com-sergi-go-diff-native \
    github.com-sourcegraph-annotate-native \
    github.com-sourcegraph-syntaxhighlight-native \
    golang.org-x-net-native \
"

GO_IMPORT = "github.com/gobuffalo/github_flavored_markdown"

inherit gosrc
inherit native
