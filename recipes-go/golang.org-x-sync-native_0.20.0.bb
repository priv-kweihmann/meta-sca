SUMMARY = "go.mod: golang.org/x/sync"
HOMEPAGE = "https://pkg.go.dev/golang.org/x/sync"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require golang.org-x-sync-sources.inc

GO_IMPORT = "golang.org/x/sync"

inherit gosrc
inherit_defer native
