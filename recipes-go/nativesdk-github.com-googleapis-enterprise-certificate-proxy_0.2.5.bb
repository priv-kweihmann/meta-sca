SUMMARY = "go.mod: github.com/googleapis/enterprise-certificate-proxy"
HOMEPAGE = "https://pkg.go.dev/github.com/googleapis/enterprise-certificate-proxy"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-googleapis-enterprise-certificate-proxy-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-google-go-pkcs11 \
    nativesdk-golang.org-x-crypto \
    nativesdk-golang.org-x-sys \
"
GO_IMPORT = "github.com/googleapis/enterprise-certificate-proxy"
inherit gosrc
inherit nativesdk
