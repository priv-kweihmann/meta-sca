SUMMARY = "go.mod: github.com/google/go-pkcs11"
HOMEPAGE = "https://pkg.go.dev/github.com/google/go-pkcs11"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-google-go-pkcs11-sources.inc

GO_IMPORT = "github.com/google/go-pkcs11"
inherit gosrc
inherit nativesdk
