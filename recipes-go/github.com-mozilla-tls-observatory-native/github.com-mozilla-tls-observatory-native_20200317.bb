SUMMARY = "An observatory for TLS configurations, X509 certificates, and more"
HOMEPAGE = "https://github.com/mozilla/tls-observatory"

LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=f27a50d2e878867827842f2c60e30bfc"

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "4fa42e1c2dee78ceb2461d88221da37cf3738237"
UPSTREAM_CHECK_COMMITS = "1"

GO_IMPORT = "github.com/mozilla/tls-observatory"

inherit gonative
inherit native

do_compile() {
    cd ${B}/src/${GO_IMPORT}
    oe_runmake tlsobs-scanner tlsobs-api tlsobs tlsobs-runner
    cd -
}
