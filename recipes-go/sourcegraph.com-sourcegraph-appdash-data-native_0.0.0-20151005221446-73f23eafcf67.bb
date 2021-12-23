SUMMARY = "go.mod: sourcegraph.com/sourcegraph/appdash-data"
HOMEPAGE = "https://pkg.go.dev/sourcegraph.com/sourcegraph/appdash-data"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require sourcegraph.com-sourcegraph-appdash-data-sources.inc

GO_IMPORT = "sourcegraph.com/sourcegraph/appdash-data"

inherit gosrc
inherit native
