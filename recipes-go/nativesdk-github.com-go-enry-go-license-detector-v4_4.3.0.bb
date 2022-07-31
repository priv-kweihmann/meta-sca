SUMMARY = "go.mod: github.com/go-enry/go-license-detector/v4"
HOMEPAGE = "https://pkg.go.dev/github.com/go-enry/go-license-detector/v4"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-go-enry-go-license-detector-v4-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-ekzhu-minhash-lsh \
    nativesdk-github.com-go-git-go-git-v5 \
    nativesdk-github.com-hhatto-gorst \
    nativesdk-github.com-jdkato-prose \
    nativesdk-github.com-pkg-errors \
    nativesdk-github.com-russross-blackfriday-v2 \
    nativesdk-github.com-sergi-go-diff \
    nativesdk-github.com-spf13-pflag \
    nativesdk-golang.org-x-exp \
    nativesdk-golang.org-x-net \
    nativesdk-golang.org-x-text \
    nativesdk-gonum.org-v1-gonum \
"
GO_IMPORT = "github.com/go-enry/go-license-detector/v4"
inherit gosrc
inherit nativesdk
