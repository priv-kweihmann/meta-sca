SUMMARY = "go.mod: github.com/DataDog/datadog-go"
HOMEPAGE = "https://pkg.go.dev/github.com/DataDog/datadog-go"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-datadog-datadog-go-sources.inc

GO_IMPORT = "github.com/DataDog/datadog-go"

UPSTREAM_CHECK_GITTAGREGEX = "v(?P<pver>\d+\.\d+.\d+)"

inherit gosrc
inherit native
