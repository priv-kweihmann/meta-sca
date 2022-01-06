SUMMARY = "go.mod: github.com/googleapis/google-cloud-go-testing"
HOMEPAGE = "https://pkg.go.dev/github.com/googleapis/google-cloud-go-testing"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-googleapis-google-cloud-go-testing-sources.inc

EXTRA_DEPENDS += "\
    cloud.google.com-go-bigquery-native \
    cloud.google.com-go-datastore-native \
    cloud.google.com-go-native \
    golang.org-x-lint-native \
    golang.org-x-tools-native \
    google.golang.org-api-native \
    honnef.co-go-tools-native \
"

GO_IMPORT = "github.com/googleapis/google-cloud-go-testing"

inherit gosrc
inherit native
