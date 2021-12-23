SUMMARY = "go.mod: github.com/iancoleman/strcase"
HOMEPAGE = "https://pkg.go.dev/github.com/iancoleman/strcase"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-iancoleman-strcase-sources.inc

GO_IMPORT = "github.com/iancoleman/strcase"

inherit gosrc
inherit native
