SUMMARY = "go.mod: github.com/stretchr/objx"
HOMEPAGE = "https://pkg.go.dev/github.com/stretchr/objx"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-stretchr-objx-sources.inc

GO_IMPORT = "github.com/stretchr/objx"

inherit gosrc
inherit native
