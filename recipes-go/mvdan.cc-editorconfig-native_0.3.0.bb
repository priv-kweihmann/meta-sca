SUMMARY = "go.mod: mvdan.cc/editorconfig"
HOMEPAGE = "https://pkg.go.dev/mvdan.cc/editorconfig"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require mvdan.cc-editorconfig-sources.inc

GO_IMPORT = "mvdan.cc/editorconfig"

inherit gosrc
inherit_defer native
