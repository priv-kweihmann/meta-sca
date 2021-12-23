SUMMARY = "go.mod: github.com/pkg/errors"
HOMEPAGE = "https://pkg.go.dev/github.com/pkg/errors"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-pkg-errors-sources.inc

GO_IMPORT = "github.com/pkg/errors"

inherit gosrc
inherit native
