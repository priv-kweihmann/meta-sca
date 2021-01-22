SUMMARY = "An observatory for TLS configurations, X509 certificates, and more"
HOMEPAGE = "https://github.com/mozilla/tls-observatory"

LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=f27a50d2e878867827842f2c60e30bfc"

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "9dbb89c185c98d91307a1c596b1e399afdc84ba3"

GO_IMPORT = "github.com/mozilla/tls-observatory"

inherit go
inherit native

do_compile() {
    cd ${B}/src/${GO_IMPORT}
    oe_runmake tlsobs-scanner tlsobs-api tlsobs tlsobs-runner
    cd -
}
