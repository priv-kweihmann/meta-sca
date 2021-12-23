SUMMARY = "go.mod: github.com/codahale/hdrhistogram"
HOMEPAGE = "https://pkg.go.dev/github.com/codahale/hdrhistogram"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-codahale-hdrhistogram-sources.inc

GO_IMPORT = "github.com/codahale/hdrhistogram"

UPSTREAM_CHECK_GITHUB_TAGS = "1"

inherit gosrc
inherit native
