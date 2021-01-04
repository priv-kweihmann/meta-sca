SUMMARY = "Leveled execution logs for Go"
HOMEPAGE = "https://github.com/kubernetes/klog"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=19cbd64715b51267a47bf3750cc6a8a5"

DEPENDS += "\
            github.com-go-logr-logr-native \
            github.com-golang-glog-native \
           "

SRC_URI = "git://github.com/kubernetes/klog.git;protocol=https"
SRCREV = "52c62e3b70a9a46101f33ebaf0b100ec55099975"

S = "${WORKDIR}/git"

GO_IMPORT = "k8s.io/klog"

inherit go
inherit native

do_compile_prepend() {
    # Some GO bug/issue prevents it from compiling
    # as we don't care about the tests of this package
    # we just delete them
    rm -rf ${B}/src/${GO_IMPORT}/integration_tests/*
}
