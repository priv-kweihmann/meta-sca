SUMMARY = "go.mod: github.com/op/go-logging"
HOMEPAGE = "https://pkg.go.dev/github.com/op/go-logging"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-op-go-logging-sources.inc

GO_IMPORT = "github.com/op/go-logging"

inherit gosrc
inherit native
