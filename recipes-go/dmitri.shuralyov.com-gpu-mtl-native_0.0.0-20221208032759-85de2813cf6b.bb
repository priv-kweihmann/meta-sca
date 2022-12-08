SUMMARY = "go.mod: dmitri.shuralyov.com/gpu/mtl"
HOMEPAGE = "https://pkg.go.dev/dmitri.shuralyov.com/gpu/mtl"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require dmitri.shuralyov.com-gpu-mtl-sources.inc

GO_IMPORT = "dmitri.shuralyov.com/gpu/mtl"

# not a compileable package
do_compile[noexec] = "1"

inherit gosrc
inherit native
