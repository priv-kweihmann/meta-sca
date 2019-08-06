SUMMARY = "An observatory for TLS configurations, X509 certificates, and more"
HOMEPAGE = "https://github.com/mozilla/tls-observatory"

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "a3c1b6cfecfd7a0cf8f64c6bdc2b1e1d6a87e06c"

GO_IMPORT = "github.com/mozilla/tls-observatory"

LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM  = "file://src/${GO_IMPORT}/LICENSE;md5=f27a50d2e878867827842f2c60e30bfc"

inherit go
inherit native

do_compile() {
    cd ${B}/src/${GO_IMPORT}
    oe_runmake tlsobs-scanner tlsobs-api tlsobs tlsobs-runner
    cd -
}