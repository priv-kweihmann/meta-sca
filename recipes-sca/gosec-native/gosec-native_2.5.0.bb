SUMMARY = "Golang security checker"
HOMEPAGE = "https://github.com/securego/gosec"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE.txt;md5=d3999b969cc50f5755737db7ce41ca2e"

DEPENDS += "\
            github.com-davecgh-go-spew-native \
            github.com-golang-protobuf-native \
            github.com-gookit-color-native \
            github.com-kr-pretty-native \
            github.com-lib-pq-native \
            github.com-mozilla-tls-observatory-native \
            github.com-nbutton23-zxcvbn-go-native \
            github.com-onsi-ginkgo-native \
            github.com-onsi-gomega-native \
            github.com-ryanuber-go-glob-native \
            github.com-stretchr-testify-native \
            golang.org-x-net-native \
            golang.org-x-sys-native \
            golang.org-x-tools-native \
            gopkg.in-check.v1-native \
            gopkg.in-yaml.v2-native \
           "

SRC_URI = "\
            git://${GO_IMPORT};protocol=https \
            file://gosec.sca.description \
           "
SRCREV = "a4746e18e3df52bfb21f59420d2c57cb12ef40ec"

GO_IMPORT = "github.com/securego/gosec"

inherit go
inherit native
inherit sca-description

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/gosec.sca.description ${D}${datadir}/
}

FILES_${PN} += "${datadir}"
