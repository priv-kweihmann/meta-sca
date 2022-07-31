SUMMARY = "go.mod: google.golang.org/api"
HOMEPAGE = "https://pkg.go.dev/google.golang.org/api"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require google.golang.org-api-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-cloud.google.com-go-compute \
    nativesdk-github.com-google-uuid \
    nativesdk-github.com-googleapis-enterprise-certificate-proxy \
    nativesdk-github.com-googleapis-gax-go-v2 \
    nativesdk-go.opencensus.io \
    nativesdk-golang.org-x-net \
    nativesdk-golang.org-x-oauth2 \
    nativesdk-golang.org-x-sync \
    nativesdk-golang.org-x-sys \
    nativesdk-google.golang.org-appengine \
    nativesdk-google.golang.org-genproto \
    nativesdk-google.golang.org-grpc \
"
GO_IMPORT = "google.golang.org/api"
inherit gosrc
inherit nativesdk
