SUMMARY = "go.mod: github.com/googleapis/google-cloud-go-testing"
HOMEPAGE = "https://pkg.go.dev/github.com/googleapis/google-cloud-go-testing"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-googleapis-google-cloud-go-testing-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-cloud.google.com-go \
    nativesdk-cloud.google.com-go-bigquery \
    nativesdk-cloud.google.com-go-datastore \
    nativesdk-golang.org-x-lint \
    nativesdk-golang.org-x-tools \
    nativesdk-google.golang.org-api \
    nativesdk-honnef.co-go-tools \
"
GO_IMPORT = "github.com/googleapis/google-cloud-go-testing"
inherit gosrc
inherit nativesdk
