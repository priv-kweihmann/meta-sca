SUMMARY = "go.mod: github.com/go-git/go-git-fixtures/v4"
HOMEPAGE = "https://pkg.go.dev/github.com/go-git/go-git-fixtures/v4"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-go-git-go-git-fixtures-v4-sources.inc

EXTRA_DEPENDS += "\
    github.com-go-git-go-billy-v5-native \
    gopkg.in-check.v1-native \
"

GO_IMPORT = "github.com/go-git/go-git-fixtures/v4"

UPSTREAM_CHECK_URI = "https://github.com/go-git/go-git-fixtures/tags"
UPSTREAM_CHECK_REGEX = "releases/tag/v(?P<pver>4\.\d+\.\d+)"

inherit gosrc
inherit native
