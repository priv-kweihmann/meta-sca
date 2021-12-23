SUMMARY = "go.mod: golang.org/x/time"
HOMEPAGE = "https://pkg.go.dev/golang.org/x/time"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require golang.org-x-time-sources.inc

GO_IMPORT = "golang.org/x/time"

inherit gosrc
inherit native
