SUMMARY = "go.mod: google.golang.org/genproto"
HOMEPAGE = "https://pkg.go.dev/google.golang.org/genproto"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require google.golang.org-genproto-sources.inc

GO_IMPORT = "google.golang.org/genproto"

inherit gosrc
inherit native
