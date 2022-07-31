SUMMARY = "go.mod: github.com/sagikazarmark/crypt"
HOMEPAGE = "https://pkg.go.dev/github.com/sagikazarmark/crypt"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-sagikazarmark-crypt-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-cloud.google.com-go-firestore \
    nativesdk-github.com-hashicorp-consul-api \
    nativesdk-github.com-pkg-errors \
    nativesdk-go.etcd.io-etcd-api-v3 \
    nativesdk-go.etcd.io-etcd-client-v2 \
    nativesdk-go.etcd.io-etcd-client-v3 \
    nativesdk-golang.org-x-crypto \
    nativesdk-google.golang.org-api \
    nativesdk-google.golang.org-grpc \
"
GO_IMPORT = "github.com/sagikazarmark/crypt"
inherit gosrc
inherit nativesdk
