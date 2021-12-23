SUMMARY = "go.mod: github.com/pborman/getopt/v2"
HOMEPAGE = "https://pkg.go.dev/github.com/pborman/getopt/v2"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-pborman-getopt-v2-sources.inc

GO_IMPORT = "github.com/pborman/getopt/v2"

UPSTREAM_CHECK_URI = "https://github.com/pborman/getopt/tags"
UPSTREAM_CHECK_REGEX = "releases/tag/v(?P<pver>\d+\.\d+\.\d+)"

inherit gosrc
inherit native
