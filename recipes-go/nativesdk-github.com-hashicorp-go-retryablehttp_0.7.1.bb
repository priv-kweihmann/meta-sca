SUMMARY = "go.mod: github.com/hashicorp/go-retryablehttp"
HOMEPAGE = "https://pkg.go.dev/github.com/hashicorp/go-retryablehttp"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-hashicorp-go-retryablehttp-sources.inc

EXTRA_DEPENDS += "nativesdk-github.com-hashicorp-go-cleanhttp"
GO_IMPORT = "github.com/hashicorp/go-retryablehttp"
inherit gosrc
inherit nativesdk
