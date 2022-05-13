SUMMARY = "go.mod: github.com/HdrHistogram/hdrhistogram-go"
HOMEPAGE = "https://pkg.go.dev/github.com/HdrHistogram/hdrhistogram-go"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-hdrhistogram-hdrhistogram-go-sources.inc

GO_IMPORT = "github.com/HdrHistogram/hdrhistogram-go"

UPSTREAM_CHECK_GITTAGREGEX = "v(?P<pver>\d+\.\d+\.\d+)"

inherit gosrc
inherit native
