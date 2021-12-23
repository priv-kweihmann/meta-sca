SUMMARY = "go.mod: github.com/spf13/pflag"
HOMEPAGE = "https://pkg.go.dev/github.com/spf13/pflag"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-spf13-pflag-sources.inc

GO_IMPORT = "github.com/spf13/pflag"

inherit gosrc
inherit native
