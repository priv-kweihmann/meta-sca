SUMMARY = "go.mod: github.com/acomagu/bufpipe"
HOMEPAGE = "https://pkg.go.dev/github.com/acomagu/bufpipe"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-acomagu-bufpipe-sources.inc

GO_IMPORT = "github.com/acomagu/bufpipe"

inherit gosrc
inherit native
