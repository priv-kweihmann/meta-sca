SUMMARY = "go.mod: golang.org/x/oauth2"
HOMEPAGE = "https://pkg.go.dev/golang.org/x/oauth2"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require golang.org-x-oauth2-sources.inc

GO_IMPORT = "golang.org/x/oauth2"

inherit gosrc
inherit native
