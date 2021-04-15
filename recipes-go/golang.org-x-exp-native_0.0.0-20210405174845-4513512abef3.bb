SUMMARY = "go.mod: golang.org/x/exp"
HOMEPAGE = "https://pkg.go.dev/golang.org/x/exp"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require golang.org-x-exp-sources.inc

GO_IMPORT = "golang.org/x/exp"

# needs GLES3/gl3.h
do_compile[noexec] = "1"

inherit gosrc
inherit native
