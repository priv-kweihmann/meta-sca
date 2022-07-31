SUMMARY = "go.mod: github.com/spf13/afero"
HOMEPAGE = "https://pkg.go.dev/github.com/spf13/afero"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-spf13-afero-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-cloud.google.com-go-pubsub \
    nativesdk-cloud.google.com-go-storage \
    nativesdk-github.com-googleapis-google-cloud-go-testing \
    nativesdk-github.com-pkg-sftp \
    nativesdk-golang.org-x-text \
    nativesdk-google.golang.org-api \
"
GO_IMPORT = "github.com/spf13/afero"
inherit gosrc
inherit nativesdk
