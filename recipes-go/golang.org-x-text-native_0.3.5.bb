SUMMARY = "go.mod: golang.org/x/text"
HOMEPAGE = "https://pkg.go.dev/golang.org/x/text"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require golang.org-x-text-sources.inc

GO_IMPORT = "golang.org/x/text"

inherit gosrc
inherit native
