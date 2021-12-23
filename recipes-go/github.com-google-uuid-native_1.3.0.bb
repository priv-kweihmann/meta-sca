SUMMARY = "go.mod: github.com/google/uuid"
HOMEPAGE = "https://pkg.go.dev/github.com/google/uuid"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-google-uuid-sources.inc

GO_IMPORT = "github.com/google/uuid"

inherit gosrc
inherit native
