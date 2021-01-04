SUMMARY = "An observatory for TLS configurations, X509 certificates, and more"
HOMEPAGE = "https://github.com/mozilla/tls-observatory"

LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=f27a50d2e878867827842f2c60e30bfc"

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "0547674fceff5d5b7a617d4c2014ce6fded87cee"
UPSTREAM_CHECK_COMMITS = "1"

GO_IMPORT = "github.com/mozilla/tls-observatory"

inherit go
inherit native

do_compile() {
    cd ${B}/src/${GO_IMPORT}
    oe_runmake tlsobs-scanner tlsobs-api tlsobs tlsobs-runner
    cd -
}
