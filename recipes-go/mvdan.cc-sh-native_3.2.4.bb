SUMMARY = "go.mod: mvdan.cc/sh"
HOMEPAGE = "https://pkg.go.dev/mvdan.cc/sh"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require mvdan.cc-sh-sources.inc

GO_IMPORT = "mvdan.cc/sh"

UPSTREAM_CHECK_URI = "https://github.com/mvdan/sh/tags"
UPSTREAM_CHECK_REGEX = "releases/tag/v(?P<pver>\d+\.\d+\.\d+)"

inherit gosrc
inherit native
