SUMMARY = "go.mod: github.com/minio/asm2plan9s"
HOMEPAGE = "https://pkg.go.dev/github.com/minio/asm2plan9s"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-minio-asm2plan9s-sources.inc

GO_IMPORT = "github.com/minio/asm2plan9s"
inherit gosrc
inherit nativesdk
