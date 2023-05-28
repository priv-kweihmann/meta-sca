SUMMARY = "go.mod: git.wow.st/gmp/jni"
HOMEPAGE = "https://pkg.go.dev/git.wow.st/gmp/jni"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require git.wow.st-gmp-jni-sources.inc

GO_IMPORT = "git.wow.st/gmp/jni"
# requires java headers
do_compile[noexec] = "1"
inherit gosrc
inherit nativesdk
